package com.codegym.blog.service.category;

import com.codegym.blog.model.Category;

import java.util.List;
import java.util.Optional;


public interface ICateService {

    List<Category> findAll();

    Optional<Category> findById(Integer id);
}
