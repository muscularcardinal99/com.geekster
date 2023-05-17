package com.geekster.Mapping.Practice.Controller;

import com.geekster.Mapping.Practice.Model.Student;
import com.geekster.Mapping.Practice.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mapping/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @PutMapping("/updateData")
    public ResponseEntity<String> updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudents(){
        return studentService.getAll();
    }

    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable String id){
        return studentService.deleteStudent(id);
    }

}
