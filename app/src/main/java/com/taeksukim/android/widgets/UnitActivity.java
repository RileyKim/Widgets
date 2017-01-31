package com.taeksukim.android.widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class UnitActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnLength, btnArea, btnWeight;
    LinearLayout layoutLength, layoutArea, layoutWeight;
    TextView mm, cm, m, km, inch, ft, yd, mile;
    EditText num1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit);

        //1. 위젯 가져오기
        btnLength = (Button) findViewById(R.id.btnLength);
        btnArea = (Button) findViewById(R.id.btnArea);
        btnWeight = (Button) findViewById(R.id.btnWeight);

        btnLength.setOnClickListener(this);
        btnArea.setOnClickListener(this);
        btnWeight.setOnClickListener(this);

        layoutLength = (LinearLayout) findViewById(R.id.layoutLength);
        layoutArea = (LinearLayout) findViewById(R.id.layoutArea);
        layoutWeight = (LinearLayout) findViewById(R.id.layoutWeight);

        mm = (TextView) findViewById(R.id.textView1);
        cm = (TextView) findViewById(R.id.textView2);
        m = (TextView) findViewById(R.id.textView3);
        km = (TextView) findViewById(R.id.textView4);
        inch = (TextView) findViewById(R.id.textView5);
        ft = (TextView) findViewById(R.id.textView6);
        yd = (TextView) findViewById(R.id.textView7);
        mile = (TextView) findViewById(R.id.textView8);

        num1 = (EditText) findViewById(R.id.num1);

        num1.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



    }


            @Override
            public void onClick(View view) {
                layoutLength.setVisibility(View.GONE);
                layoutArea.setVisibility(View.GONE);
                layoutWeight.setVisibility(View.GONE);
                switch(view.getId()) {
                    case R.id.btnLength:
                        layoutLength.setVisibility(View.VISIBLE);
                        layoutArea.setVisibility(View.GONE);
                        layoutWeight.setVisibility(View.GONE);
                        break;

                    case R.id.btnArea:
                        layoutLength.setVisibility(View.GONE);
                        layoutArea.setVisibility(View.VISIBLE);
                        layoutWeight.setVisibility(View.GONE);
                        break;

                    case R.id.btnWeight:
                        layoutLength.setVisibility(View.GONE);
                        layoutArea.setVisibility(View.GONE);
                        layoutWeight.setVisibility(View.VISIBLE);
                        break;

                }
            }
        };


