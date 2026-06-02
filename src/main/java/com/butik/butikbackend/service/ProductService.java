package com.butik.butikbackend.service;

import com.butik.butikbackend.entity.Product;
import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product saveProduct(Product product);
}
