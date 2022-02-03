package com.example.everycalc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class TrapeziumFragment extends Fragment {

    EditText side1,side2,side3,side4,height;
    TextView result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_trapezium, container, false);;
        side1=view.findViewById(R.id.side1);
        side2=view.findViewById(R.id.side2);
        side3=view.findViewById(R.id.side3);
        side4=view.findViewById(R.id.side4);
        height=view.findViewById(R.id.height);
        result=view.findViewById(R.id.result);
        side1.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int aft) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                //call your function here of calculation here
                calc();

            }
        });
        side2.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int aft) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                //call your function here of calculation here
                calc();

            }
        });
        side3.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int aft) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                //call your function here of calculation here
                calc();

            }
        });
        side4.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int aft) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                //call your function here of calculation here
                calc();

            }
        });
        height.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int aft) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                //call your function here of calculation here
                calc();

            }
        });
        return view;
    }
    public void calc(){
        double h,s1,s2,s3,s4;
        String hei=height.getText().toString();
        String sd1=side1.getText().toString();
        String sd2=side1.getText().toString();
        String sd3=side3.getText().toString();
        String sd4=side4.getText().toString();
        if (hei.matches("") && sd3.matches("") && sd4.matches("")) {
            result.setText("Area: Required fields empty for calculating Area.\n Perimeter: Required fields empty for calculating Perimeter.");
            return;
        }
        else if(sd1.matches("") && sd2.matches("") && sd3.matches("") && sd4.matches("")){
            result.setText("Area: Required fields empty for calculating Area.\n Perimeter: Required fields empty for calculating Perimeter.");
            return;
        }
        else if(hei.matches("") && !sd1.equals("") && !sd2.equals("") && !sd3.equals("") && !sd4.equals("")){
            s1=Double.parseDouble(sd1);
            s2=Double.parseDouble(sd2);
            s3=Double.parseDouble(sd3);
            s4=Double.parseDouble(sd4);
            result.setText("Area: Required fields empty for calculating Area.\nPerimeter: "+(Math.abs(s1)+Math.abs(s2)+Math.abs(s3)+Math.abs(s4)));
        }
        else if(!hei.equals("") && !sd1.equals("") && !sd2.equals("") && !sd3.equals("") && !sd4.equals("")){
            s1=Double.parseDouble(sd1);
            s2=Double.parseDouble(sd2);
            s3=Double.parseDouble(sd3);
            s4=Double.parseDouble(sd4);
            h=Double.parseDouble(hei);
            result.setText("Area: "+(0.5*h*(s3+s4))+"\nPerimeter: "+(Math.abs(s1)+Math.abs(s2)+Math.abs(s3)+Math.abs(s4)));
        }
        else{
            result.setText("Area: Required fields empty for calculating Area.\n Perimeter: Required fields empty for calculating Perimeter.");
            return;
        }

    }
}