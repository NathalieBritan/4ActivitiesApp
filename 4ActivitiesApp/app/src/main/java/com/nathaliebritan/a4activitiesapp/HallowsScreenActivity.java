package com.nathaliebritan.a4activitiesapp;

import android.content.SharedPreferences;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

public class HallowsScreenActivity extends FragmentActivity {

    public int[] pictures = {R.drawable.elder_wand, R.drawable.cloak_of_invisibility, R.drawable.ressurection_stone};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hallows_screen);

        HallowsImageFragment fragment = (HallowsImageFragment) getSupportFragmentManager().findFragmentById(R.id.hallows_image_fragment);
        int savedPicture = MainActivity.sPref.getInt("saved_text", -1);

        if(savedPicture != -1 && fragment != null && fragment.isInLayout()){
            fragment.ShowPicture(pictures[savedPicture]);
        }
    }

}


