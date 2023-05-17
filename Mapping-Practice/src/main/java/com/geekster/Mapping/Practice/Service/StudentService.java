package com.geekster.Mapping.Practice.Service;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.geekster.Mapping.Practice.DAO.IStudentRepo;
import com.geekster.Mapping.Practice.Model.Book;
import com.geekster.Mapping.Practice.Model.Course;
import com.geekster.Mapping.Practice.Model.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//@JsonIdentityInfo(generator = Object)
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;
    public ResponseEntity<String> addStudent(Student student) {
        HttpStatus status= null;
        String msg ="";
        studentRepo.save(student);
//        List<Student> studentList=new ArrayList<>();
//        studentList.add(student);
//        student.getAddress().setStudent(student);
//        List<Book> bookList =  student.getBookList();
//        for (Book B: bookList){B.setStudent(student);}
//        student.getLaptop().setStudent(student);

//        List<Course> corList =student.getCourses();
//        for(Course c:corList){c.setStudentList((List<Student>) studentList.get(0));}

//        if(studentRepo.existsById(student.getId())){
//            status = HttpStatus.BAD_REQUEST;
//            msg = "Student data Already Exists!";
//        }else{
//            studentRepo.save(student);
//            status = HttpStatus.OK;
//            msg = "Student Data added sucessfully";
//        }

        return new ResponseEntity<>(msg , HttpStatus.OK);

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

    public ResponseEntity<String> deleteStudent(String id) {
        HttpStatus status=null;
        String msg = "";
        if(studentRepo.existsById(id)){
            studentRepo.deleteById(id);
            msg="Student Deleted successfully" ;
            status =HttpStatus.OK;
        }else {
            msg ="Student DoesNot Exists";
            status =HttpStatus.BAD_REQUEST;
        }
        return new ResponseEntity<>(msg,status);
    }
}
