package com.example.bratabioskop;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


public class AdventureFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//        ArrayAdapter<String> adapter = new ArrayAdapter<>(
//                inflater.getContext(),
//                android.R.layout.simple_list_item_1,
//                getResources().getStringArray(R.array.adventure));
//        setListAdapter(adapter);
//        return super.onCreateView(inflater, container, savedInstanceState);

        RecyclerView adventureRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_adventure, container, false);

        String[] advenNames = new String[Adventure.adventures.length];
        for (int i = 0; i < advenNames.length; i++) {
            advenNames[i] = Adventure.adventures[i].getName();
        }

        int[] advenImages = new int[Adventure.adventures.length];
        for (int i = 0; i < advenImages.length; i++) {
            advenImages[i] = Adventure.adventures[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(advenNames, advenImages);
        adventureRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        adventureRecycler.setLayoutManager(layoutManager);

        return adventureRecycler;

    }
}