package udayanga.senanayake.ukstore.services;

import java.util.Set;

public interface CrudService <T, ID>{

    T findById(ID id);

    T save(T object);

    T update(T object);

    void delete(T object);

    Set<T> findAll();
}
