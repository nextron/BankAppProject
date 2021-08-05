package com.example.bankappproject;

public class Client {
    private String userID;
    private String emailID;
    private String userName;
    private int accessCardNumber;
    private int phoneNo;

    public Client(String userID, String emailID, String userName, int accessCardNumber, int phoneNo) {
        this.userID = userID;
        this.emailID = emailID;
        this.userName = userName;
        this.accessCardNumber = accessCardNumber;
        this.phoneNo = phoneNo;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAccessCardNumber() {
        return accessCardNumber;
    }

    public void setAccessCardNumber(int accessCardNumber) {
        this.accessCardNumber = accessCardNumber;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
}
