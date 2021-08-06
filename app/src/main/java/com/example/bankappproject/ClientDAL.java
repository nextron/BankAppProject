package com.example.bankappproject;

public class ClientDAL {

    //variable to store username and userid
    public static String loggedInUserID;
    public static String loggedInUserName;

    //function to validate if user has provided the correct details
    public static boolean validateUser(int cardNumber, int pinNumber){
        //System.out.println("Card Number:" + cardNumber + "   Pin Number:" + pinNumber);
        for(Client ct: DataBase.clients){
            if(ct.getAccessCardNumber() == cardNumber && ct.getPinNumber() == pinNumber){
                loggedInUserID = ct.getUserID();
                loggedInUserName = ct.getUserName();
                return true;
            }
        }
        return false;
    }
}
