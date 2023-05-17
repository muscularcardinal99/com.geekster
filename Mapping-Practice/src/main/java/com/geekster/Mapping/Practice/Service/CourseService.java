package com.geekster.Mapping.Practice.Service;

import com.geekster.Mapping.Practice.DAO.ICourseRepo;
import com.geekster.Mapping.Practice.Model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService {
    @Autowired
    ICourseRepo courseRepo;
    public ResponseEntity<List<Course>> getAll() {
        HttpStatus status=null;

        List<Course> courses= (List<Course>) courseRepo.findAll();
        if(courses.isEmpty()){
            status=HttpStatus.NO_CONTENT;
            return new ResponseEntity<>(null,status);
        }
        status=HttpStatus.OK;
        return new ResponseEntity<>(courses,status);
    }
}
