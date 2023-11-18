
package com.mahi.productrecommendationservice.feignClient;

import com.mahi.productrecommendationservice.response.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-catalog-service",url = "http://localhost:8812")
public interface ProductClient {

    @GetMapping("/product/{productId}")
    public Product findProductById(@PathVariable("productId") Long productId);
}


