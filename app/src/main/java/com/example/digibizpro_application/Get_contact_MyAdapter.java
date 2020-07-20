package com.example.digibizpro_application;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Get_contact_MyAdapter extends FragmentPagerAdapter {
    Context context;
    int totalTabs;
    public Get_contact_MyAdapter(Context c, FragmentManager fm, int totalTabs) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Business_Card footballFragment = new Business_Card();
                return footballFragment;
            case 1:
                My_Cards cricketFragment = new My_Cards();
                return cricketFragment;

            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}