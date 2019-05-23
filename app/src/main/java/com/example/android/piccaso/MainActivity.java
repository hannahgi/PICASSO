package com.example.android.piccaso;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private String[] imageUrl=new String[]{
            "https://donpk.com/wp-content/uploads/2016/04/download-nature-wallpapers6.jpg",
            "https://www.havelian.net/hazara/news/PakistanNews_1452934040_12247.jpg",
            "https://donpk.com/wp-content/uploads/2016/04/download-nature-wallpapers6.jpg",
            "https://www.havelian.net/hazara/news/PakistanNews_1452934040_12247.jpg",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        ViewPager viewPager=(ViewPager) findViewById (R.id.viewpager);
     ViewpagerAdapter adapter=new ViewpagerAdapter (this, imageUrl);
     viewPager.setAdapter (adapter);


    }
}
