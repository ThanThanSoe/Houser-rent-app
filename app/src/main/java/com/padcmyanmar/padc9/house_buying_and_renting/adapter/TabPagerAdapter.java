package com.padcmyanmar.padc9.house_buying_and_renting.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.padcmyanmar.padc9.house_buying_and_renting.fragments.FragmentOne;
import com.padcmyanmar.padc9.house_buying_and_renting.fragments.FragmentTwo;

public class TabPagerAdapter extends FragmentStatePagerAdapter {
    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if(i == 0){
            return new FragmentOne();
        }else
            return new FragmentTwo();


    }

    @Override
    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle(int position){
        if(position == 0){
            return "Top Collection";
        }else
            return "Near me";
    }
}
