package com.example.everycalc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ConeFragment extends Fragment {
    Button volume, csa, tsa;
    EditText radius, height;
    TextView result;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_cone, container, false);
        radius=view.findViewById(R.id.radius);
        height=view.findViewById(R.id.height);
        result=view.findViewById(R.id.result);
        volume=view.findViewById(R.id.volume);
        csa=view.findViewById(R.id.csa);
        tsa=view.findViewById(R.id.tsa);
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
        double r=0,l=0,h=0;
        String rad=radius.getText().toString();
        String hei=height.getText().toString();
        if (rad.matches("") || hei.matches("")) {
            result.setText("Required fields can't be Empty.");
            return;
        }
        r=Math.abs(Double.parseDouble(rad));
        h=Math.abs(Double.parseDouble(hei));
        l=Math.sqrt((r*r)+(h*h));
        result.setText("Slant Length:"+String.format("%.8f",l)+"\nTotal Surface Area: "+String.format("%.8f",((0.3333333333333333*3.142857142857143*(r*r)*h))));
    }
    public void calcCSA(){
        double r=0,l=0,h=0;
        String rad=radius.getText().toString();
        String hei=height.getText().toString();
        if (rad.matches("") || hei.matches("")) {
            result.setText("Required fields can't be Empty.");
            return;
        }
        r=Math.abs(Double.parseDouble(rad));
        h=Math.abs(Double.parseDouble(hei));
        l=Math.sqrt((r*r)+(h*h));
        result.setText("Slant Length:"+String.format("%.8f",l)+"\nCurved Surface Area: "+String.format("%.8f",((3.142857142857143*r*l))));
    }
    public void calcTSA(){
        double r=0,l=0,h=0;
        String rad=radius.getText().toString();
        String hei=height.getText().toString();
        if (rad.matches("") || hei.matches("")) {
            result.setText("Required fields can't be Empty.");
            return;
        }
        r=Math.abs(Double.parseDouble(rad));
        h=Math.abs(Double.parseDouble(hei));
        l=Math.sqrt((r*r)+(h*h));
        result.setText("Slant Length:"+String.format("%.8f",l)+"\nTotal Surface Area: "+String.format("%.8f",(3.142857142857143*r*(r+l))));
    }
}