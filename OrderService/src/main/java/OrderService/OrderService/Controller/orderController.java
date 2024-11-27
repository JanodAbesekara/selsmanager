package OrderService.OrderService.Controller;

import OrderService.OrderService.DTO.orderDTO;
import OrderService.OrderService.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/V1/order")
public class orderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/addOrdes")
    public orderDTO addorders(@RequestBody orderDTO orderDTO) {
        return orderService.addtodatabse(orderDTO);
    }

    @GetMapping("/GetallOrders")
    public List<orderDTO> getallorders(){
        return  orderService.getallorders();
    }

    @GetMapping("/getUnique")
    public orderDTO getunique(@RequestParam Long id){
        return  orderService.getuniqueuser(id);
    }
    
    @DeleteMapping("/DeltebyID")
    public orderDTO deletebyID(@RequestParam Long id){
        return orderService.deleteorder(id);
    }

  
}
