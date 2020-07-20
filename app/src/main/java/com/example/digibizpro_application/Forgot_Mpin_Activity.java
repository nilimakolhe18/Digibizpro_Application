package com.example.digibizpro_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Forgot_Mpin_Activity extends AppCompatActivity {
    Button btn_get_mpin;
    ImageView imgback;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_forgot_mpin);
        btn_get_mpin=findViewById(R.id.btn_get_mpin);
        imgback=findViewById(R.id.imgback);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Forgot_Mpin_Activity.this, Mpin_Activity.class);
                startActivity(intent);
            }
        });
        btn_get_mpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Forgot_Mpin_Activity.this, Get_MPIN_OTP_Activity.class);
                startActivity(intent);
            }
        });
    }
}
