package com.geekster.Weekly.Test3.DAO;

import com.geekster.Weekly.Test3.Model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends CrudRepository<Order,Integer> {
}
