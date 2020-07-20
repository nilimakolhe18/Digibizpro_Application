package com.example.digibizpro_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Mpin_Activity extends AppCompatActivity {
    ImageView img_mpin_toggle;
    EditText edttext1, edttext2, edttext3, edttext4;
    Button txtclick_here;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mpin_signin);
        img_mpin_toggle = findViewById(R.id.login_mpin_switch);
        txtclick_here=findViewById(R.id.txtclick_here);
        txtclick_here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mpin_Activity.this, Forgot_Mpin_Activity.class);
                startActivity(intent);
            }
        });
//        img_mpin_toggle = findViewById(R.id.login_mpin_switch);
//        img_mpin_toggle = findViewById(R.id.login_mpin_switch);
//        img_mpin_toggle = findViewById(R.id.login_mpin_switch);

//        edttext1.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                if (((EditText) findViewById(R.id.edtmpin_1)).getText().toString().length() == 1) {
//                    ((EditText) findViewById(R.id.edtmpin_1)).clearFocus();
//                    ((EditText) findViewById(R.id.edtmpin_1)).requestFocus();
//                    ((EditText) findViewById(R.id.edtmpin_1)).setCursorVisible(true);
//
//                }
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
//        edttext2.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                if (((EditText) findViewById(R.id.edtmpin_2)).getText().toString().length() == 1) {
//                    ((EditText) findViewById(R.id.edtmpin_2)).clearFocus();
//                    ((EditText) findViewById(R.id.edtmpin_2)).requestFocus();
//                    ((EditText) findViewById(R.id.edtmpin_2)).setCursorVisible(true);
//
//                }
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
//        edttext3.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                if (((EditText) findViewById(R.id.edtmpin_3)).getText().toString().length() == 1) {
//                    ((EditText) findViewById(R.id.edtmpin_3)).clearFocus();
//                    ((EditText) findViewById(R.id.edtmpin_3)).requestFocus();
//                    ((EditText) findViewById(R.id.edtmpin_3)).setCursorVisible(true);
//
//                }
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
//
//        edttext4.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                if (((EditText) findViewById(R.id.edtmpin_4)).getText().toString().length() == 1) {
//                    ((EditText) findViewById(R.id.edtmpin_4)).clearFocus();
//                    ((EditText) findViewById(R.id.edtmpin_4)).requestFocus();
//                    ((EditText) findViewById(R.id.edtmpin_4)).setCursorVisible(true);
//
//                }
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
        img_mpin_toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mpin_Activity.this, Sign_In_Activity.class);
                startActivity(intent);
            }
        });

    }

}
