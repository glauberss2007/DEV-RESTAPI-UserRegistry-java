package com.dio.personapi.enums;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public enum PhoneType {
    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial"),
    FAMILY_MESSAGE_PHONE("Message");

    private final String description;
}
