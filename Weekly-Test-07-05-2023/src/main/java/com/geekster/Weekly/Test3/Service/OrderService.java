package com.geekster.Weekly.Test3.Service;

import com.geekster.Weekly.Test3.DAO.IAddressRepo;
import com.geekster.Weekly.Test3.DAO.IOrderRepo;
import com.geekster.Weekly.Test3.DAO.IProductRepo;
import com.geekster.Weekly.Test3.DAO.IUserRepo;
import com.geekster.Weekly.Test3.Model.Address;
import com.geekster.Weekly.Test3.Model.Order;
import com.geekster.Weekly.Test3.Model.Product;
import com.geekster.Weekly.Test3.Model.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class OrderService {
    @Autowired
    IOrderRepo orderRepo;
    @Autowired
    IUserRepo userRepo;
    @Autowired
    IProductRepo productRepo;
    @Autowired
    IAddressRepo addressRepo;

    public String createOrder(Order order, Integer userId, Integer productId, Integer addressId) {
        String res=null;
        if(userRepo.existsById(userId)){
            Iterable<Order> orderList =orderRepo.findAll();
            for(Order prevOrders: orderList){
                if(prevOrders.getUser().getId().equals(userId) && prevOrders.getProduct().getId().equals(productId) && prevOrders.getAddress().getId().equals(addressId)){
                    return "already exist";
                }
            }
            User userNewOrder =userRepo.findById(userId).get();
            Product userNewProd = productRepo.findById(productId).get();
            Address userAddress =  addressRepo.findById(addressId).get();

            order.setUser(userNewOrder);
            order.setAddress(userAddress);
            order.setProduct(userNewProd);

            orderRepo.save(order);

            res= order.getUser().getName();



        }
        return res;

    }

    public Order getOrderById(Integer orderId) {
        return orderRepo.findById(orderId).get();
    }
}
