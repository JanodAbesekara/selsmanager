package OrderService.OrderService.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class orderDTO {
    private Long id;
    private String orderName;
    private String orderDescription;
    private double orderPrice;
    private int orderQuantity;
    private String orderDate;
}
