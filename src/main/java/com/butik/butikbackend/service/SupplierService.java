package com.butik.butikbackend.service;

import com.butik.butikbackend.entity.Supplier;

import java.util.List;

public interface SupplierService {

    List<Supplier> getAllSuppliers();

    Supplier saveSupplier(Supplier supplier);
}
