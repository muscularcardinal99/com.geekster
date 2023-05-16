package com.geekster.Mapping.Practice.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Laptops")
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ID;
    private String name;
    private String brand;
    private Integer price;

    @OneToOne
    private Student student;
}
