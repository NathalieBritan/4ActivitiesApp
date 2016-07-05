package com.nathaliebritan.a4activitiesapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Nathalie Britan on 04.07.2016.
 */
public class MyAdapter extends FragmentPagerAdapter {


    private static final int PAGE_COUNT=3;
    private Context context;
    private String[] tabTitles = new String[]{"Harry","Ron","Hermione"};

    public MyAdapter(FragmentManager supportFragmentManager, Context context) {
        super(supportFragmentManager);
        this.context=context;
    }

    @Override
    public int getCount() {
        return(PAGE_COUNT);
    }
    @Override
    public Fragment getItem(int position) {
        return(StudentFragment.newInstance(position+1));
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}

