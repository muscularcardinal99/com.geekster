package com.geekster.Employee.address.Service;

import com.geekster.Employee.address.DAO.IAddressRepo;
import com.geekster.Employee.address.Model.Address;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;
    public List<Address> getAllAddress() {
        return addressRepo.getAll();
    }

    public Address getById(Long id) {
       return addressRepo.getById(id);
    }

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "New Address added Successfully!!!!!!!";
    }

    public String updateByAddress(Long id, Address address) {
        if(!addressRepo.existsById(id)){
            return "Address with id : "+id+" does not Exist!!!!!!!";
        }
        if(address.getCity()!=null){
            addressRepo.updateCity(address.getCity(), id);
            return "City updated successfully!!!!!!!!";
        }else if(!address.getCity().equals("")){
            addressRepo.updateCity(address.getCity(), id);
            return "City updated successfully!!!!!!!!";
        }
        if(address.getState()!=null){
            addressRepo.updateState(address.getState(), id);
            return "State updated successfully!!!!!!!!";
        }else if(!address.getState().equals("")){
            addressRepo.updateState(address.getState(), id);
            return "State updated successfully!!!!!!!!";
        }
        if(address.getStreet()!=null){
            addressRepo.updateStreet(address.getStreet(), id);
            return "Street updated successfully!!!!!!!!";
        }else if(!address.getStreet().equals("")){
            addressRepo.updateStreet(address.getStreet(), id);
            return "Street updated successfully!!!!!!!!";
        }
        if(address.getZipCode()!=null){
            addressRepo.updateZipCode(address.getZipCode(), id);
            return "ZipCode updated successfully!!!!!!!!";
        }else if(!address.getZipCode().equals("")){
            addressRepo.updateZipCode(address.getZipCode(), id);
            return "ZipCode updated successfully!!!!!!!!";
        }
        
        return "pleas enter valid changes";

    }

    public String deleteById(Long id) {
        if(id==null){return "Pleas enter valid ID and try Again";}
        if(!addressRepo.existsById(id)){
            return "Address with id : "+id+" does not Exist!!!!!!!";
        }
        addressRepo.deleteById(id);
        return "Data deleted for Address where id is  "+id+" ,successfully!!!!!!!";
    }
}
