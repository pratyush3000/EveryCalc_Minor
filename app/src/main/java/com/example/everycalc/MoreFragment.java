package com.example.everycalc;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MoreFragment extends Fragment {
   CardView M2d,M3d,converterMenu,area,angle,volume,physicsMenu;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_more, container, false);
        M2d=view.findViewById(R.id.cardView2d);
        M3d=view.findViewById(R.id.cardView3d);
        converterMenu=view.findViewById(R.id.converterMenu);
        area=view.findViewById(R.id.areaConverter);
        angle=view.findViewById(R.id.angleConverter);
        volume=view.findViewById(R.id.volumeConverter);
        physicsMenu=view.findViewById(R.id.physicsMenu);

        M2d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_moreFragment_to_mensuration2D);
            }
        });
        M3d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_moreFragment_to_mensuration3D);
            }
        });
        converterMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_moreFragment_to_converterMenuFragment);
            }
        });
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_moreFragment_to_areaConverterFragment);
            }
        });
        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_moreFragment_to_angleConverterFragment);
            }
        });
        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_moreFragment_to_volumeConverterFragment);
            }
        });
        physicsMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_moreFragment_to_physicsMenuFragment);
            }
        });
        return view;
    }
}