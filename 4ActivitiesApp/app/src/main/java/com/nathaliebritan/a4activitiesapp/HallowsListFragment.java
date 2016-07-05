package com.nathaliebritan.a4activitiesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Nathalie Britan on 04.07.2016.
 */
public class HallowsListFragment extends ListFragment {
    private int[] pictures = {R.drawable.elder_wand, R.drawable.cloak_of_invisibility, R.drawable.ressurection_stone};

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String[] values = new String[] {"Elder wand", "Cloak of invisibility", "Resurrection stone"};
        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        HallowsImageFragment fragment = (HallowsImageFragment) getFragmentManager().findFragmentById(R.id.hallows_image_fragment);
        if (fragment != null && fragment.isInLayout()) {
            fragment.ShowPicture(pictures[position]);
        } else {
            Intent intent = new Intent(getActivity().getApplicationContext(), HallowsImageActivity.class);
            intent.putExtra("selectedValue", pictures[position]);
            startActivity(intent);
        }
    }

}

