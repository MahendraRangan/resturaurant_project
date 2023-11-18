package com.mahi.paymentservice.service;

import com.mahi.paymentservice.entity.TransactionDetails;
import com.mahi.paymentservice.fegienClient.UserClient;
import com.mahi.paymentservice.repository.TransactionDetailsRepository;
import com.mahi.paymentservice.response.PaymentResponse;
import com.mahi.paymentservice.response.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl {

    @Autowired
    private TransactionDetailsRepository transactionDetailsRepository;

    @Autowired
    private UserClient userClient;

    public TransactionDetails doPayment(TransactionDetails transactionDetails){

        return  transactionDetailsRepository.save(transactionDetails);
    }

public PaymentResponse findPaymentWithUser(Long paymentId){
        PaymentResponse paymentResponse=new PaymentResponse();
        TransactionDetails details=transactionDetailsRepository.findPaymentBypaymentId(paymentId);
    User user=userClient.findUserById(details.getUserId());
    System.out.println("User data from User service : "+user);
    System.out.println("PAYMENT Id : "+details);
    System.out.println("payment Id : "+details.getPaymentId());
    paymentResponse.setTransactionDetails(details);
    paymentResponse.setUser(user);
    return paymentResponse;
}

}











































/*

import com.mahi.paymentservice.entity.TransactionDetails;
import com.mahi.paymentservice.repository.TransactionDetailsRepository;
import com.mahi.paymentservice.resopnse.PaymentMode;
import com.mahi.paymentservice.resopnse.PaymentRequest;
import com.mahi.paymentservice.resopnse.PaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;


@Service
public class PaymentServiceImpl {

    @Autowired
    private TransactionDetailsRepository transactionDetailsRepository;
    public long doPayment(PaymentRequest paymentRequest) {

       // log.info("PaymentServiceImpl | doPayment is called");

       // log.info("PaymentServiceImpl | doPayment | Recording Payment Details: {}", paymentRequest);

        TransactionDetails transactionDetails
                = TransactionDetails.builder()
                .paymentDate(Instant.now())
                .paymentMode(PaymentMode.valueOf(paymentRequest.getPaymentMode().name()))
                .paymentStatus("SUCCESS")
                .orderId(paymentRequest.getOrderId())
                .referenceNumber(paymentRequest.getReferenceNumber())
                .amount(paymentRequest.getAmount())
                .build();

        transactionDetails = transactionDetailsRepository.save(transactionDetails);

     //   log.info("Transaction Completed with Id: {}", transactionDetails.getId());

        return transactionDetails.getId();
    }

    public PaymentResponse getPaymentDetailsByOrderId(long orderId) {

        //log.info("PaymentServiceImpl | getPaymentDetailsByOrderId is called");

        //log.info("PaymentServiceImpl | getPaymentDetailsByOrderId | Getting payment details for the Order Id: {}", orderId);

        TransactionDetails transactionDetails
                = transactionDetailsRepository.findByOrderId(orderId)
                .orElseThrow(() -> new PaymentServiceCustomException(
                        "TransactionDetails with given id not found",
                        "TRANSACTION_NOT_FOUND"));

        PaymentResponse paymentResponse
                =PaymentResponse.builder()
                .paymentId(transactionDetails.getId())
                .paymentMode(PaymentMode.valueOf(transactionDetails.getPaymentMode()))
                .paymentDate(transactionDetails.getPaymentDate())
                .orderId(transactionDetails.getOrderId())
                .status(transactionDetails.getPaymentStatus())
                .amount(transactionDetails.getAmount())
                .build();

     //   log.info("PaymentServiceImpl | getPaymentDetailsByOrderId | paymentResponse: {}", paymentResponse.toString());

        return paymentResponse;
    }
}

*/
