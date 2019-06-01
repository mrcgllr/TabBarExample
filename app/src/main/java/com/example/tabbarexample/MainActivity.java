package com.example.tabbarexample;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    SectionsPageAdapter sectionsAdapter;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            sectionsAdapter = new SectionsPageAdapter(getSupportFragmentManager());
            viewPager = (ViewPager) findViewById(R.id.container);
            setupPager(viewPager);
            TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
            tabLayout.setupWithViewPager(viewPager);


    }

    private  void  setupPager(ViewPager view) {
        SectionsPageAdapter adapter= new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment1(),"Fragment 1");
        adapter.addFragment(new Fragment2(),"Fragment 2");
        adapter.addFragment(new Fragment3(),"Fragment 3");
        view.setAdapter(adapter);


    }

}