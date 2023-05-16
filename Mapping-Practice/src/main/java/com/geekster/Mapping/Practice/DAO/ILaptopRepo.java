package com.geekster.Mapping.Practice.DAO;

import com.geekster.Mapping.Practice.Model.Laptop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends CrudRepository<Laptop,String> {
}
