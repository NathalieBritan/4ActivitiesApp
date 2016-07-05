package com.nathaliebritan.a4activitiesapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Nathalie Britan on 04.07.2016.
 */
public class HallowsImageFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hallows_image_fragment, container, false);
        return view;
    }

    public void ShowPicture(int pos){
       ImageView viewer = (ImageView)getView().findViewById(R.id.hallowImageView);
        viewer.setBackgroundResource(pos);
    }

}
