package com.example.digibizpro_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Set_New__Mpin_Password extends AppCompatActivity {
    Button btn_set_password;
    ImageView imgback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_new_mpin_activity);
        btn_set_password=findViewById(R.id.btn_set_password);
        imgback=findViewById(R.id.imgback);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Set_New__Mpin_Password.this,Forgot_Mpin_Activity.class);
                startActivity(intent);
            }
        });
        btn_set_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Set_New__Mpin_Password.this, Sign_In_Activity.class);
                startActivity(intent);
            }
        });

    }
}
