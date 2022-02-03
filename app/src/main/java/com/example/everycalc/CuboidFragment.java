package com.example.everycalc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CuboidFragment extends Fragment {
    Button volume, tsa, lsa;
    EditText length, breadth, height;
    TextView result;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_cuboid, container, false);
        length=view.findViewById(R.id.length);
        breadth=view.findViewById(R.id.breadth);
        height=view.findViewById(R.id.height);
        result= view.findViewById(R.id.result);
        volume=view.findViewById(R.id.volume);
        tsa=view.findViewById(R.id.tsa);
        lsa=view.findViewById(R.id.lsa);
        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcVol();
            }
        });
        lsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcLSA();
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
        double l=0,b=0,h=0;
        String len=length.getText().toString();
        String bre=breadth.getText().toString();
        String hei=height.getText().toString();
        if (len.matches("") || bre.matches("") || hei.matches("")) {
            result.setText("Both fields can't be Empty.");
            return;
        }
        l=Math.abs(Double.parseDouble(len));
        b=Math.abs(Double.parseDouble(bre));
        h=Math.abs(Double.parseDouble(hei));
        result.setText("Volume: "+(l*b*h));
    }
    public void calcLSA(){
        double l=0,b=0,h=0;
        String len=length.getText().toString();
        String bre=breadth.getText().toString();
        String hei=height.getText().toString();
        if (len.matches("") || bre.matches("") || hei.matches("")) {
            result.setText("Both fields can't be Empty.");
            return;
        }
        l=Math.abs(Double.parseDouble(len));
        b=Math.abs(Double.parseDouble(bre));
        h=Math.abs(Double.parseDouble(hei));
        result.setText("Lateral Surface Area: "+(2*h*(l+b)));
    }
    public void calcTSA(){
        double l=0,b=0,h=0;
        String len=length.getText().toString();
        String bre=breadth.getText().toString();
        String hei=height.getText().toString();
        if (len.matches("") || bre.matches("") || hei.matches("")) {
            result.setText("Both fields can't be Empty.");
            return;
        }
        l=Math.abs(Double.parseDouble(len));
        b=Math.abs(Double.parseDouble(bre));
        h=Math.abs(Double.parseDouble(hei));
        result.setText("Total Surface Area: "+(2*(l*b+b*h+h*l)));
    }
}