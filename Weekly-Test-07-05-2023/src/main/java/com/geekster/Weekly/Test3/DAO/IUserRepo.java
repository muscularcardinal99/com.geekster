package com.geekster.Weekly.Test3.DAO;

import com.geekster.Weekly.Test3.Model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepo extends CrudRepository<User,Integer> {
    @Query(value = "select * from users where id = :userId  ",nativeQuery = true)
    User getById(Integer userId);
}
