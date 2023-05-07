package com.geekster.Weekly.Test3.DAO;

import com.geekster.Weekly.Test3.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<User,Integer> {
}
