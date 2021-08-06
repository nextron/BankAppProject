package com.example.bankappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class ClientActivity extends AppCompatActivity {
    TextView txvUserName,txvAccountType;
    Spinner spAccNumber;
    Button btnTransactions,btnFundTransfer,btnBillPayment,btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);

        txvUserName=findViewById(R.id.txvUserName);
        txvAccountType=findViewById(R.id.txvAccountType);
        spAccNumber=findViewById(R.id.spAccNumber);
        btnTransactions=findViewById(R.id.btnTransaction);
        btnFundTransfer=findViewById(R.id.btnFundTransfer);
        btnBillPayment=findViewById(R.id.btnBillPayment);
        btnLogout=findViewById(R.id.btnLogout);

        txvUserName.setText(ClientDAL.loggedInUserName);

        ArrayAdapter a1=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,AccountDAL.getAccountNumbers(Integer.parseInt(ClientDAL.loggedInUserID)));
        spAccNumber.setAdapter(a1);
    }
}