package com.example.bratabioskop;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class HorrorFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//        ArrayAdapter<String> adapter = new ArrayAdapter<>(
//                inflater.getContext(),
//                android.R.layout.simple_list_item_1,
//                getResources().getStringArray(R.array.horror));
//        setListAdapter(adapter);
//        return super.onCreateView(inflater, container, savedInstanceState);

        RecyclerView horrorRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_horror, container, false);

        String[] horrorNames = new String[Horror.horrors.length];
        for (int i = 0; i < horrorNames.length; i++) {
            horrorNames[i] = Horror.horrors[i].getName();
        }

        int[] horrorImages = new int[Horror.horrors.length];
        for (int i = 0; i < horrorImages.length; i++) {
            horrorImages[i] = Horror.horrors[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(horrorNames, horrorImages);
        horrorRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        horrorRecycler.setLayoutManager(layoutManager);

        return horrorRecycler;

    }
}