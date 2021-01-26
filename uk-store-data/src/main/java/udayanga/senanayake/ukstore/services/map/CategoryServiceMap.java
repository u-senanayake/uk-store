package udayanga.senanayake.ukstore.services.map;

import org.springframework.stereotype.Service;
import udayanga.senanayake.ukstore.model.Category;
import udayanga.senanayake.ukstore.services.CategoryService;
import udayanga.senanayake.ukstore.services.CrudService;

import java.util.Set;

@Service
public class CategoryServiceMap extends AbstractMapService<Category, Long> implements CategoryService {
    @Override
    public Category findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Category save(Category object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Category update(Category object) {
        return null;
    }

    @Override
    public void delete(Category object) {
        super.delete(object);
    }

    @Override
    public Set<Category> findAll() {
        return super.findAll();
    }
}
