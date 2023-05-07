package com.geekster.Employee.address.Controller;

import com.geekster.Employee.address.Model.Address;
import com.geekster.Employee.address.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/address")
public class AddressController {
    @Autowired
    AddressService addressService;
    @GetMapping(value = "/addresses")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }
    @GetMapping(value = "addresses/{id}")
    public Address getAddressById(@PathVariable Long id){
        return addressService.getById(id);
    }
    @PostMapping(value = "/addresses" )
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }
    @PutMapping(value = "/addresses/{id}")
    public String upDateAddressById(@PathVariable Long id,@RequestBody Address address){
        return addressService.updateByAddress(id,address);
    }
    @DeleteMapping(value = "/addresses/{id}")
    public String deleteById(@PathVariable Long id){
        return addressService.deleteById(id);
    }
}
