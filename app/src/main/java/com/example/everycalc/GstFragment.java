package com.example.everycalc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class GstFragment extends Fragment {

    EditText Amount,GstPer;
    Button Calculate;
    TextView result,result1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_g_s_t, container, false);
        Amount=view.findViewById(R.id.amount);
        GstPer=view.findViewById(R.id.gstPercent);
        result=view.findViewById(R.id.result);
        result1=view.findViewById(R.id.result1);
        Calculate=view.findViewById(R.id.Calculate);
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc();
            }
        });



          return view;
    }
    public void calc(){
        if(Amount.getText().toString().trim().length()>0&& GstPer.getText().toString().trim().length()>0) {
            float total = Float.parseFloat(Amount.getText().toString());
            float gst_percent = Float.parseFloat(GstPer.getText().toString());
            float gst_amount = (gst_percent / 100) * total;
            float total_amount = total + gst_amount;
            result.setText("Gst Amount: " + gst_amount);
            result1.setText("Net Amount:" + total_amount);

        }
        else {
            Toast.makeText(getActivity(), "Enter the values", Toast.LENGTH_SHORT).show();
        }


    }

}