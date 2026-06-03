package com.butik.butikbackend.service;

import com.butik.butikbackend.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategories();

    Category saveCategory(Category category);
}
