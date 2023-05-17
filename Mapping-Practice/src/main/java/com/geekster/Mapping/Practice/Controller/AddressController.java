package com.geekster.Mapping.Practice.Controller;

import com.geekster.Mapping.Practice.Model.Address;
import com.geekster.Mapping.Practice.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mapping/address")
public class AddressController {
    @Autowired
    AddressService addressService;
    @GetMapping("/getAllAddress")
    public ResponseEntity<List<Address>> getAllAddress(){
        return addressService.getAll();
    }

}
