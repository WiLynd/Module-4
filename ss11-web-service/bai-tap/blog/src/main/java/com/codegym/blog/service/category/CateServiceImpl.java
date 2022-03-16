package com.codegym.blog.service.category;

import com.codegym.blog.model.Category;
import com.codegym.blog.reponsitory.ICateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CateServiceImpl implements ICateService {

    @Autowired
    ICateRepository iCateRepository;

    @Override
    public List<Category> findAll() {
        return iCateRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Integer id) {
        return iCateRepository.findById(id);
    }
}
