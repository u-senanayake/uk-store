package udayanga.senanayake.ukstore.services.map;

import org.springframework.stereotype.Service;
import udayanga.senanayake.ukstore.model.Supplier;
import udayanga.senanayake.ukstore.services.CrudService;

import java.util.Set;

@Service
public class SupplierServiceMap extends AbstractMapService<Supplier, Long> implements CrudService<Supplier, Long> {
    @Override
    public Supplier findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Supplier save(Supplier object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Supplier update(Supplier object) {
        return null;
    }

    @Override
    public void delete(Supplier object) {
        super.delete(object);
    }

    @Override
    public Set<Supplier> findAll() {
        return super.findAll();
    }
}
