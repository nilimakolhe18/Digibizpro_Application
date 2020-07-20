package com.example.digibizpro_application;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Activity_Sign_In extends AppCompatActivity {
    Button txtSignInSignIn;
    TextView btn_sign_up;
    EditText edtEmail, edtPassword;
    LinearLayout linearUserId, linearMpin;
    Switch switch1;
    ImageView img_user_toggle,img_mpin_toggle;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_sign_in);
        txtSignInSignIn = findViewById(R.id.txtsign_in);

        //linearUserId = findViewById(R.id.linearuserid);
        linearMpin = findViewById(R.id.linearmpin);
        edtEmail = findViewById(R.id.edtemailid);
        edtPassword = findViewById(R.id.edtpassword);
        btn_sign_up=findViewById(R.id.txtsign_up) ;
        btn_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity_Sign_In.this,User_ID_SignUpActivity.class);
                startActivity(intent);
            }
        });
        img_user_toggle=findViewById(R.id.login_user_switch);
        img_user_toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity_Sign_In.this,Mpin_Activity.class);
                startActivity(intent);
            }
        });



        txtSignInSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtEmail.getText().toString().trim().equals("infotech@gmail.com") && edtPassword.getText().toString().trim().equals("123")) {


                } else {
                    LayoutInflater inflater = getLayoutInflater();
                    View alertLayout = inflater.inflate(R.layout.alert_border, null);
                    AlertDialog.Builder alert = new AlertDialog.Builder(Activity_Sign_In.this);
                    alert.setTitle("Login Error");
                    alert.setView(alertLayout);
                    alert.setCancelable(false);
                    alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.setPositiveButton("", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    AlertDialog dialog = alert.create();
                    dialog.show();
                }
            }
        });
    }


}
