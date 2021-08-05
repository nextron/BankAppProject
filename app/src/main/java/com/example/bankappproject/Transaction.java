package com.example.bankappproject;

public class Transaction {
    private String userID;
    private int accountNo;
    private String transactionType;
    private double transactionAmount;

    public Transaction(String userID, int accountNo, String transactionType, double transactionAmount) {
        this.userID = userID;
        this.accountNo = accountNo;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}
