package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    double number1, number2, answer;
    char ch='0';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.text1);
    }

    public void one(View view) {
        String str = result.getText().toString();
        result.setText(str + "1");
    }

    public void two(View view) {
        String str = result.getText().toString();
        result.setText(str + "2");
    }

    public void three(View view) {
        String str = result.getText().toString();
        result.setText(str + "3");
    }

    public void four(View view) {
        String str = result.getText().toString();
        result.setText(str + "4");
    }

    public void five(View view) {
        String str = result.getText().toString();
        result.setText(str + "5");
    }

    public void six(View view) {
        String str = result.getText().toString();
        result.setText(str + "6");
    }

    public void seven(View view) {
        String str = result.getText().toString();
        result.setText(str + "7");
    }

    public void eight(View view) {
        String str = result.getText().toString();
        result.setText(str + "8");
    }

    public void nine(View view) {
        String str = result.getText().toString();
        result.setText(str + "9");
    }

    public void zero(View view) {
        String str = result.getText().toString();
        if (str.length() != 0) {
            result.setText(str + "0");
        }
    }

    public void clear(View view) {
        result.setText(" ");
    }

    public void back(View view) {
        String str = result.getText().toString();
        if (str.length() != 0) {
            str = str.substring(0, str.length() - 1);
            result.setText(str);
        }
    }

    public void plus(View view){
        String str=result.getText().toString();
                number1=Double.parseDouble(str);
                result.setText("");
                ch='+';
    }
    public void minus(View view){
        String str=result.getText().toString();
        number1=Double.parseDouble(str);
        result.setText("");
        ch='-';
    }
    public void multiply(View view){
        String str=result.getText().toString();
        number1=Double.parseDouble(str);
        result.setText("");
        ch='*';
    }
    public void divided(View view){
        String str=result.getText().toString();
        number1=Double.parseDouble(str);
        result.setText("");
        ch='/';
    }
    public void equal(View view) {
        String str = result.getText().toString();
        number2=Double.parseDouble(str);
        if (ch=='+'){
            answer=number1+number2;
            str=String.valueOf(answer);
            result.setText(str);
            ch='0';
        }

        if (ch=='-'){
            answer=number1-number2;
            str=String.valueOf(answer);
            result.setText(str);
            ch='0';
        }

        if (ch=='*'){
            answer=number1*number2;
            str=String.valueOf(answer);
            result.setText(str);
            ch='0';
        }

        if (ch=='/'){
            answer=number1/number2;
            str=String.valueOf(answer);
            result.setText(str);
            ch='0';
        }

    }

}
