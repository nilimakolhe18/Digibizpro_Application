package com.example.digibizpro_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Get_User_ID_OTP_Activity extends AppCompatActivity {
    ImageView imgback;
    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_userid_otp_activity);
        imgback=findViewById(R.id.imgback);
        btnsubmit=findViewById(R.id.btn_submit);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Get_User_ID_OTP_Activity.this, Set_New__UserID_Password.class);
                startActivity(intent);
            }
        });
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Get_User_ID_OTP_Activity.this, Forgot_Password_Activity.class);
                startActivity(intent);
            }
        });
    }
}
