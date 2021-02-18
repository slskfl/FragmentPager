package com.example.fragmentpager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentEx1 extends Fragment {

    public FragmentEx1() {
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
        View frag1View=inflater.inflate(R.layout.fragment_ex1, container, false);
        Button frag1btnHello=frag1View.findViewById(R.id.frag1btnHello);
        frag1btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "안녕하세요 여러분", Toast.LENGTH_SHORT).show();
            }
        });
        return frag1View;
    }
}