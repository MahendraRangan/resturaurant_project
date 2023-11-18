package com.mahi.paymentservice.controller;

import com.mahi.paymentservice.entity.TransactionDetails;

import com.mahi.paymentservice.response.PaymentResponse;
import com.mahi.paymentservice.service.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentServiceImpl paymentService;
    @PostMapping("/")
    public TransactionDetails doPayment(@RequestBody TransactionDetails transactionDetails){
        TransactionDetails details=new TransactionDetails();
        details=paymentService.doPayment(transactionDetails);
        return details;
    }
    @GetMapping("/{id}")
    public PaymentResponse findPaymentWithUser(@PathVariable("id") Long paymentId){
        PaymentResponse paymentResponse=new PaymentResponse();
        paymentResponse=paymentService.findPaymentWithUser(paymentId);
        return paymentResponse;

    }

    }

