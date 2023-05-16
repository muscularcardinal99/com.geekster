package com.geekster.Mapping.Practice.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Students")
@NoArgsConstructor
@AllArgsConstructor

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;

    @OneToOne
    private Address address;
}
