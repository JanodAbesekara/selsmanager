package OrderService.OrderService.repo;


import OrderService.OrderService.Models.orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<orders, Long> {
}
