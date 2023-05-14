package com.geekster.Weekly.Test3.DAO;

import com.geekster.Weekly.Test3.Model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends CrudRepository<Product,Integer> {
    @Query(value = "Select * from product",nativeQuery = true)
    List<Product> getAlProduct();

    @Query(value = "Select * from product where category = :category",nativeQuery = true)
    List<Product> findAllByCategory(String category);
}
