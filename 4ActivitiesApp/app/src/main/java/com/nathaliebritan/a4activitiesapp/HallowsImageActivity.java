package com.nathaliebritan.a4activitiesapp;


import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class HallowsImageActivity extends AppCompatActivity {
    public int[] pictures = {R.drawable.elder_wand, R.drawable.cloak_of_invisibility, R.drawable.ressurection_stone};
    private int position;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hallows_image);
        Bundle extras = getIntent().getExtras();
        position = extras.getInt("selectedValue");
        ImageView viewer = (ImageView) findViewById(R.id.hallowImageView);
        viewer.setBackgroundResource(pictures[position]);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {

            SharedPreferences.Editor ed = MainActivity.sPref.edit();
            ed.putInt("saved_text", position);
            ed.commit();

            Intent intent = new Intent(this, HallowsScreenActivity.class);
            startActivity(intent);
        }
    }

}
