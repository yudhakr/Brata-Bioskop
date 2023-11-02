package com.example.bratabioskop;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class TopFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_top, container, false);


        RecyclerView topRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_top, container, false);

        String[] topNames = new String[Popular.populars.length];
        for (int i = 0; i < topNames.length; i++) {
            topNames[i] = Popular.populars[i].getName();
        }

        int[] topImages = new int[Popular.populars.length];
        for (int i = 0; i < topImages.length; i++) {
            topImages[i] = Popular.populars[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(topNames, topImages);
        topRecycler.setAdapter(adapter);
//        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
//        topRecycler.setLayoutManager(layoutManager);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        topRecycler.setLayoutManager(layoutManager);

        return topRecycler;
    }
}