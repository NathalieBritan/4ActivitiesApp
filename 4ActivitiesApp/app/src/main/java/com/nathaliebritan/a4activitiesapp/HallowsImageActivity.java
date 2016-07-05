package com.nathaliebritan.a4activitiesapp;


import android.content.res.Configuration;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class HallowsImageActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hallows_image);
        Bundle extras = getIntent().getExtras();
        int pos = extras.getInt("selectedValue");
        ImageView viewer = (ImageView) findViewById(R.id.hallowImageView);
        viewer.setBackgroundResource(pos);
    }
}
