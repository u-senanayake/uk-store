package udayanga.senanayake.ukstore.services.map;

import udayanga.senanayake.ukstore.model.Product;
import udayanga.senanayake.ukstore.services.CrudService;

import java.util.Set;

public class ProductServiceMap extends AbstractMapService<Product, Long> implements CrudService<Product, Long> {
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
}
