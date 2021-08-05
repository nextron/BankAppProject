package com.example.bankappproject;

public class Account {
    private String userID;
    private int accountNo;
    private String accountType;
    private double balance;

    public Account(String userID, int accountNo, String accountType, double balance) {
        this.userID = userID;
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.balance = balance;
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

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
