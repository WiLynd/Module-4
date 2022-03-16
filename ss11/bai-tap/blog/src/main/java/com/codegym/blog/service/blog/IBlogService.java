package com.codegym.blog.service.blog;

import com.codegym.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBlogService {

    Optional<Blog> findById(Integer id);

    void delete(Integer id);

    void save(Blog blog);

    List<Blog> findByTitleContaining(String name, Pageable pageable);

    Page<Blog> findAll(Pageable page);

    List<Blog> findAll();
}
