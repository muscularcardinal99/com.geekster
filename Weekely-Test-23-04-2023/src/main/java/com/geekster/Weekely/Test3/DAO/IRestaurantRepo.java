package com.geekster.Weekely.Test3.DAO;

import com.geekster.Weekely.Test3.Model.Restaurant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRestaurantRepo extends CrudRepository<Restaurant,Integer> {
}
