package com.example.digibizpro_application;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SaveButtonActivity extends AppCompatActivity {
    ImageView imageback;
    String strname, strph_no, stremail, straddress, strwork, strnote;
    TextView txtname, txtphnumber, txt_email, txtaddress, txtwork, txtnote;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.savebutton_activity);
        imageback = findViewById(R.id.imageback);
        txtname = findViewById(R.id.txtname);
        txtphnumber = findViewById(R.id.txtphnumber);
        txt_email = findViewById(R.id.txt_email);
        txtaddress = findViewById(R.id.txtaddress);
        txtwork = findViewById(R.id.txtwork);
        txtnote = findViewById(R.id.txtnote);


        strname = getIntent().getStringExtra("Name");
        Log.d("nametag", strname);

        strph_no = getIntent().getStringExtra("Phone_Number");
        stremail = getIntent().getStringExtra("Email");
        straddress = getIntent().getStringExtra("Address");
        strwork = getIntent().getStringExtra("Work");
        strnote = getIntent().getStringExtra("Note");

        txtname.setText(strname);
        txtphnumber.setText(strph_no);
        txt_email.setText(stremail);
        txtaddress.setText(straddress);
        txtwork.setText(strwork);
        txtnote.setText(strnote);

        imageback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SaveButtonActivity.this, Create_Activity.class);
                startActivity(intent);
            }
        });
    }
}
