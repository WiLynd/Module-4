package com.codegym.blog.reponsitory;

import com.codegym.blog.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICateRepository extends JpaRepository<Category,Integer> {
}
