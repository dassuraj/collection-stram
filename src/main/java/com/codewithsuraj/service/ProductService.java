package com.codewithsuraj.service;

import com.codewithsuraj.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> getAllProduct();
    Product getProductBYId(long id);
    void saveProduct(Product product);
    Product updateProduct(Product product,long id);
    void deleteProduct(long id);

}
