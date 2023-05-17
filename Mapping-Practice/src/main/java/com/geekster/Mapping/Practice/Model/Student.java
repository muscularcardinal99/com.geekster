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

    @OneToOne(cascade = CascadeType.ALL)
//            (mappedBy = "student", cascade = CascadeType.ALL)
    private Address address;
    @OneToOne
//            (cascade = CascadeType.ALL)
            (mappedBy = "student", cascade = CascadeType.ALL)
    private Laptop laptop;

    @OneToMany
//            (cascade = CascadeType.ALL)
            (mappedBy = "student",cascade = CascadeType.ALL)
    private List<Book> bookList;

    @ManyToMany(cascade = CascadeType.PERSIST)
//            (mappedBy = "studentList", cascade = CascadeType.ALL)
    List<Course> courses;

}
