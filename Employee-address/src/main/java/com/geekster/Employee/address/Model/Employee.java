package com.geekster.Employee.address.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Pattern(regexp = "(^|\\\\s)[A-Z][a-z]*")
    private String firstName;
    @Pattern(regexp = "(^|\\\\s)[A-Z][a-z]*")
    private String lastName ;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_address_id", referencedColumnName = "id")
    private Address address;

}
