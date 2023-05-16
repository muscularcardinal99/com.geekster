package com.geekster.Mapping.Practice.DAO;

import com.geekster.Mapping.Practice.Model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends CrudRepository<Course,String> {
}
