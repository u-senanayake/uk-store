package udayanga.senanayake.ukstore.services.map;

import org.springframework.stereotype.Service;
import udayanga.senanayake.ukstore.model.Product;
import udayanga.senanayake.ukstore.services.CrudService;
import udayanga.senanayake.ukstore.services.ProductService;

import java.util.Set;

@Service
public class ProductServiceMap extends AbstractMapService<Product, Long> implements ProductService {
    @Override
    public Product findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Product save(Product object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Product update(Product object) {
        return null;
    }

    @Override
    public void delete(Product object) {
        super.delete(object);
    }

    @Override
    public Set<Product> findAll() {
        return super.findAll();
    }

    @Override
    public Product findByName(String lastName) {
        return null;
    }
}
