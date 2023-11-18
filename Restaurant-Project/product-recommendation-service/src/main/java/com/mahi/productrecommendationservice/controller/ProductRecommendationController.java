package com.mahi.productrecommendationservice.controller;

import com.mahi.productrecommendationservice.entity.Recommendation;
import com.mahi.productrecommendationservice.response.ResponseRecommendation;
import com.mahi.productrecommendationservice.service.RecommendationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/recommendation")
public class ProductRecommendationController {

    @Autowired
    private RecommendationServiceImpl recommendationService;
    @PostMapping("/")
    public Recommendation saveRecommendation( @RequestBody Recommendation recommendation){
        return recommendationService.saveRecommendation(recommendation);
    }
      @GetMapping("/{id}")
      public ResponseRecommendation getRecommendationWithUser(@PathVariable("id") Long recommendationId) {
       return recommendationService.getRecommendationWithUser(recommendationId);

      }
/*     @GetMapping("/{id}")
    public ResponseRecommendation getRecommendationWithProduct( @PathVariable("id") Long recommendationId) {
        return recommendationService.getRecommendationWithProduct(recommendationId);
    }*/

    }











/*

    @Autowired
    private RecommendationServiceImpl recommendationService;
    @Autowired
    private ProductClient productClient;
    @Autowired
    private RecommendationRepository recommendationRepository;
    @PostMapping
    public Recommendation saveRecommendation(@RequestBody Recommendation recommendation){
        return recommendationService.saveRecommendation(recommendation);
    }
    @GetMapping
    public List<Recommendation> getByAllRecommendation() {
        return recommendationService.getByAllRecommendation();
    }
     @GetMapping("/{with-user}")
    public List<ResponseDataRating> getRecommendationUser(){
        return recommendationService.getRecommendationUser();
    }

    @GetMapping("/with-product")
    public List<Recommendation> getRecommendationUser() {
   return recommendationService.getByAllRecommendation();
    }

}



*/



















  /* // private RecommendationService recommendationService;

 @Autowired
    private ProductClient productClient;

    @Autowired
    private UserClient userClient;


 @PostMapping
    public ResponseEntity<String> createRecommendation(@RequestBody Recommendation recommendation) {
        // Logic to create a recommendation
        recommendationService.saveRecommendation(recommendation);
        return ResponseEntity.ok("Recommendation created successfully");
    }


    @GetMapping("/{userId}")
    public ResponseEntity<List<Recommendation>> getRecommendationsForUser(@PathVariable Long userId) {
        // Logic to get recommendations for a user
        List<Recommendation> recommendations = recommendationService.getRecommendationById(userId);
        return ResponseEntity.ok(recommendations);
    }

    @DeleteMapping("/{recommendationId}")
    public ResponseEntity<String> deleteRecommendation(@PathVariable Long recommendationId) {
        // Logic to delete a recommendation
        recommendationService.deleteRecommendation(recommendationId);
        return ResponseEntity.ok("Recommendation deleted successfully");
    }

    // Example of using @FeignClient for product-related operations
    @GetMapping("/product/{productId}")
    public ResponseEntity<Product> getProductDetails(@PathVariable Long productId) {
        // Using Feign client to get product details
        Product product = productClient.getProductById(productId);
        return ResponseEntity.ok(product);
    }

    // Example of using @FeignClient for user-related operations
    @GetMapping("/user/{userId}")
    public ResponseEntity<User> getUserDetails(@PathVariable Long userId) {
        // Using Feign client to get user details
        User user = userClient.getUserById(userId);
        return ResponseEntity.ok(user);
    }

*/
