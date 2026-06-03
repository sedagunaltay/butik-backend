package com.butik.butikbackend.entity;

import com.butik.butikbackend.entity.Customer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "customers")
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First name boş olamaz")
    private String firstName;

    @NotBlank(message = "Last name boş olamaz")
    private String lastName;

    @Email(message = "Geçerli bir email giriniz")
    @NotBlank(message = "Email boş olamaz")
    @Column(unique = true)
    private String email;

    @NotBlank(message = "Telefon boş olamaz")
    private String phone;

    @NotBlank(message = "Cinsiyet boş olamaz")
    private String gender;
}
