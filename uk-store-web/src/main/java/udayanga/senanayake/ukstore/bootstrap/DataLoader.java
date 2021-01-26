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

        System.out.println("Products saved...");

    }
}
