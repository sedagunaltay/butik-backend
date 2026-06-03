package com.butik.butikbackend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;
}
