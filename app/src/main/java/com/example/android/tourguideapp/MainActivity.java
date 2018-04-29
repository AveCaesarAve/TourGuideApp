package com.example.android.tourguideapp;

import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    AdapterFragments mFragmentsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        PagerTabStrip tabLayout = findViewById(R.id.layoutTabId);
        tabLayout.setTabIndicatorColor(getResources().getColor(R.color.colorAtAccents));

        ViewPager myViewpager = findViewById(R.id.pagerViewId);
        setupViewPager(myViewpager);
    }

    private void setupViewPager(ViewPager viewPager) {
        mFragmentsAdapter = new AdapterFragments(getSupportFragmentManager());

        mFragmentsAdapter.addFragment(new LocalAttractionsFragment(), "Local Attractions");
        mFragmentsAdapter.addFragment(new LocalMonumentsFragment(), "Local Monuments");
        mFragmentsAdapter.addFragment(new PlacesToSeeFragment(), "Places to See");
        mFragmentsAdapter.addFragment(new EatingOutFragment(), "Eating Out");
        viewPager.setAdapter(mFragmentsAdapter);
    }
}