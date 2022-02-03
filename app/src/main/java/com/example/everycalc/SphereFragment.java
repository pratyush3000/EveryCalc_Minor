package com.example.everycalc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SphereFragment extends Fragment {
    EditText radius,height;
    TextView result;
    Button volume,tsa,csa;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_sphere, container, false);
        radius=view.findViewById(R.id.radius);
        result =view.findViewById(R.id.result);
        volume =view.findViewById(R.id.volume);
        csa =view.findViewById(R.id.csa);
        tsa =view.findViewById(R.id.tsa);
        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcVol();
            }
        });
        csa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcCSA();
            }
        });
        tsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcTSA();
            }
        });
        return view;
    }
    public void calcVol(){
        double r=0;
        String rad=radius.getText().toString();
        if (rad.matches("")) {
            result.setText("Field can't be Empty.");
            return;
        }
        r=Math.abs(Double.parseDouble(rad));
        result.setText("Volume: "+(1.333333333333333*3.142857142857143*r*r*r));
    }
    public void calcTSA(){
        double r=0;
        String rad=radius.getText().toString();
        if (rad.matches("")) {
            result.setText("Field can't be Empty.");
            return;
        }
        r=Math.abs(Double.parseDouble(rad));
        result.setText("Total Surface Area: "+(4*3.142857142857143*r*r));
    }
    public void calcCSA(){
        double r=0;
        String rad=radius.getText().toString();
        if (rad.matches("")) {
            result.setText("Field can't be Empty.");
            return;
        }
        r=Math.abs(Double.parseDouble(rad));
        result.setText("Curved Surface Area: "+(4*3.142857142857143*r*r));
    }
}