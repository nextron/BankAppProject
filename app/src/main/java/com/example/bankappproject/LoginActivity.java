package com.example.bankappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edtCardNumber, edtPinNumber;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Calling fill data from database class
        DataBase.fillData();

        //initializing the variables
        edtCardNumber = findViewById(R.id.edtCardNumber);
        edtPinNumber = findViewById(R.id.edtPinNumber);
        btnLogin = findViewById(R.id.btnLogIn);

        btnLogin.setOnClickListener(v -> {
            if (edtCardNumber.getText().toString().isEmpty()){
                Toast.makeText(this, "Please enter the Card number.", Toast.LENGTH_SHORT).show();
            }else if(edtPinNumber.getText().toString().isEmpty()){
                Toast.makeText(this, "Please enter the Pin number.", Toast.LENGTH_SHORT).show();
            }else{
                int cardNumber = Integer.parseInt(edtCardNumber.getText().toString());
                int pinNumber = Integer.parseInt(edtPinNumber.getText().toString());
                if(ClientDAL.validateUser(cardNumber,pinNumber)){
                    //System.out.println("User Name:"+ ClientDAL.loggedInUserName + " User ID: "+ ClientDAL.loggedInUserID);
                    Toast.makeText(this, "You have logged in.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Please provide a valid Card Number and PIN", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}