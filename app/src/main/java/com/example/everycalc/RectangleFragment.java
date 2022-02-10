package com.example.everycalc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class RectangleFragment extends Fragment {
    Button perimeter,area;
    EditText length, breadth;
    TextView result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_rectangle, container, false);
        length=view.findViewById(R.id.length);
        breadth=view.findViewById(R.id.breadth);
        result=view.findViewById(R.id.result);
        perimeter=view.findViewById(R.id.perimeter);
        area=view.findViewById(R.id.area);
        perimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcPerimeter();
            }
        });
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcArea();
            }
        });
        return view;
    }
    public void calcArea(){
        double l=0,b=0;
        String len=length.getText().toString();
        String bre=breadth.getText().toString();
        if (len.matches("") || bre.matches("")) {
            result.setText("Required fields can't be Empty.");
            return;
        }
        l=Double.parseDouble(len);
        b=Double.parseDouble(bre);
        result.setText("Area: "+(Math.abs(l)*Math.abs(b)));
    }
    public void calcPerimeter(){
        double l=0,b=0;
        String len=length.getText().toString();
        String bre=breadth.getText().toString();
        if (len.matches("") || bre.matches("")) {
            result.setText("Required fields can't be Empty.");
            return;
        }
        l=Double.parseDouble(len);
        b=Double.parseDouble(bre);
        result.setText("Perimeter: "+(2*(Math.abs(l)+Math.abs(b))));
    }
}