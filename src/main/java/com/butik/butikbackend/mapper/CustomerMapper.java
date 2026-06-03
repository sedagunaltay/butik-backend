package com.butik.butikbackend.mapper;

import com.butik.butikbackend.dto.CustomerDto;
import com.butik.butikbackend.entity.Customer;

public class CustomerMapper {

    public static CustomerDto toDto(Customer customer) {

        CustomerDto dto = new CustomerDto();

        dto.setId(customer.getId());
        dto.setFirstName(customer.getFirstName());
        dto.setLastName(customer.getLastName());
        dto.setEmail(customer.getEmail());

        return dto;
    }
}
