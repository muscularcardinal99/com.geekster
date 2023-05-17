package com.geekster.Mapping.Practice.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "Students")
@NoArgsConstructor
@AllArgsConstructor

public class Student {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Address address;
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Laptop laptop;

    @OneToMany(mappedBy = "student",cascade = CascadeType.PERSIST)
    private List<Book> bookList;

    @ManyToMany(mappedBy = "studentList", cascade = CascadeType.PERSIST)
    List<Course> courses;

}
