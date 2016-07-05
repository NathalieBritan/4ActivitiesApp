package com.nathaliebritan.a4activitiesapp;


import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class HallowsImageActivity extends AppCompatActivity {
    private int picture;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hallows_image);
        Bundle extras = getIntent().getExtras();
        picture = extras.getInt("selectedValue");
        ImageView viewer = (ImageView) findViewById(R.id.hallowImageView);
        viewer.setBackgroundResource(picture);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Intent intent = new Intent(this, HallowsScreenActivity.class);
            intent.putExtra("selectedValue", picture);
            startActivity(intent);
        }
    }

}
