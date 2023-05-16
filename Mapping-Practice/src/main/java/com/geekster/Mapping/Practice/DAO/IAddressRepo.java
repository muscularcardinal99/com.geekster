package com.geekster.Mapping.Practice.DAO;

import com.geekster.Mapping.Practice.Model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo  extends CrudRepository<Address,Long > {
}
