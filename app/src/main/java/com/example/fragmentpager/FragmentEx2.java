package com.example.fragmentpager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class FragmentEx2 extends Fragment {
    public FragmentEx2() {
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
        View frag2View=inflater.inflate(R.layout.fragment_ex2, container, false);
        RadioGroup frag2rdoG=frag2View.findViewById(R.id.frag2rdoG);
        RadioButton frag2rdoDog=frag2View.findViewById(R.id.frag2rdoDog);
        RadioButton frag2rdoCat=frag2View.findViewById(R.id.frag2rdoCat);
        RadioButton frag2rdoRabbit=frag2View.findViewById(R.id.frag2rdoRabbit);
        ImageView frag2ivPet=frag2View.findViewById(R.id.frag2ivPet);

        frag2rdoDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag2ivPet.setImageResource(R.drawable.dog);
            }
        });
        frag2rdoCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag2ivPet.setImageResource(R.drawable.cat);
            }
        });
        frag2rdoRabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag2ivPet.setImageResource(R.drawable.rabbit);
            }
        });
        return frag2View;
    }
}