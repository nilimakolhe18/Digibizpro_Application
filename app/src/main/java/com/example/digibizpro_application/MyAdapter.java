package com.example.digibizpro_application;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {
    Context context;
    int totalTabs;

    public MyAdapter(Context c, FragmentManager fm, int totalTabs) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Silver silverFragment = new Silver();
                return silverFragment;

            case 1:
                Gold goldFragment = new Gold();
                return goldFragment;
            case 2:
                Platinum platinumFragment = new Platinum();
                return platinumFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}