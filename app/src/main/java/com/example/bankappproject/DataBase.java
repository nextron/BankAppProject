package com.example.bankappproject;

import java.util.ArrayList;

public class DataBase {
    public static ArrayList<Client> clients;
    public static ArrayList<Account> accounts;
    public static ArrayList<Transaction> transactions;

    public static void fillData(){
        clients.add(new Client("123456","mirallakhani94@gmail.com","Miral Lakhani",00123456,123,958669823));
        clients.add(new Client("456789","manpreetsingh@gmail.com","Manpreet Singh",00456123,456,958669823));
        clients.add(new Client("789123","najmehakbari@gmail.com","Najmeh Akbari",004567,789,990901234));
        clients.add(new Client("456987","dishant@gmail.com","dishant Chaudhary",00123456,345,958665001));

    }
}
