package com.example.everycalc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TriangleFragment extends Fragment {

    EditText side1,side2,side3;
    TextView result;
    Button area,perimeter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_triangle, container, false);
        side1=view.findViewById(R.id.side1);
        side2=view.findViewById(R.id.side2);
        side3=view.findViewById(R.id.side3);
        result= view.findViewById(R.id.result);
        area= view.findViewById(R.id.area);
        perimeter= view.findViewById(R.id.perimeter);
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcArea();
            }
        });
        perimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcPerimeter();
            }
        });
        return view;
    }
    public void calcArea(){
        double s1=0,s2=0,s3=0;
        String sd1=side1.getText().toString();
        String sd2=side2.getText().toString();
        String sd3=side3.getText().toString();
        if (sd1.matches("") || sd2.matches("")|| sd3.matches("")) {
            result.setText("Fields can't be Empty.");
            return;
        }
        s1=Double.parseDouble(sd1);
        s2=Double.parseDouble(sd2);
        s3=Double.parseDouble(sd3);
        double s=s1+s2+s3;
        double res=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        result.setText("Area: "+res);
    }
    public void calcPerimeter(){
        double s1=0,s2=0,s3=0;
        String sd1=side1.getText().toString();
        String sd2=side2.getText().toString();
        String sd3=side3.getText().toString();
        if (sd1.matches("") || sd2.matches("")|| sd3.matches("")) {
            result.setText("Fields can't be Empty.");
            return;
        }
        s1=Double.parseDouble(sd1);
        s2=Double.parseDouble(sd2);
        s3=Double.parseDouble(sd3);
        double s=s1+s2+s3;
        result.setText("Perimeter: "+s);
    }
}