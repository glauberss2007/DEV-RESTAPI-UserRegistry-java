package com.dio.personapi.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private String cpf;
    private String rg;
    private LocalDate birthDate;
    private List<Phone> phones;

}
