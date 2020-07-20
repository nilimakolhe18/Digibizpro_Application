package com.example.digibizpro_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class SearchCards extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    ImageView imgback;
    LinearLayout lineargrp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_cards);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        imgback = findViewById(R.id.imgback);
        lineargrp = findViewById(R.id.lineargrp);

        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchCards.this, Dashboard_1.class);
                startActivity(intent);
            }
        });
        tabLayout.addTab(tabLayout.newTab().setText("Business Cards"));
        tabLayout.addTab(tabLayout.newTab().setText("My Contacts"));
        // tabLayout.addTab(tabLayout.newTab().setText("NBA"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        Get_contact_MyAdapter adapter = new Get_contact_MyAdapter(this, getSupportFragmentManager(),
                tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
}