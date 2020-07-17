package com.example.differentway.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bper,bdiv,bdot,bcancel,bac,bequal,bbl;
    TextView result;
    double var1,var2;
    boolean ad,sub,mul,div,per;
    ImageButton button;
    String va;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        casting();
        setOnClick();

    }

    void casting()
    {
        b0=findViewById(R.id.btnZero);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
        b6=findViewById(R.id.btn6);
        b7=findViewById(R.id.btn7);
        b8=findViewById(R.id.btn8);
        b9=findViewById(R.id.btn9);
        badd=findViewById(R.id.btnAdd);
        bsub=findViewById(R.id.btnSub);
        bmul=findViewById(R.id.btnMul);
        bper=findViewById(R.id.btnPer);
        bdiv=findViewById(R.id.btnDiv);
        bdot=findViewById(R.id.btnDec);
        button=findViewById(R.id.btncan);
        bac=findViewById(R.id.btnAC);
        bequal=findViewById(R.id.btnEq);
        bbl=findViewById(R.id.btn);
        result=findViewById(R.id.Textview);
    }

    void setOnClick()
    {
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+".");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                var1=Double.parseDouble(result.getText()+"");
                ad=true;
                //result.setText(null);
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    var1=Double.parseDouble(result.getText()+"");
                    sub=true;
                    result.setText(null);

            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                var1=Double.parseDouble(result.getText()+"");
                mul=true;
                result.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                var1=Double.parseDouble(result.getText()+"");
                div=true;
                result.setText(null);
            }
        });
        bper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                var1=Double.parseDouble(result.getText()+"");
                per=true;
                result.setText(null);
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2=Double.parseDouble(result.getText()+"");
                if(ad==true)
                {
                    result.setText(var1+var2+"");
                    ad=false;
                }
                else if(sub==true)
                {
                    result.setText(var1-var2+"");
                    sub=false;
                }
                else if(mul==true)
                {
                    result.setText(var1*var2+"");
                    mul=false;
                }
                else if(div==true)
                {
                    if(var2==0)
                    {
                        result.setText("Cannot Divided by Zero");
                    }
                    else {
                        result.setText(var1/var2+"");
                        div=false;
                    }
                }
                else if (per==true)
                {
                    result.setText(var1*(var2/100)+"");
                    per=false;
                }
            }
        });
        bbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2=Double.parseDouble(result.getText()+"");
                if(ad==true)
                {
                    result.setText(var1+var2+"");
                    ad=false;
                }
                else if(sub==true)
                {
                    result.setText(var1-var2+"");
                    sub=false;
                }
                else if(mul==true)
                {
                    result.setText(var1*var2+"");
                    mul=false;
                }
                else if(div==true)
                {
                    if(var2==0)
                    {
                        result.setText("Cannot Divided by Zero");
                    }
                    else {
                        result.setText(var1/var2+"");
                        div=false;
                    }
                }
                else if (per==true)
                {
                    result.setText(var1*(var2/100)+"");
                    per=false;
                }
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(null);
            }
        });

    }

}
