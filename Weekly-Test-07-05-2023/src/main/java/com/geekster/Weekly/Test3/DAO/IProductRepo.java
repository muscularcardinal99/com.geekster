package com.geekster.Weekly.Test3.DAO;

import com.geekster.Weekly.Test3.Model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepo extends CrudRepository<Product,Integer> {
}
