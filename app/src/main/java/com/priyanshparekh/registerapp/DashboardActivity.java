package com.priyanshparekh.registerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    ViewPager2 mainViewPager;
    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        mainViewPager = findViewById(R.id.mainViewPager);
        bottomNavigation = findViewById(R.id.bottomNavigation);

        MainViewPagerAdapter mainViewPagerAdapter = new MainViewPagerAdapter(this);
        mainViewPager.setAdapter(mainViewPagerAdapter);

        mainViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {

                switch (position) {
                    case 0:
                        bottomNavigation.setSelectedItemId(R.id.app_bar_Home);
                        break;
                    case 1:
                       bottomNavigation.setSelectedItemId(R.id.app_bar_search);
                        break;
                    case 2:
                       bottomNavigation.setSelectedItemId(R.id.app_bar_Account);
                        break;
                }
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
      bottomNavigation.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.app_bar_Home:
                mainViewPager.setCurrentItem(0);
                break;
            case R.id.app_bar_search:
                mainViewPager.setCurrentItem(1);
                break;
            case R.id.app_bar_Account:
                mainViewPager.setCurrentItem(2);
                break;
        }
        return true;
    }
}
