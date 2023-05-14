package com.geekster.Weekly.Test3.Controller;

import com.geekster.Weekly.Test3.DAO.IAddressRepo;
import com.geekster.Weekly.Test3.DAO.IProductRepo;
import com.geekster.Weekly.Test3.Model.Order;
import com.geekster.Weekly.Test3.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("/addOrder")
    public ResponseEntity<String> createOrder(@RequestBody Order order, @RequestParam Integer userId,@RequestParam Integer productId,@RequestParam Integer addressId){
        String newOrder =orderService.createOrder(order,userId,productId,addressId);
        if(newOrder !=null){
            if(newOrder.equals("already exist")){
                return new ResponseEntity<>("Order Placed", HttpStatus.BAD_REQUEST);
            }
            return new ResponseEntity<>(newOrder + "Order placed Sucessfully",HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Invalid Order type!!!!",HttpStatus.BAD_REQUEST);
    }
    @GetMapping("/getOrderById")
    public Order getOderById(@RequestParam Integer orderId){
        return orderService.getOrderById(orderId);
    }

}
