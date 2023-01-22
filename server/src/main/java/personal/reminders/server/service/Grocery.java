package personal.reminders.server.service;

import com.google.protobuf.Empty;
import personal.reminders.server.proto.GroceryRequest;
import personal.reminders.server.proto.GroceryResponse;
import personal.reminders.server.proto.ListGroceriesResponse;
import personal.reminders.server.proto.GroceryGrpc;
import personal.reminders.server.proto.GroceryProto;

import java.util.ArrayList;
import java.util.List;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import personal.reminders.server.repository.GroceryRepository;
import personal.reminders.server.model.GroceryDAO;

@GrpcService
public class Grocery extends GroceryGrpc.GroceryImplBase {

  private final GroceryRepository repository;

  public Grocery(GroceryRepository repository) {
    this.repository = repository;
  }

  @Override
  public void setGrocery(GroceryRequest req, StreamObserver<GroceryResponse> responseObserver) {

    String message = "[Not Saved]";
    try {
      GroceryDAO grocery = new GroceryDAO();
      grocery.setItem(req.getItem());
      grocery.setShopURL(req.getShopURL());
      repository.save(grocery);

      message = String.format("[Saved] %s, %s", req.getItem(), req.getShopURL());
    } catch (Exception e) {
      e.printStackTrace();
    }

    GroceryResponse Response = GroceryResponse.newBuilder().setMessage(message).build();
    responseObserver.onNext(Response);
    responseObserver.onCompleted();
  }

  @Override
  public void listGroceries(Empty emptyReq, StreamObserver<ListGroceriesResponse> responseObserver) {

    List<GroceryProto> groceries = new ArrayList<GroceryProto>();

    repository.findAll().forEach(grocery -> groceries
        .add(GroceryProto.newBuilder()
            .setId(grocery.getId())
            .setItem(grocery.getItem())
            .setShopURL(grocery.getShopURL())
            .build()));

    ListGroceriesResponse Response = ListGroceriesResponse.newBuilder().addAllGroceries(groceries).build();
    responseObserver.onNext(Response);
    responseObserver.onCompleted();
  }

}
