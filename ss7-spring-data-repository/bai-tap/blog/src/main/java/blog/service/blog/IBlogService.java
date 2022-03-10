package blog.service.blog;

import blog.model.Blog;

import java.util.List;

public interface IBlogService {

    List<Blog> findAll();

    Blog findById(Long id);

    void add(Blog blog);

    void remove(Long id);

    void edit(Blog blog);

    List<Blog> search();
}
