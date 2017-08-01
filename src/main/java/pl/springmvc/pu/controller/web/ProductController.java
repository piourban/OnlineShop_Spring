package pl.springmvc.pu.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.springmvc.pu.repository.ProductRepository;
import pl.springmvc.pu.service.ProductService;

/**
 * Created by Admin on 13.07.2017.
 */
@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/products")
    public String productList(Model model){
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }

    @RequestMapping(value = "/products/{category}")
    public String categoryList(Model model, @PathVariable String category){
        model.addAttribute("products", productService.getProductsByCategory(category));
        return "products";
    }
}
