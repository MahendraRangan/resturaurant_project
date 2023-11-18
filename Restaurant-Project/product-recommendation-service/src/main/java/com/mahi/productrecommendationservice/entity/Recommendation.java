package com.mahi.productrecommendationservice.entity;


import jakarta.persistence.*;

@Entity
public class Recommendation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recommendationId;
    private int rating;
     private Long productId;

    private Long userId;

    public Recommendation() {

    }

    public Recommendation(Long recommendationId, int rating, Long userId,Long productId) {
        this.recommendationId = recommendationId;
        this.rating = rating;
        this.userId = userId;
        this.productId=productId;
    }

    public Long getRecommendationId() {
        return recommendationId;
    }

    public void setRecommendationId(Long recommendationId) {
        this.recommendationId = recommendationId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Recommendation{" +
                "recommendationId=" + recommendationId +
                ", rating=" + rating +
                ", productId=" + productId +
                ", userId=" + userId +
                '}';
    }
}