package com.example.digibizpro_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Sign_In_Activity extends AppCompatActivity {
    Button txtSignInSignIn;
    TextView btnsign_up,txtforgot_password;
    EditText edtEmail, edtPassword;
    ImageView img_user_toggle;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userid_sign_in);
        txtSignInSignIn = findViewById(R.id.txtsign_in);
        btnsign_up = findViewById(R.id.btnsign_up);

        //linearUserId = findViewById(R.id.linearuserid);
        //linearMpin = findViewById(R.id.linearmpin);
        edtEmail = findViewById(R.id.edtemailid);
        edtPassword = findViewById(R.id.edtpassword);

        txtforgot_password=findViewById(R.id.txtforgot_password);
        txtforgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sign_In_Activity.this, Forgot_Password_Activity.class);
                startActivity(intent);
            }
        });

        btnsign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sign_In_Activity.this, User_ID_SignUpActivity.class);
                startActivity(intent);
            }
        });
        img_user_toggle = findViewById(R.id.login_user_switch);
        img_user_toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sign_In_Activity.this, Mpin_Activity.class);
                startActivity(intent);
            }
        });


        txtSignInSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (edtEmail.getText().toString().trim().equals("infotech.com") && edtPassword.getText().toString().trim().equals("123")) {


                    Intent intent = new Intent(Sign_In_Activity.this, Dashboard_1.class);
                    startActivity(intent);


//                } else {
//                    LayoutInflater inflater = getLayoutInflater();
//                    View alertLayout = inflater.inflate(R.layout.alert_border, null);
//                    AlertDialog.Builder alert = new AlertDialog.Builder(Sign_In_Activity.this);
//                    alert.setTitle("Login Error");
//                    alert.setView(alertLayout);
//                    alert.setCancelable(false);
//                    alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//
//                        }
//                    });
//                    alert.setPositiveButton("", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//                        }
//                    });
//                    AlertDialog dialog = alert.create();
//                    dialog.show();
//                }
            }
      });
    }


}
