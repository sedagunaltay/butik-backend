package com.butik.butikbackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "suppliers")
@Getter
@Setter
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;

    private String contactPerson;

    private String email;

    private String phone;

    private String address;

    @OneToMany(mappedBy = "supplier")
    private List<Product> products;
}
