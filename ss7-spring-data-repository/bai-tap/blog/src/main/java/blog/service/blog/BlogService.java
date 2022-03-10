package blog.service.blog;

import blog.model.Blog;
import blog.repository.blog.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogService implements IBlogService {
    @Autowired
    IBlogRepository iBlogRepository;

    @Override
    public void add(Blog blog) {
        iBlogRepository.add(blog);
    }

    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return iBlogRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        iBlogRepository.remove(id);
    }

    @Override
    public void edit(Blog blog) {
        iBlogRepository.edit(blog);
    }

    @Override
    public List<Blog> search() {
        return iBlogRepository.search();
    }
}