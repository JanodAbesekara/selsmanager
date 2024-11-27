package OrderService.OrderService.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_name")
    private String orderName;

    @Column(name = "order_description")
    private String orderDescription;

    @Column(name = "order_price")
    private double orderPrice;

    @Column(name = "order_quantity")
    private int orderQuantity;

    @Column(name = "order_date", updatable = false)
    private String orderDate;


}
