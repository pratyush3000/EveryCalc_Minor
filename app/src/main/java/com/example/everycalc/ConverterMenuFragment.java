package com.example.everycalc;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ConverterMenuFragment extends Fragment {
    CardView volume,area,angle,energy,speed,temperature;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_converter_menu, container, false);

        volume = view.findViewById(R.id.volumeConverter);
        area = view.findViewById(R.id.areaConverter);
        angle = view.findViewById(R.id.angleConverter);
        energy = view.findViewById(R.id.energyConverter);
        speed = view.findViewById(R.id.speedConverter);
        temperature = view.findViewById(R.id.temperatureConverter);
        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_converterMenuFragment_to_volumeConverterFragment);
            }
        });
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_converterMenuFragment_to_areaConverterFragment);
            }
        });
        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_converterMenuFragment_to_angleConverterFragment);
            }
        });
        energy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_converterMenuFragment_to_energyConverterFragment);
            }
        });
        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_converterMenuFragment_to_speedConverterFragment);
            }
        });
        temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_converterMenuFragment_to_temperatureConverterFragment);
            }
        });
        return view;
    }
}