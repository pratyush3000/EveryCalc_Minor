package com.example.everycalc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CircleFragment extends Fragment {

    EditText radius;
    TextView result;
    Button area,perimeter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_circle, container, false);
        radius=view.findViewById(R.id.radius);
        result=view.findViewById(R.id.result);
        area=view.findViewById(R.id.area);
        perimeter=view.findViewById(R.id.perimeter);
        perimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcArea();
            }
        });
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcPerimeter();
            }
        });
        return view;
    }
    public void calcArea(){
        double r=0;
        String rad=radius.getText().toString();
        if (rad.matches("")) {
            result.setText("Field can't be Empty.");
            return;
        }
        r=Double.parseDouble(rad);
        result.setText("Area: "+(3.142857142857143*r*r));
    }
    public void calcPerimeter(){
        double r=0;

        String rad=radius.getText().toString();
        if (rad.matches("")) {
            result.setText("Field can't be Empty.");
            return;
        }
        r=Double.parseDouble(rad);
        result.setText("Perimeter: "+(2*3.142857142857143*(Math.abs(r))));
    }
}