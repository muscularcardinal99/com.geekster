package com.geekster.Mapping.Practice.DAO;

import com.geekster.Mapping.Practice.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends CrudRepository<Student,String > {
}
