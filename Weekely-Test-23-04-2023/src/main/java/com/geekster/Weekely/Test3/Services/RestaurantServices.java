package com.geekster.Weekely.Test3.Services;

import com.geekster.Weekely.Test3.DAO.IRestaurantRepo;
import com.geekster.Weekely.Test3.Model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestaurantServices {
    @Autowired
    IRestaurantRepo restaurantRepo;
    public List<Restaurant> getAll() {
        return (List<Restaurant>)  restaurantRepo.findAll();
    }

    public ResponseEntity<String> addResturante(Restaurant res) {
        HttpStatus status=null;
        String msg =null;
        try{
            restaurantRepo.save(res);
        }catch (DataAccessException e){
            msg = String.valueOf(e);
            status=HttpStatus.BAD_GATEWAY;
            return new ResponseEntity<>(msg,status);
        }
        msg="New restaurant added sucessfully";
        status=HttpStatus.OK;
        return new ResponseEntity<>(msg,status);

    }

    public ResponseEntity<String> updateData(Restaurant res, Integer id) {
        HttpStatus status=null;
        String msg ="";
        if(restaurantRepo.existsById(id)){
            restaurantRepo.save(res);
            return new ResponseEntity<>("Data updated sucessfully!!!!!! ",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Restaurant does not exist!!!!!!!",HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<String> deleteById(Integer id) {

        if(restaurantRepo.existsById(id)){
            restaurantRepo.deleteById(id);
            return new ResponseEntity<>("Deleted Sucess fully!!!!!", HttpStatus.OK);
        }else return new ResponseEntity<>("Can not find Resturante !!!!!!!!",HttpStatus.BAD_REQUEST);
    }
}
