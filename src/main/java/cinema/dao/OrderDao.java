package cinema.dao;

import cinema.model.Order;
import cinema.model.User;
import java.util.List;

public interface OrderDao {
    Order add(Order order);

    Order getByUser(User user);

    List<Order> getAllByUser(User user);
}
