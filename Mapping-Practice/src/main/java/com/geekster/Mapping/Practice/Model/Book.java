package com.geekster.Mapping.Practice.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    private String ID;

    private String title;
    private String author;
    private String description;
    private String price;

    @ManyToOne
    private Student student;

}
