package com.nathaliebritan.a4activitiesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
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
        intent = new Intent (this, TabsActivity.class);
        startActivity(intent);
    }

}
