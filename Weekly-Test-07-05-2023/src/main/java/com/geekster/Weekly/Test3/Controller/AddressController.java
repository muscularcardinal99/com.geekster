package com.geekster.Weekly.Test3.Controller;

import com.geekster.Weekly.Test3.Model.Address;
import com.geekster.Weekly.Test3.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }
}
