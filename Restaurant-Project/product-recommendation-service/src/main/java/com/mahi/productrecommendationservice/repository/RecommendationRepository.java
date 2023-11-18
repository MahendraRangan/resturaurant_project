package com.mahi.productrecommendationservice.repository;

import com.mahi.productrecommendationservice.entity.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendationRepository extends JpaRepository<Recommendation ,Long> {



    Recommendation findByrecommendationId(Long recommendationId);
}
