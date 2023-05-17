package com.geekster.Mapping.Practice.Service;

import com.geekster.Mapping.Practice.DAO.IAddressRepo;
import com.geekster.Mapping.Practice.Model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;
    public ResponseEntity<List<Address>> getAll() {
        HttpStatus status=null;
        List<Address> addressList= (List<Address>) addressRepo.findAll();
        if(addressList.isEmpty()){
            status= HttpStatus.NO_CONTENT;
            return new ResponseEntity<>(null,status);
        }
        status=HttpStatus.OK;
        return new ResponseEntity<>(addressList,status);
    }
}
