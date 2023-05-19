package com.geekster.Employee.address.DAO;

import com.geekster.Employee.address.Model.Address;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Long> {
    @Query(value = "select * from address",nativeQuery = true)
    List<Address> getAll();

    @Query(value = "select * from address where id = :id",nativeQuery = true)
    Address getById(Long id);
    @Modifying
    @Query(value ="update address set city = :city where id = :id",nativeQuery = true )
    void updateCity(String city,Long id);
    @Modifying
    @Query(value ="update address set state = :state where id = :id",nativeQuery = true )
    void updateState(String state, Long id);
    @Modifying
    @Query(value ="update address set street = :street where id = :id",nativeQuery = true )
    void updateStreet(String street, Long id);
    @Modifying
    @Query(value ="update address set zip_code = :zipCode where id = :id",nativeQuery = true )
    void updateZipCode(String zipCode, Long id);
}
