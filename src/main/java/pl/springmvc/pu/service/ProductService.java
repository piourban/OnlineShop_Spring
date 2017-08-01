package pl.springmvc.pu.service;

import pl.springmvc.pu.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);

}
