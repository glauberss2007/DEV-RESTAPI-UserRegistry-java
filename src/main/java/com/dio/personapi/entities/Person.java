package com.dio.personapi.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.time.LocalDate;

//Auto Getters and Seters
@Data

//Clean object contstructor
@Builder

// Auto constructor insertion
@AllArgsConstructor
@NoArgsConstructor

// Set this class as a an entity
@Entity

public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    // Set unique to avoid cloning issues
    @Column(nullable = false, unique = true)
    private String cpf;

    // Set unique to avoid cloning issues
    @Column(nullable = false, unique = true)
    private String rg;

    private LocalDate birthDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Phone> phones;

}
