package com.example.everycalc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class CalcFragment extends Fragment {
    private TextView textView;
    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,advance;
    private Button buttonAC, buttonPlus, buttonMinus, buttonPercent, buttonMultiply, buttonBack, buttonDivide, buttonEqual, buttonDot, buttonSquare;
    private String input,output,number[];

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_calc, container, false);
        textView=view.findViewById(R.id.textView);
        button0=view.findViewById(R.id.button0);
        button1=view.findViewById(R.id.button1);
        button2=view.findViewById(R.id.button2);
        button3=view.findViewById(R.id.button3);
        button4=view.findViewById(R.id.button4);
        button5=view.findViewById(R.id.button5);
        button6=view.findViewById(R.id.button6);
        button7=view.findViewById(R.id.button7);
        button8=view.findViewById(R.id.button8);
        button9=view.findViewById(R.id.button9);
        buttonAC=view.findViewById(R.id.buttonAC);
        buttonPlus=view.findViewById(R.id.buttonPlus);
        buttonMinus=view.findViewById(R.id.buttonMinus);
        buttonPercent=view.findViewById(R.id.buttonPercent);
        buttonMultiply=view.findViewById(R.id.buttonMultiply);
        buttonDivide=view.findViewById(R.id.buttonDivide);
        buttonBack=view.findViewById(R.id.buttonBack);
        buttonEqual=view.findViewById(R.id.buttonEqual);
        buttonDot=view.findViewById(R.id.buttonDot);
        buttonSquare=view.findViewById(R.id.buttonSquare);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1=button0.getText().toString();
                calculate(data1);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1=button1.getText().toString();
                calculate(data1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1=button2.getText().toString();
                calculate(data1);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1=button3.getText().toString();
                calculate(data1);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1=button4.getText().toString();
                calculate(data1);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1=button5.getText().toString();
                calculate(data1);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1=button6.getText().toString();
                calculate(data1);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1=button7.getText().toString();
                calculate(data1);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1=button8.getText().toString();
                calculate(data1);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1=button9.getText().toString();
                calculate(data1);
            }
        });
        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1=buttonAC.getText().toString();
                calculate(data1);
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1=buttonPlus.getText().toString();
                calculate(data1);
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1=buttonMinus.getText().toString();
                calculate(data1);
            }
        });
        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1=buttonPercent.getText().toString();
                calculate(data1);
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1=buttonMultiply.getText().toString();
                calculate(data1);
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1=buttonDivide.getText().toString();
                calculate(data1);
            }
        });
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1=buttonBack.getText().toString();
                calculate(data1);
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1=buttonEqual.getText().toString();
                calculate(data1);
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1=buttonDot.getText().toString();
                calculate(data1);
            }
        });
        buttonSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1=buttonSquare.getText().toString();
                calculate(data1);
            }
        });
        advance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdvKeyFragment adv=new AdvKeyFragment();
                
            }
        });


        return view;
    }
    public void calculate(String btdata){
        String data=btdata;
        switch(data){
            case "AC":
                textView.setText("");
                input="";
                break;
            case "x":
                Solve();
                input+="x";
                textView.setText(input);
                break;
            case "÷":
                Solve();
                input+="÷";
                textView.setText(input);
                break;
            case "^":
                Solve();
                input+="^";
                textView.setText(input);
                break;
            /*case "√":
                Solve();
                input+="√"+input;
                textView.setText(input);
                break;*/
            case "=":
                Solve();
                output=input;
                break;
            case "⌫":
                String newText=input.substring(0,input.length()-1);
                input=newText;
                textView.setText(input);
                break;
            default:
                if(input==null)
                    input="";
                else if(data.equals("+")||data.equals("-")||data.equals("/"))
                    Solve();
                input+=data;
                textView.setText(input);
        }
    }
    private void Solve(){
        if(input.split("x").length==2) {
            number = input.split("x");
            try{
                double mul=Double.parseDouble(number[0])*Double.parseDouble(number[1]);
                input=mul+"";
            }
            catch(Exception e){
            }
        }
        else if(input.split("÷").length>1) {
            number = input.split("÷");
            try{
                double div=Double.parseDouble(number[0])/Double.parseDouble(number[1]);
                input=div+"";
            }
            catch(Exception e){
            }
        }
        /*else if(input.split("√").length==1) {
            number = input.split("√");
            try{
                double sqrt=Math.sqrt(Double.parseDouble(number[0]));
                input=sqrt+"";
            }
            catch(Exception e){
            }
        }*/
        else if(input.split("\\^").length>1) {
            number = input.split("\\^");
            try{
                double pow=Math.pow(Double.parseDouble(number[0]),Double.parseDouble(number[1]));
                input=pow+"";
            }
            catch(Exception e){
            }
        }
        else if(input.split("\\+").length==2) {
            number = input.split("\\+");
            try{
                double add=Double.parseDouble(number[0])+Double.parseDouble(number[1]);
                input=add+"";
            }
            catch(Exception e){
            }
        }
        else if(input.split("-").length>1) {
            number = input.split("-");
            if(number[0]==""&& number.length==2)
                number[0]=0+"";
            try{
                double sub=0;
                if(number.length==2)
                    sub=Double.parseDouble(number[0]) - Double.parseDouble(number[1]);
                else if(number.length==3)
                    sub=Double.parseDouble(number[1]) - Double.parseDouble(number[2]);
                input=sub+"";
            }
            catch(Exception e){
            }
        }
        String n[]=input.split("\\.");
        if(n.length>1){
            if(n[1].equals("0"))
                input=n[0];
        }
        textView.setText(input);
    }
}