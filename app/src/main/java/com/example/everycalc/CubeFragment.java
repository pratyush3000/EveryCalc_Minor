package com.example.everycalc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CubeFragment extends Fragment {
    EditText side;
    TextView result;
    Button volume, tsa, lsa;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_cube, container, false);
        side=view.findViewById(R.id.side);
        result=view.findViewById(R.id.result);
        volume =view.findViewById(R.id.volume);
        lsa =view.findViewById(R.id.lsa);
        tsa =view.findViewById(R.id.tsa);
        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcVol();
            }
        });
        lsa.setOnClickListener(new View.OnClickListener() {
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
        double a=0;
        String rad=side.getText().toString();
        if (rad.matches("")) {
            result.setText("Field can't be Empty.");
            return;
        }
        a=Math.abs(Double.parseDouble(rad));
        result.setText("Volume: "+(a*a*a));
    }
    public void calcTSA(){
        double r=0;
        String rad=side.getText().toString();
        if (rad.matches("")) {
            result.setText("Field can't be Empty.");
            return;
        }
        r=Double.parseDouble(rad);
        result.setText("Total Surface Area: "+(6*(Math.abs(r)*(Math.abs(r)))));
    }
    public void calcCSA(){
        double r=0;
        String rad=side.getText().toString();
        if (rad.matches("")) {
            result.setText("Field can't be Empty.");
            return;
        }
        r=Double.parseDouble(rad);
        result.setText("Total Surface Area: "+(4*(Math.abs(r)*(Math.abs(r)))));
    }
}