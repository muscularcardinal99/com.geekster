package com.geekster.Weekely.Test3.Controller;

import com.geekster.Weekely.Test3.Model.Restaurant;
import com.geekster.Weekely.Test3.Services.RestaurantServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
    @Autowired
    RestaurantServices restaurantServices;

    @GetMapping("/get")
    public ResponseEntity<List<Restaurant>> getAllResturante(){
        List<Restaurant> res = restaurantServices.getAll();
        if(res.isEmpty()){
            return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
        }else return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<String> addRes(@RequestBody Restaurant res){
        return restaurantServices.addResturante(res);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateRes(@RequestBody Restaurant res,@PathVariable Integer id){
        return restaurantServices.updateData(res,id);
    }
}
