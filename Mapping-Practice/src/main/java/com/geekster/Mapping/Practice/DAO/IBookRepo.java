package com.geekster.Mapping.Practice.DAO;

import com.geekster.Mapping.Practice.Model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends CrudRepository<Book,String> {
}
