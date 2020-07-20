package com.example.digibizpro_application;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class User_ID_SignUpActivity extends AppCompatActivity {
EditText edtfullname,edtemailid,edtmobileno,edtcompanyname,edtpassword,edtconfirmpassword;
Button btn_register;
TextView btn_sign_in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userid_signup_layout);
        edtfullname=findViewById(R.id.edtfullname);
        edtemailid=findViewById(R.id.edt_email_id);
        edtmobileno=findViewById(R.id.edt_mobileno);
        edtcompanyname=findViewById(R.id.edtcompanyname);
        edtpassword=findViewById(R.id.edtpassword);
        edtconfirmpassword=findViewById(R.id.edtconfirmpassword);
        btn_register=findViewById(R.id.btn_register);
        btn_sign_in=findViewById(R.id.btn_sign_in);

        btn_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(User_ID_SignUpActivity.this, Sign_In_Activity.class);
                startActivity(intent);
            }
        });

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(User_ID_SignUpActivity.this, Enter_USerID_OTP_Activity.class);
                startActivity(intent);
            }
        });

        edtfullname.setHint(Html.fromHtml("Full Name<font color='#ED3237'>*</font>"));
        edtemailid.setHint(Html.fromHtml("Email Id <font color='#ED3237'>*</font>"));
        edtmobileno.setHint(Html.fromHtml("Mobile Number <font color='#ED3237'>*</font>"));
        edtcompanyname.setHint(Html.fromHtml("Company Name<font color='#ED3237'>*</font>"));



    }
}
