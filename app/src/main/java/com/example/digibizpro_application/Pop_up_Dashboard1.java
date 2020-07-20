package com.example.digibizpro_application;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Pop_up_Dashboard1 extends AppCompatActivity {
    //    TabLayout tabLayout, tab2;
//    ViewPager viewPager;
    TextView txtsilver, txtgold, txtplatinum;
    RelativeLayout linear_silver, linear_gold, linear_platinum, start_trial_layout;
    ScrollView lineartop;
    Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_up_layout);

        txtsilver = findViewById(R.id.txtsilver);
        txtgold = findViewById(R.id.txtgold);
        txtplatinum = findViewById(R.id.txtplatinum);
        linear_silver = findViewById(R.id.linear_silver);
        linear_gold = findViewById(R.id.linear_gold);
        linear_platinum = findViewById(R.id.linear_platinum);
        btn_next = findViewById(R.id.btn_next);
        lineartop = findViewById(R.id.lineartop);
        start_trial_layout = findViewById(R.id.start_trial_layout);


        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lineartop.setVisibility(View.GONE);
//                start_trial_layout.setVisibility(View.VISIBLE);
//                Intent intent=new Intent(Pop_up_Dashboard1.this,Start_Trial.class);
//                startActivity(intent);
                LayoutInflater inflater = getLayoutInflater();

                View alertLayout = inflater.inflate(R.layout.layout_start_trial, null);
                //  alertLayout=findViewById(R.id.btn_starttrial);
                Button btn_starttrial = alertLayout.findViewById(R.id.btn_starttrial);

                btn_starttrial.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    onBackPressed();
                    }
                });


                AlertDialog.Builder alert = new AlertDialog.Builder(Pop_up_Dashboard1.this);

                alert.setView(alertLayout);
                alert.setCancelable(false);
                alert.setNegativeButton("", new DialogInterface.OnClickListener() {
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
        });

        txtsilver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear_gold.setVisibility(View.GONE);
                linear_platinum.setVisibility(View.GONE);
                linear_silver.setVisibility(View.VISIBLE);
                txtsilver.setBackgroundColor(Color.parseColor("#D73B69"));
                txtgold.setBackgroundColor(Color.parseColor("#80FCAB35"));
                txtplatinum.setBackgroundColor(Color.parseColor("#808146A2"));
            }
        });

        txtgold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear_gold.setVisibility(View.VISIBLE);
                linear_silver.setVisibility(View.GONE);
                linear_platinum.setVisibility(View.GONE);
                txtgold.setBackgroundColor(Color.parseColor("#FCAB35"));
                txtsilver.setBackgroundColor(Color.parseColor("#80D73B69"));
                txtplatinum.setBackgroundColor(Color.parseColor("#808146A2"));
            }
        });
        txtplatinum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear_silver.setVisibility(View.GONE);
                linear_gold.setVisibility(View.GONE);
                linear_platinum.setVisibility(View.VISIBLE);

                txtgold.setBackgroundColor(Color.parseColor("#80FCAB35"));
                txtsilver.setBackgroundColor(Color.parseColor("#80D73B69"));
                txtplatinum.setBackgroundColor(Color.parseColor("#8146A2"));
            }
        });

    }

}