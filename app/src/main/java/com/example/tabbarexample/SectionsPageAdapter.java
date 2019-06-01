package com.example.tabbarexample;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionsPageAdapter extends FragmentPagerAdapter {
    private final List<Fragment> mFragment= new ArrayList<>(); 
    private  final List<String> mFragmentTitleList = new ArrayList<>();


    public SectionsPageAdapter(FragmentManager fm) {
        super(fm);
    }
    public void addFragment(Fragment fragment, String string){
        mFragment.add(fragment);
        mFragmentTitleList.add(string);

    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }

    @Override
    public Fragment getItem(int i) {
        return mFragment.get(i);
    }

    @Override
    public int getCount() {
        return mFragmentTitleList.size();
    }
}
