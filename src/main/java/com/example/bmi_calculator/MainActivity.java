package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText weight,height;
    TextView resultText;
    String calculation,bmiResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight=findViewById(R.id.weight);
        height=findViewById(R.id.height);
        resultText=findViewById(R.id.result);
    }
    public void calculateBMI(View v){
        String s1=weight.getText().toString();
        String s2=height.getText().toString();

        float weightValue=Float.parseFloat(s1);
        float heightValue=Float.parseFloat(s2)/100;

        float bmi=weightValue/(heightValue*heightValue);

        if(bmi<16)
        {
            bmiResult="Severely under weight";
        }
        else if(bmi<18.5)
        {
            bmiResult="Under Weight";
        }
        else if (bmi>=18.5 && bmi<=24.9)
        {
            bmiResult="Normal Weight";
        }
        else if(bmi>=25 && bmi<=29.5)
        {
            bmiResult="Over Weight";
        }
        else
        {
            bmiResult="Obese";
        }

        calculation="Result:\n\n"+bmi+"\n\n"+bmiResult;
        resultText.setText(calculation);

    }
}