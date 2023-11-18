package com.mahi.paymentservice.repository;

import com.mahi.paymentservice.entity.TransactionDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TransactionDetailsRepository extends JpaRepository<TransactionDetails,Long> {


    TransactionDetails findPaymentBypaymentId(Long paymentId);
}
