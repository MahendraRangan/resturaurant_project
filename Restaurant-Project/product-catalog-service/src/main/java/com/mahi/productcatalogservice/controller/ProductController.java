package com.mahi.productcatalogservice.controller;

import com.mahi.productcatalogservice.entity.Product;
import com.mahi.productcatalogservice.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable("id") Long productId){
       Product product= productService.findProductById(productId);
        System.out.println("Product in product service : "+product);
        return product;

    }
    @GetMapping("/")
    public List<Product> findAllProduct(){
        return productService.findByAll();
    }


   /* @GetMapping("/product/{name}")
    public List<Product> getAllProductsByName(@PathVariable("name") String name){
        return productService.getAllProductsByName(name);
    }
    @GetMapping("/product/{category}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Product> getAllProductByCategory(@PathVariable("category") String category){
        return productService.getAllProductByCategory(category);
    }*/
}
