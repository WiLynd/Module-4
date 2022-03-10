package blog.repository;

import blog.model.Blog;

import java.util.List;

public interface IBlogRepository {

    List<Blog> findAll();

    Blog findById(Long id);

    void add(Blog blog);

    void remove(Long id);

    void edit(Blog blog);

    List<Blog> search();
}