package com.nathaliebritan.a4activitiesapp;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class DrawerActivity extends AppCompatActivity {
    private String[] mHouseTitles = {"Gryffindor", "Hufflepuff", "Slytherin", "Ravenclaw"};
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ImageView mContentFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        mContentFrame = (ImageView) findViewById(R.id.content_image);

        mDrawerList.setAdapter(new ArrayAdapter<String>(this,
                R.layout.drawer_list_item, mHouseTitles));
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
    }

    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView parent, View view, int position, long id) {
            selectItem(position);
        }
    }

    private void selectItem(int position) {
        int[] images = {R.drawable.gryffindor,R.drawable.hufflepuff,R.drawable.slytherin, R.drawable.ravenclaw};

        mContentFrame.setBackgroundResource(images[position]);
        mDrawerList.setItemChecked(position, true);
        setTitle(mHouseTitles[position]);
        mDrawerLayout.closeDrawer(mDrawerList);
    }

}
