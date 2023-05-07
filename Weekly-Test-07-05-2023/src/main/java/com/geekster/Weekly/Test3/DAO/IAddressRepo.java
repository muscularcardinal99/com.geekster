package com.geekster.Weekly.Test3.DAO;

import com.geekster.Weekly.Test3.Model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Integer> {
}
