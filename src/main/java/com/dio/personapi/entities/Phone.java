package com.dio.personapi.entities;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import com.dio.personapi.enums.PhoneType;

import javax.persistence.*;

//Auto Getters and Seters
@Data

//Clean object contstructor
@Builder

// Auto constructor insertion
@AllArgsConstructor
@NoArgsConstructor

// Set this class as a an entity
@Entity

public class Phone {
    // Autoincrement ID on DB related table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Set type and data requirement
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    // Set data requirement
    @Column(nullable = false)
    private String number;
}

