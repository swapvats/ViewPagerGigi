package com.example.viewpagergigi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    HorizontalInfiniteCycleViewPager viewPager;
    ArrayList<Gigi> mygigis = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        MyVPagerAdapter myVPagerAdapter = new MyVPagerAdapter(this,mygigis);

        viewPager = findViewById(R.id.viewPager);

        viewPager.setAdapter(myVPagerAdapter);




    }

    private void initData() {
        mygigis.add(new Gigi("Sexy Gigi","Very Hot",R.drawable.gigi_1));
        mygigis.add(new Gigi("Hot Gigi","Very Hot",R.drawable.gigi_2));
        mygigis.add(new Gigi("Cute Gigi","Very Hot",R.drawable.gigi_3));
        mygigis.add(new Gigi("Sizzling Gigi","Very Hot",R.drawable.gigi_4));
        mygigis.add(new Gigi("Sizzling Hawwt Gigi","Very Hot",R.drawable.gigi_5));
    }
}
