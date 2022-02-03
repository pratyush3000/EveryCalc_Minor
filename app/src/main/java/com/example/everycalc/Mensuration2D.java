package com.example.everycalc;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavGraph;
import androidx.navigation.NavInflater;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.card.MaterialCardView;


public class Mensuration2D extends Fragment {
    MaterialCardView cardViewRectangle;
    MaterialCardView cardViewTriangle;
    MaterialCardView cardViewCircle;
    MaterialCardView cardViewRhombus;
    MaterialCardView cardViewParallelogram;
    MaterialCardView cardViewTrapezium;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_mensuration2_d, container, false);
        cardViewRectangle=view.findViewById(R.id.rectangle);
        cardViewTriangle=view.findViewById(R.id.triangle);
        cardViewCircle=view.findViewById(R.id.circle);
        cardViewRhombus=view.findViewById(R.id.rhombus);
        cardViewParallelogram=view.findViewById(R.id.parallelogram);
        cardViewTrapezium=view.findViewById(R.id.trapezium);
        cardViewRectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_mensuration2D_to_rectangleFragment);
            }
        });
        cardViewTriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_mensuration2D_to_triangleFragment);
            }
        });
        cardViewCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_mensuration2D_to_circleFragment);
            }
        });
        cardViewRhombus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_mensuration2D_to_rhombusFragment);
            }
        });
        cardViewParallelogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_mensuration2D_to_parallelogramFragment);
            }
        });
        cardViewTrapezium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_mensuration2D_to_trapeziumFragment);
            }
        });
        return view;
    }
}