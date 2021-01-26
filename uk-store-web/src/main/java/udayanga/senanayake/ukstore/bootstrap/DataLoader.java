package udayanga.senanayake.ukstore.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import udayanga.senanayake.ukstore.model.Product;
import udayanga.senanayake.ukstore.services.ProductService;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProductService productService;

    public DataLoader(ProductService productService){
        this.productService = productService;
    }

    @Override
    public void run(String... args) throws Exception {

        Product product = new Product();
        product.setId(1L);
        product.setDescription("Test Description");
        product.setName("Product 1");
        product.setPrice(25D);
        product.setStock(12L);
        productService.save(product);

        Product product2 = new Product();
        product2.setId(2L);
        product2.setDescription("Test Description 2");
        product2.setName("Product 2");
        product2.setPrice(251D);
        product2.setStock(121L);
        productService.save(product2);

        System.out.println("Products saved...");

    }
}
