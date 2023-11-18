package com.mahi.paymentservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class TransactionDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long paymentId;

    private long userId;

    private String paymentMode;

    private String referenceNumber;

    private Date paymentDate;

    private String paymentStatus;

    private long amount;

    public TransactionDetails() {
    }

    public TransactionDetails(long paymentId, long userId, String paymentMode, String referenceNumber, Date paymentDate, String paymentStatus, long amount) {
        this.paymentId = paymentId;
        this.userId = userId;
        this.paymentMode = paymentMode;
        this.referenceNumber = referenceNumber;
        this.paymentDate = paymentDate;
        this.paymentStatus = paymentStatus;
        this.amount = amount;
    }

    public long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TransactionDetails{" +
                "paymentId=" + paymentId +
                ", userId=" + userId +
                ", paymentMode='" + paymentMode + '\'' +
                ", referenceNumber='" + referenceNumber + '\'' +
                ", paymentDate=" + paymentDate +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", amount=" + amount +
                '}';
    }
}

