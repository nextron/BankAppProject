package com.example.bankappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class ClientActivity extends AppCompatActivity {
    TextView txvUserName,txvAccountType,txvBalance;
    Spinner spAccNumber;
    Button btnTransactions,btnFundTransfer,btnBillPayment,btnLogout;
    public  static int accountIndex;
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
        txvBalance=findViewById(R.id.txvBalance);

        txvUserName.setText(ClientDAL.loggedInUserName);

        ArrayAdapter a1=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,AccountDAL.getAccountNumbers(ClientDAL.loggedInUserID));
        spAccNumber.setAdapter(a1);
        spAccNumber.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                accountIndex=position;
                txvAccountType.setText(AccountDAL.accountList.get(position).getAccountType());
                txvBalance.setText(String.valueOf(AccountDAL.accountList.get(position).getBalance()));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btnLogout.setOnClickListener(v ->{

            Intent intent = new Intent(ClientActivity.this,LoginActivity.class);
            ClientDAL.loggedInUserID="";
            ClientDAL.loggedInUserName="";
            AccountDAL.accountList.clear();
            startActivity(intent);

        });
        btnTransactions.setOnClickListener(v->{

        });
    }
}