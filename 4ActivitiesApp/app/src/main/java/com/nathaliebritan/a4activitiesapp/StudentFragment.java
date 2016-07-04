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
public class StudentFragment extends Fragment {

    private int pageNumber;
    private int[] images = {R.drawable.harry,R.drawable.ron,R.drawable.hermione};

    public static StudentFragment newInstance(int position) {
        StudentFragment fragment = new StudentFragment();
        Bundle args = new Bundle();
        args.putInt("num", position);
        fragment.setArguments(args);
        return fragment;
    }

    public StudentFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments() != null ? getArguments().getInt("num") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View result = inflater.inflate(R.layout.fragment, container, false);
        ImageView image = (ImageView)result.findViewById(R.id.image);
        image.setBackgroundResource(images[pageNumber]);
        return result;
    }

}



