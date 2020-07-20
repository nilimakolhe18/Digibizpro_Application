package com.example.digibizpro_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Enter_OTP_Activity extends AppCompatActivity {
    Button btnsignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_otp_activity);
        btnsignUp=findViewById(R.id.btn_signup);
        btnsignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Enter_OTP_Activity.this,Enter_OTP_Activity.class);
                startActivity(intent);
            }
        });
    }
}