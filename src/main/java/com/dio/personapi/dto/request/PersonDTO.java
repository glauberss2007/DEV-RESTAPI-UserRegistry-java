package com.dio.personapi.dto.request;

import com.dio.personapi.entities.Phone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;


//Auto Getters and Seters
@Data
//Clean object contstructor
@Builder
// Auto constructor insertion
@AllArgsConstructor
@NoArgsConstructor

public class PersonDTO {
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String lastName;

    @NotEmpty
    @CPF
    private String cpf;

    @NotEmpty
    private String rg;

    private LocalDate birthDate;

    @Valid
    @NotEmpty
    private List<Phone> phones;
}
