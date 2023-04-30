package com.geekster.Weekly.Test3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private String location;
    private Double salary;
    @Column(unique = true)
    private String companyName;
    private String employerName;
    @Enumerated(EnumType.STRING)
    private JobType jobType;
    private LocalDate appliedDate;
}
