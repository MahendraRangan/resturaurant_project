package com.mahi.productrecommendationservice.response;

import com.mahi.productrecommendationservice.entity.Recommendation;

public class ResponseRecommendation {
    private Recommendation recommendation;

    private User user;

    private Product product;

    public ResponseRecommendation() {
    }

    public ResponseRecommendation(Recommendation recommendation, User user,Product product) {
        this.recommendation = recommendation;
        this.user = user;
        this.product=product;
    }

    public Recommendation getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(Recommendation recommendation) {
        this.recommendation = recommendation;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ResponseRecommendation{" +
                "recommendation=" + recommendation +
                ", user=" + user +
                ", product=" + product +
                '}';
    }
}
