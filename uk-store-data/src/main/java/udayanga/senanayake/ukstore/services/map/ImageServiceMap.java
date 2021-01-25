package udayanga.senanayake.ukstore.services.map;

import udayanga.senanayake.ukstore.model.Image;
import udayanga.senanayake.ukstore.services.CrudService;

import java.util.Set;

public class ImageServiceMap extends AbstractMapService<Image, Long> implements CrudService<Image, Long> {
    @Override
    public Image findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Image save(Image object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Image update(Image object) {
        return null;
    }

    @Override
    public void delete(Image object) {
        super.delete(object);
    }

    @Override
    public Set<Image> findAll() {
        return super.findAll();
    }
}
