package personal.reminders.server.repository;

import org.springframework.data.repository.CrudRepository;
import personal.reminders.server.model.GroceryDAO;

import java.util.List;

public interface GroceryRepository extends CrudRepository<GroceryDAO, Integer> {

    List<GroceryDAO> findByItem(String item);

}