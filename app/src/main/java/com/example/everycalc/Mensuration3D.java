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


public class Mensuration3D extends Fragment {
    MaterialCardView cardViewCube;
    MaterialCardView cardViewCuboid;
    MaterialCardView cardViewCylinder;
    MaterialCardView cardViewCone;
    MaterialCardView cardViewSphere;
    MaterialCardView cardViewHemi;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_mensuration3_d, container, false);
        cardViewCube=view.findViewById(R.id.cubeMen3D);
        cardViewCuboid=view.findViewById(R.id.cardViewCuboid);
        cardViewCylinder=view.findViewById(R.id.cardViewCylinder);
        cardViewCone=view.findViewById(R.id.cardViewCone);
        cardViewSphere=view.findViewById(R.id.cardViewSphere);
        cardViewHemi=view.findViewById(R.id.cardViewHemi);
        cardViewCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_mensuration3D_to_cubeFragment);
            }
        });
        cardViewCuboid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_mensuration3D_to_cuboidFragment);
            }
        });
        cardViewCylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_mensuration3D_to_cylinderFragment);
            }
        });
        cardViewCone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_mensuration3D_to_coneFragment);
            }
        });
        cardViewSphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_mensuration3D_to_sphereFragment);
            }
        });
        cardViewHemi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_mensuration3D_to_hemiFragment);
            }
        });
    return view;
    }
}