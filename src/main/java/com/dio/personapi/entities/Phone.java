package com.dio.personapi.entities;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import com.dio.personapi.enums.PhoneType;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Phone {
    private Long id;
    private PhoneType type;
    private String number;
}

