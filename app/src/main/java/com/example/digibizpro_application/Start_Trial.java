package com.example.digibizpro_application;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Start_Trial extends AppCompatActivity {
    TextView txtcontent;
    Context context;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_start_trial);

        txtcontent=findViewById(R.id.txtcontent);
//        Typeface roboto = Typeface.createFromAsset(context.getAssets(),
  //              "font/Roboto-Medium"); //use this.getAssets if you are calling from an Activity
    //    txtcontent.setTypeface(roboto);
    }
}
