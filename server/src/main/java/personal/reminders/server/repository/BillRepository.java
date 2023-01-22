package personal.reminders.server.repository;

import org.springframework.data.repository.CrudRepository;
import personal.reminders.server.model.BillDAO;

import java.util.List;

public interface BillRepository extends CrudRepository<BillDAO, Integer> {

    List<BillDAO> findByService(String service);

}