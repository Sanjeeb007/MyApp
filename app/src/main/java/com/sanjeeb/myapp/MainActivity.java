package com.sanjeeb.myapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.sanjeeb.myapp.adpter.ViewPageAdapteR;

public class MainActivity extends AppCompatActivity {
ViewPager viewPager;
TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
viewPager=findViewById(R.id.viewpage);
        tabLayout=findViewById(R.id.tablayout);
        ViewPageAdapteR viewPageAdapteR = new ViewPageAdapteR(getSupportFragmentManager());
        viewPageAdapteR.addFragment(new LoginFragment(),"LogIn");
        viewPageAdapteR.addFragment(new SignUPFragment(),"SignUp");
        viewPager.setAdapter(viewPageAdapteR);
        tabLayout.setupWithViewPager(viewPager);
    }
}
