package com.nathaliebritan.a4activitiesapp;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

public class HallowsScreenActivity extends FragmentActivity {

    private int picture = 4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hallows_screen);

        HallowsImageFragment fragment = (HallowsImageFragment) getSupportFragmentManager().findFragmentById(R.id.hallows_image_fragment);
        Bundle extr = getIntent().getExtras();
        if(extr != null){
            picture = extr.getInt("selectedValue");
            if(picture != 4 && fragment != null && fragment.isInLayout()){
                fragment.ShowPicture(picture);
            }
        }
    }

}


