package com.taeksukim.android.widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener{

    TextView result;
    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;

    Button plus1;
    Button minus1;
    Button multiply1;
    Button divide1;
    Button cancle1;
    Button run1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        result = (TextView) findViewById(R.id.result);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        plus1 = (Button) findViewById(R.id.plus1);
        minus1 = (Button) findViewById(R.id.minus1);
        multiply1 = (Button) findViewById(R.id.multiply1);
        divide1 = (Button) findViewById(R.id.divide1);
        cancle1 = (Button) findViewById(R.id.cancle1);
        run1 = (Button) findViewById(R.id.run1);


        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        cancle1.setOnClickListener(this);
        plus1.setOnClickListener(this);
        divide1.setOnClickListener(this);
        minus1.setOnClickListener(this);
        multiply1.setOnClickListener(this);





    }

    @Override
    public void onClick(View view) {


        switch(view.getId()) {

            case R.id.btn0:
                result.setText(result.getText() + "0");
                break;

            case R.id.btn1:
                result.setText(result.getText() + "1");
                break;

            case R.id.btn2:
                result.setText(result.getText() + "2");
                break;

            case R.id.btn3:
                result.setText(result.getText() + "3");
                break;

            case R.id.btn4:
                result.setText(result.getText() + "4");
                break;

            case R.id.btn5:
                result.setText(result.getText() + "5");
                break;

            case R.id.btn6:
                result.setText(result.getText() + "6");
                break;

            case R.id.btn7:
                result.setText(result.getText() + "7");
                break;

            case R.id.btn8:
                result.setText(result.getText() + "8");
                break;

            case R.id.btn9:
                result.setText(result.getText() + "9");
                break;

            case R.id.cancle1:
                result.setText("result : ");
                break;

            case R.id.run1:
                //result.setText();






                break;

            case R.id.plus1:
                result.setText(result.getText() + "+");
                break;

            case R.id.minus1:
                result.setText(result.getText() + "-");
                break;

            case R.id.multiply1:
                result.setText(result.getText() + "x");
                break;

            case R.id.divide1:
                result.setText(result.getText() + "/");
                break;

        }
    }
}
