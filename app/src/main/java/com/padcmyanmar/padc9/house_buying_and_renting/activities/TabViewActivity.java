package com.padcmyanmar.padc9.house_buying_and_renting.activities;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.padcmyanmar.padc9.house_buying_and_renting.R;
import com.padcmyanmar.padc9.house_buying_and_renting.adapter.TabPagerAdapter;
import com.padcmyanmar.padc9.house_buying_and_renting.delegates.FragmentDelegates;

public class TabViewActivity extends AppCompatActivity implements FragmentDelegates {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_view);

        TabLayout tab = findViewById(R.id.tablayout);

        ViewPager viewPager = findViewById(R.id.viewPager);

        TabPagerAdapter tabPagerAdapter = new TabPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(tabPagerAdapter);
        tab.setupWithViewPager(viewPager);

    }


    @Override
    public void onClick() {

    }
}
