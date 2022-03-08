package blog.repository;

import blog.model.Blog;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class BlogRepository implements IBlogRepository{
    @PersistenceContext
    @Override
    public List<Blog> findAdd() {
        return null;
    }

    @Override
    public Blog findById(Long id) {
        return null;
    }

    @Override
    public void add(Blog blog) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void edit(Blog blog) {

    }

    @Override
    public List<Blog> search() {
        return null;
    }
}
