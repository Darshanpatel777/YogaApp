package com.example.yogaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);

        viewPager.setAdapter(new FragmentStateAdapter(this) {
            @Override
            public Fragment createFragment(int position) {
                return new YogaFragment();
            }

            @Override
            public int getItemCount() {
                return 3; // 3 tabs
            }
        });


    }
}


// can you create for my android studio in  java project to yoga app in 10 types of cusine there pics n details? create conditions is 1.creat in fragment use,2.atleast 3 pics of image in item,3.minimum 8 item 1 cuisin