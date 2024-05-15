package com.codewithsuraj.service.serviceImpl;

import com.codewithsuraj.model.Product;
import com.codewithsuraj.repository.ProductRepository;
import com.codewithsuraj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductBYId(long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product, long id) {
        boolean isExist=productRepository.existsById(id);
        if (isExist){
            Product product1=productRepository.findById(id).get();
            product1.setName(product.getName());
            product1.setPrice(product.getPrice());
            product1.setCategory(product.getCategory());
            product1.setQuantity(product.getQuantity());
            product1.setManufactureDate(product.getManufactureDate());
            product1.setExpiryDate(product.getExpiryDate());
            return productRepository.save(product1);

        }
        return null;
    }

    @Override
    public void deleteProduct(long id) {
        productRepository.deleteById(id);
    }
}
