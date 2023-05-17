package com.geekster.Mapping.Practice.Service;

import com.geekster.Mapping.Practice.DAO.ILaptopRepo;
import com.geekster.Mapping.Practice.Model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LaptopService {
    @Autowired
    ILaptopRepo laptopRepo;
    public ResponseEntity<List<Laptop>> getAllLaptops() {
        HttpStatus status=null;
        List<Laptop> laptopList = (List<Laptop>) laptopRepo.findAll();
        if(laptopList.isEmpty()){
           status=HttpStatus.NO_CONTENT;
            return new ResponseEntity<>(null,status);
        }
        status = HttpStatus.OK;
        return new ResponseEntity<>(laptopList,status);
    }
}
