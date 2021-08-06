package com.example.bankappproject;

import java.util.ArrayList;

public class DataBase {
    public static ArrayList<Client> clients = new ArrayList<>();
    public static ArrayList<Account> accounts = new ArrayList<>();
    public static ArrayList<Transaction> transactions = new ArrayList<>();

    public static void fillData(){
        clients.add(new Client("123456","mirallakhani94@gmail.com","Miral Lakhani",123456,123,958669823));
        clients.add(new Client("456789","manpreetsingh@gmail.com","Manpreet Singh",456123,456,958669823));
        clients.add(new Client("789123","najmehakbari@gmail.com","Najmeh Akbari",4567,789,990901234));
        clients.add(new Client("456987","dishant@gmail.com","dishant Chaudhary",123456,345,958665001));

        accounts.add(new Account("123456",565656,"chequing",3300));
        accounts.add(new Account("456789",676767,"chequing",12300));
        accounts.add(new Account("789123",989898,"saving",6780));
        accounts.add(new Account("456987",5323232,"saving",1235));

    }

}
