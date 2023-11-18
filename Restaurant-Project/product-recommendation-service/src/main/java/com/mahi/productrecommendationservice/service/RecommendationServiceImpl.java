package com.mahi.productrecommendationservice.service;


import com.mahi.productrecommendationservice.feignClient.ProductClient;
import com.mahi.productrecommendationservice.feignClient.UserClient;
import com.mahi.productrecommendationservice.entity.Recommendation;
import com.mahi.productrecommendationservice.repository.RecommendationRepository;
import com.mahi.productrecommendationservice.response.Product;
import com.mahi.productrecommendationservice.response.ResponseRecommendation;
import com.mahi.productrecommendationservice.response.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationServiceImpl {

    @Autowired
    private RecommendationRepository recommendationRepository;
    @Autowired
    private UserClient userClient;

    @Autowired
    private ProductClient productClient;

    public  Recommendation saveRecommendation(Recommendation recommendation){
        return recommendationRepository.save(recommendation);
    }
    public ResponseRecommendation getRecommendationWithUser(Long recommendationId){
        ResponseRecommendation responseRecommendation=new ResponseRecommendation();
        Recommendation recommendation=recommendationRepository.findByrecommendationId(recommendationId);
        User user=userClient.findUserById(recommendation.getUserId());
        System.out.println("User data from User service : "+user);
        System.out.println("product Id : "+recommendation);
        System.out.println("product Id : "+recommendation.getProductId());
        Product product=productClient.findProductById(recommendation.getProductId());

        System.out.println("Product data from Product service : "+product);
        responseRecommendation.setRecommendation(recommendation);
        responseRecommendation.setProduct(product);
        responseRecommendation.setUser(user);
        return responseRecommendation;
    }
  /* public ResponseRecommendation getRecommendationWithProduct(Long recommendationId){
        ResponseRecommendation responseRecommendation=new ResponseRecommendation();
        Recommendation recommendation=recommendationRepository.findByrecommendationId(recommendationId);
        Product product=productClient.findProductById(recommendation.getProductId());
        responseRecommendation.setRecommendation(recommendation);
         responseRecommendation.setProduct(product);
        return responseRecommendation;
    }*/
}

 /*

    public Recommendation saveRecommendation(Recommendation recommendation) {
        return recommendationRepository.save(recommendation);
    }
    public List<Recommendation> getByAllRecommendation(){
        return recommendationRepository.findAll();
    }


 public    RecommendationResponse getRecommendationUser(Long id){
        Recommendation recommendation=recommendationRepository.findById(id).get();
        RecommendationResponse recommendationResponse=
    }

   *//* public ResponseDataRating getRecommendationUser(Long recommendId) {
        ResponseDataRating vo = new ResponseDataRating();
        Recommendation recommendation = recommendationRepository.findByRecommendId(recommendId);
        User user = userClient.getUserById(recommendation.getUserId());
        Product product=productClient.getProductById(recommendation.getProductId());
        vo.setRecommendation(recommendation);
        vo.setUser(user);
        vo.setProduct(product);
        return vo;
    }*//*


}









*/








