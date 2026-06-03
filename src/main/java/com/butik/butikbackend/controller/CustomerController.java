package com.butik.butikbackend.controller;

import com.butik.butikbackend.mapper.CustomerMapper;
import com.butik.butikbackend.dto.CustomerDto;
import com.butik.butikbackend.entity.Customer;
import com.butik.butikbackend.service.CustomerService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping
    public Customer saveCustomer(@Valid @RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id,
                                   @RequestBody Customer customer) {
        return customerService.updateCustomer(id, customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);

    }
    @GetMapping("/dto/{id}")
    public CustomerDto getCustomerDto(@PathVariable Long id) {

        Customer customer = customerService.getCustomerById(id);

        return CustomerMapper.toDto(customer);
    }

    @GetMapping("/gender/{gender}")
    public List<Customer> getCustomersByGender(@PathVariable String gender) {
        return customerService.getCustomersByGender(gender);
    }

}
