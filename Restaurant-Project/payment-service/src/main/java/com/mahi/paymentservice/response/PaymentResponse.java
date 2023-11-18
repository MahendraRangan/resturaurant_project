package com.mahi.paymentservice.response;

import com.mahi.paymentservice.entity.TransactionDetails;

public class PaymentResponse {
    private TransactionDetails transactionDetails;
    private User user;

    public PaymentResponse() {
    }

    public PaymentResponse(TransactionDetails transactionDetails, User user) {
        this.transactionDetails = transactionDetails;
        this.user = user;
    }

    public TransactionDetails getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(TransactionDetails transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "PaymentResponse{" +
                "transactionDetails=" + transactionDetails +
                ", user=" + user +
                '}';
    }
}
