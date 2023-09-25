package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void add(View view){

        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);

        int n1 = Integer.parseInt(firstNum.getText().toString());
        int n2 = Integer.parseInt(secondNum.getText().toString());

        int result = n1 + n2;
        String strRes= "" + result;


        goToActivity(strRes);

    }

    public void subtract(View view){

        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);

        int n1 = Integer.parseInt(firstNum.getText().toString());
        int n2 = Integer.parseInt(secondNum.getText().toString());

        int result = n1 - n2;
        String strRes= "" + result;

        goToActivity(strRes);

    }

    public void multiply(View view){

        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);

        int n1 = Integer.parseInt(firstNum.getText().toString());
        int n2 = Integer.parseInt(secondNum.getText().toString());

        int result = n1 * n2;
        String strRes= "" + result;

        goToActivity(strRes);

    }

    public void divide(View view){

        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);

        double n1 = Double.parseDouble(firstNum.getText().toString());
        double n2 = Double.parseDouble(secondNum.getText().toString());

        String strRes = "";
        if(n2 == 0){
            strRes = "Sorry, we cannot divide by 0. Please try again";

        }
        else{

            double result = n1 / n2;
            strRes = "" + result;

        }

        goToActivity(strRes);

    }

    public void goToActivity(String s){
        Intent intent = new Intent(this, Answer.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}