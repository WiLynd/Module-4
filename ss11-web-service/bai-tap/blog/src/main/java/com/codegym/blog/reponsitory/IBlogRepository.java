package com.codegym.blog.reponsitory;

import com.codegym.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    Page<Blog> findByTitleContaining(String name, Pageable page);

    Page<Blog> findAll(Pageable page);

}
