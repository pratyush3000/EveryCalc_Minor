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


public class RhombusFragment extends Fragment {

    EditText side,diagonal1,diagonal2;
    TextView result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_rhombus, container, false);
        side =view.findViewById(R.id.side);
        diagonal1 =view.findViewById(R.id.diagonal1);
        diagonal2 =view.findViewById(R.id.diagonal2);
        result =view.findViewById(R.id.result);
        side.addTextChangedListener(new TextWatcher() {
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
        diagonal1.addTextChangedListener(new TextWatcher() {
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
        diagonal2.addTextChangedListener(new TextWatcher() {
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
    public void calc() {
        double s, d1, d2;
        String sd = side.getText().toString();
        String dg1 = diagonal1.getText().toString();
        String dg2 = diagonal2.getText().toString();
        if (sd.matches("") && dg1.matches("") && dg2.matches("")) {
            result.setText("Area: Required fields empty for calculating Area.\n\nPerimeter: Required fields empty for calculating Perimeter.");
            return;
        } else if (sd.matches("") && !dg1.equals("") && !dg2.equals("")) {
            d1 = Double.parseDouble(dg1);
            d2 = Double.parseDouble(dg2);
            result.setText("Area: "+(d1*d2)+"\n\nPerimeter: Required fields empty for calculating Perimeter.");
        } else if (!sd.equals("") && (dg1.matches("") || dg2.matches(""))) {
            s = Double.parseDouble(sd);
            result.setText("Area: Required fields empty for calculating Area.\n\nPerimeter: "+(4*s));
        } else if (!sd.equals("") && !dg1.equals("") && !dg2.equals("")) {
            s = Double.parseDouble(sd);
            d1 = Double.parseDouble(dg1);
            d2 = Double.parseDouble((dg2));
            result.setText("Area: " + (d1*d2) + "\n\nPerimeter: " + (4*s));
        } else {
            result.setText("Area: Required fields empty for calculating Area.\n Perimeter: Required fields empty for calculating Perimeter.");
            return;
        }
    }
}