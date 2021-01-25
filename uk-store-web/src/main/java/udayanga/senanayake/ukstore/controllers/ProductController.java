package udayanga.senanayake.ukstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("products")
@Controller
public class ProductController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String index() {
        return "products/product";
    }
}
