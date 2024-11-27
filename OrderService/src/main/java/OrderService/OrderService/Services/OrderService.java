package OrderService.OrderService.Services;


import OrderService.OrderService.DTO.orderDTO;
import OrderService.OrderService.Models.orders;
import OrderService.OrderService.repo.OrderRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private ModelMapper modelMapper;

    public orderDTO addtodatabse(orderDTO orderdto) {
     orderRepo.save(modelMapper.map(orderdto, orders.class));
        return orderdto;
    }

    public List<orderDTO> getallorders(){
        List<orders>ordersList = orderRepo.findAll();
        return modelMapper.map(ordersList,  new TypeToken<List<orderDTO>>(){}.getType());
    }
    public orderDTO getuniqueuser(Long id){

        if(id == null){
                throw new RuntimeException("Id is null");
        }else{
            Optional<orders> optionalOrders = orderRepo.findById(id);
            if (optionalOrders.isEmpty()) {
                throw new RuntimeException("Order not found for id: " + id);
            }
            return modelMapper.map(optionalOrders.get(), orderDTO.class);
        }


    }

    public orderDTO deleteorder(Long id){
        if(id == null){
            throw new RuntimeException("Id is null");
        }
        else{
            Optional<orders> optionalOrders = orderRepo.findById(id);
            if (optionalOrders.isEmpty()) {
                throw new RuntimeException("Order not found for id: " + id);
            }
            orderRepo.deleteById(id);
            return modelMapper.map(optionalOrders.get(), orderDTO.class);
        }
    }


}
