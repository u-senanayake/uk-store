package udayanga.senanayake.ukstore.services;

import udayanga.senanayake.ukstore.model.Product;

public interface ProductService extends CrudService<Product, Long>{

    Product findByName(String lastName);
}
