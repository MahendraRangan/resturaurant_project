package com.mahi.productcatalogservice.service;


import com.mahi.productcatalogservice.entity.Product;
import com.mahi.productcatalogservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }
    public Product findProductById(Long productId){
        Product product=productRepository.findProductByproductId(productId);
        System.out.println("Product in product service class of Product MS : "+product);
        return product;
    }
    public List<Product> findByAll(){
        return productRepository.findAll();
    }
    public void deleteProductById(Long productId){
        productRepository.deleteProductByproductId(productId);
    }

}