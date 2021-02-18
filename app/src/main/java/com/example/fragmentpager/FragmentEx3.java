package com.example.fragmentpager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FragmentEx3 extends Fragment {

    int pos=0;
    public FragmentEx3() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View frag3View=inflater.inflate(R.layout.fragment_ex3, container, false);
        int imgIDs[]={R.drawable.corona, R.drawable.coronahand, R.drawable.coronamask};
        ImageView frag3ivCorona=frag3View.findViewById(R.id.frag3imgCorona);
        frag3ivCorona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pos++;
                if(pos==imgIDs.length){
                    pos=0;
                }
                frag3ivCorona.setImageResource(imgIDs[pos]);
            }
        });
        return frag3View;
    }
}