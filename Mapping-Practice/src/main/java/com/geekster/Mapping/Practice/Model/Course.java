package com.geekster.Mapping.Practice.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    private String ID;
    private String title;
    private String description;
    private String duration;

//    @ManyToMany
//    @JoinColumn(name = "student_id")
//    List<Student> studentList;

}
