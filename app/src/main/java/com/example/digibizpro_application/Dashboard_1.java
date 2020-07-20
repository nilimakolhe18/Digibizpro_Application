package com.example.digibizpro_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class Dashboard_1 extends AppCompatActivity {
    TextView tvLabel;
    TabLayout tabLayout;
    ViewPager viewPager;
    LinearLayout linear_allcontacts;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard1);
        linear_allcontacts=findViewById(R.id.linear_allcontacts);
        linear_allcontacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Dashboard_1.this, SearchCards.class);
                startActivity(intent);
            }
        });
        Intent intent = new Intent(Dashboard_1.this, Pop_up_Dashboard1.class);
        startActivity(intent);
        setupBottomNavigationView();


    }
//        tabLayout = findViewById(R.id.tabLayout);
//        viewPager = findViewById(R.id.viewPager);
//        tabLayout.addTab(tabLayout.newTab().setText("Silver"));
//        tabLayout.addTab(tabLayout.newTab().setText("Gold"));
//        tabLayout.addTab(tabLayout.newTab().setText("Platinum"));
//        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
//        final MyAdapter adapter = new MyAdapter(this,getSupportFragmentManager(), tabLayout.getTabCount());
//        viewPager.setAdapter(adapter);
//        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                viewPager.setCurrentItem(tab.getPosition());
//            }
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//            }
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//            }
//        });
//    }


    private void setupBottomNavigationView() {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_scan1:

                        Intent intent = new Intent(Dashboard_1.this, ScanActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.menu_create:
                        Intent intentcreate = new Intent(Dashboard_1.this, Create_Activity.class);
                        startActivity(intentcreate);
                        break;
                    case R.id.menu_scancard:
                        Intent intentscanb = new Intent(Dashboard_1.this, ScanBCard.class);
                        startActivity(intentscanb);
                        break;
                    case R.id.menu_grps:

                        break;
                    case R.id.menu_fvrt:

                        break;
                }
                return true;
            }
        });
    }
}
