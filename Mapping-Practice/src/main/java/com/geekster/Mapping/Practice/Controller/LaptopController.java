package com.geekster.Mapping.Practice.Controller;

import com.geekster.Mapping.Practice.Model.Laptop;
import com.geekster.Mapping.Practice.Service.LaptopService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mapping/laptop")
public class LaptopController {
    @Autowired
    LaptopService laptopService;
    @GetMapping("/getLaptops")
    public ResponseEntity<List<Laptop>> getAllLaptops(){
        return laptopService.getAllLaptops();
    }
}
