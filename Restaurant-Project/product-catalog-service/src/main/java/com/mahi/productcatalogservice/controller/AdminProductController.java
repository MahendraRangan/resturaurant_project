package com.mahi.productcatalogservice.controller;


import com.mahi.productcatalogservice.entity.Product;
import com.mahi.productcatalogservice.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminProductController  {

    @Autowired
    private ProductServiceImpl productService;
    @PostMapping("/")
   public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable("id") Long productId){
         productService.deleteProductById(productId);
         return "Successfully";

    }

}
