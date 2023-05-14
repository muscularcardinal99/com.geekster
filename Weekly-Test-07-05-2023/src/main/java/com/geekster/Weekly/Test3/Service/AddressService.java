package com.geekster.Weekly.Test3.Service;

import com.geekster.Weekly.Test3.DAO.IAddressRepo;
import com.geekster.Weekly.Test3.Model.Address;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;
    public String addAddress(Address address) {
        addressRepo.save(address);
        return "new address added successfully!!!!!!";
    }
}
