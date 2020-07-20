package com.example.digibizpro_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Enter_USerID_OTP_Activity extends AppCompatActivity {
    Button btnsignUp;
    ImageView imgback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_otp_activity);
        btnsignUp=findViewById(R.id.btn_signup);
        imgback=findViewById(R.id.imgback);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Enter_USerID_OTP_Activity.this,User_ID_SignUpActivity.class);
                startActivity(intent);
            }
        });
//        btnsignUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(Enter_OTP_Activity.this,Enter_OTP_Activity.class);
//                startActivity(intent);
//            }
//        });
    }
}