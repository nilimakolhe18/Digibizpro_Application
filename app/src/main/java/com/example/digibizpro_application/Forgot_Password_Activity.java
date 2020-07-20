package com.example.digibizpro_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Forgot_Password_Activity extends AppCompatActivity {
    ImageView imgback;
    Button btngetotp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_forgot_password);
        imgback=findViewById(R.id.imgback);
        btngetotp=findViewById(R.id.btn_get_otp);
        btngetotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Forgot_Password_Activity.this, Get_User_ID_OTP_Activity.class);
                startActivity(intent);
            }
        });

        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Forgot_Password_Activity.this, Sign_In_Activity.class);
                startActivity(intent);
            }
        });

    }
}
