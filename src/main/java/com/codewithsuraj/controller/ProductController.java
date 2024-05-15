package com.codewithsuraj.controller;

import com.codewithsuraj.model.Product;
import com.codewithsuraj.service.CustomerService;
import com.codewithsuraj.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
    private ProductService productService;
    @GetMapping(value = "/fetch-all-product")
    public List<Product> getAll(){
        return productService.getAllProduct();
    }
    @GetMapping(value = "/fetch-product-by-{id}")
    public Product getProductById(@PathVariable long id){
        return productService.getProductBYId(id);
    }
    @PostMapping(value = "/save-product")
    public void saveProduct(@RequestBody Product product){
        productService.saveProduct(product);
    }
    @PutMapping(value = "/update-product-by-{id}")
    public Product updateProduct(Product product,long id){
      return   productService.updateProduct(product,id);
    }
    @DeleteMapping(value = "/delete-product-{id}")
    public void deleteProduct(long id){
        productService.deleteProduct(id);
    }
}
