package com.geekster.Mapping.Practice.Controller;

import com.geekster.Mapping.Practice.Model.Course;
import com.geekster.Mapping.Practice.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mapping/book")
public class CourseController {
    @Autowired
    CourseService courseService;
    @GetMapping("/getall")
    public ResponseEntity<List<Course>> getAllCourse(){
        return courseService.getAll();
    }
}
