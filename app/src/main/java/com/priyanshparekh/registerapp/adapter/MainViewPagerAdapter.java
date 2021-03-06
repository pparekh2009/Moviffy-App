package com.priyanshparekh.registerapp.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.priyanshparekh.registerapp.fragment.AccountFragment;
import com.priyanshparekh.registerapp.fragment.HomeFragment;
import com.priyanshparekh.registerapp.fragment.searchFragment;

public class MainViewPagerAdapter extends FragmentStateAdapter {

    public MainViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;

        switch (position) {
            case 0:
                fragment = new HomeFragment();
                break;
            case 1:
                fragment = new searchFragment();
                break;
            case 2:
                fragment = new AccountFragment();
                break;
//            default:
//                fragment = new HomeFragment();
            default:
                throw new IllegalStateException("Unexpected value: " + position);
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
