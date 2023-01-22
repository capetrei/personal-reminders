package personal.reminders.server.service;

import com.google.protobuf.Empty;
import personal.reminders.server.proto.BillRequest;
import personal.reminders.server.proto.BillResponse;
import personal.reminders.server.proto.ListBillsResponse;
import personal.reminders.server.proto.BillGrpc;
import personal.reminders.server.proto.BillProto;

import java.util.ArrayList;
import java.util.List;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import personal.reminders.server.repository.BillRepository;
import personal.reminders.server.model.BillDAO;

@GrpcService
public class Bill extends BillGrpc.BillImplBase {

    private final BillRepository repository;

    public Bill(BillRepository repository) {
        this.repository = repository;
    }

    @Override
    public void setBill(BillRequest req, StreamObserver<BillResponse> responseObserver) {

        String message = "[Not Saved]";
        try {
            BillDAO bill = new BillDAO();
            bill.setService(req.getService());
            bill.setProviderURL(req.getProviderURL());
            repository.save(bill);

            message = String.format("[Saved] %s, %s", req.getService(), req.getProviderURL());
        } catch (Exception e) {
            e.printStackTrace();
        }

        BillResponse Response = BillResponse.newBuilder().setMessage(message).build();
        responseObserver.onNext(Response);
        responseObserver.onCompleted();
    }

    @Override
    public void listBills(Empty emptyReq, StreamObserver<ListBillsResponse> responseObserver) {

        List<BillProto> bills = new ArrayList<BillProto>();

        repository.findAll().forEach(bill -> bills
                .add(BillProto.newBuilder()
                        .setId(bill.getId())
                        .setService(bill.getService())
                        .setProviderURL(bill.getProviderURL())
                        .build()));

        ListBillsResponse Response = ListBillsResponse.newBuilder().addAllBills(bills).build();
        responseObserver.onNext(Response);
        responseObserver.onCompleted();
    }

}