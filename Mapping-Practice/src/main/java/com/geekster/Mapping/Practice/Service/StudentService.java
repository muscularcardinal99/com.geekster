package com.geekster.Mapping.Practice.Service;

import com.geekster.Mapping.Practice.DAO.IStudentRepo;
import com.geekster.Mapping.Practice.Model.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;
    public ResponseEntity<String> addStudent(Student student) {
        HttpStatus status= null;
        String msg ="";

        if(studentRepo.existsById(student.getId())){
            status = HttpStatus.BAD_REQUEST;
            msg = "Student data Already Exists!";
        }else{
            studentRepo.save(student);
            status = HttpStatus.OK;
            msg = "Student Data added sucessfully";
        }

        return new ResponseEntity<>(msg , status);

    }

    public ResponseEntity<String> updateStudent(Student student) {
        HttpStatus status = null;
        String msg ="";
        if(studentRepo.existsById(student.getId())){
            studentRepo.save(student);
            status = HttpStatus.OK;
            msg ="Student Data Updated Sucessfully";
        }else {
            status = HttpStatus.BAD_REQUEST;
            msg ="Please enter correct ID";
        }
        return new ResponseEntity<>(msg, status);
    }

    public ResponseEntity<List<Student>> getAll() {
        List<Student> students = (List<Student>) studentRepo.findAll();
        HttpStatus status= null;
        if(students.isEmpty()){
            status= HttpStatus.NO_CONTENT;
        }else status = HttpStatus.OK;
        return new ResponseEntity<>(students,status);
    }
}
