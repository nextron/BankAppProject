package com.example.bankappproject;

import java.util.ArrayList;

public class AccountDAL {
    public static ArrayList<Account> accountList=new ArrayList<>();
    //method for fetching Account number
    public static String[] getAccountNumbers(String userID){
        accountList.clear();
        for(Account ac: DataBase.accounts)
            if(ac.getUserID().equals(userID))
                accountList.add(ac);
        String[] accountNumbers=new String[accountList.size()];
        for(int i=0;i< accountNumbers.length;i++)
            accountNumbers[i]=String.valueOf(accountList.get(i).getAccountNo());
        return accountNumbers;
    }
}
