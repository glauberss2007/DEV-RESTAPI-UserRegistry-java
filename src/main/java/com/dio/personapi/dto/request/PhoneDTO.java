package com.dio.personapi.dto.request;

import com.dio.personapi.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


//Auto Getters and Seters
@Data
//Clean object contstructor
@Builder
// Auto constructor insertion
@AllArgsConstructor
@NoArgsConstructor

public class PhoneDTO {
    private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @NotEmpty
    @Size(min = 13, max = 14)
    private String number;
}

