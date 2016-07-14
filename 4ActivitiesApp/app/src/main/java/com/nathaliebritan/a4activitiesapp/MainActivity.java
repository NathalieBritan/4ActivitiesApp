package com.nathaliebritan.a4activitiesapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Intent intent;
    public static SharedPreferences sPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sPref = getPreferences(MODE_PRIVATE);
    }

    public void OnButton1Click(View v){
        intent = new Intent (this, TabsActivity.class);
        startActivity(intent);
    }

    public void OnButton2Click(View v){
        intent = new Intent (this, DrawerActivity.class);
        startActivity(intent);
    }

    public void OnButton3Click(View v){
        intent = new Intent (this, HallowsScreenActivity.class);
        startActivity(intent);
    }

}
