package com.taeksukim.android.widgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //1. 위젝을 정의한다.
    Button btn;
    Button cal;
    Button Widget;
    Button unit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //2. 정의된 위젯 변수에 xml의 위젝 id를 가져와서 담아준다.
        btn = (Button) findViewById(R.id.btnGrid);
        //3. 변수(위젯)을 리스너에 달아준다.
        btn.setOnClickListener(this);

        cal = (Button) findViewById(R.id.cal);
        cal.setOnClickListener(this);

        Widget = (Button) findViewById(R.id.btnWidget);
        Widget.setOnClickListener(this);

        unit = (Button) findViewById(R.id.btnUnit);
        unit.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent intent;
        switch(view.getId()) {
            case R.id.btnGrid:
                //안드로이드 메이저 컴포넌트를 로드하기 위해서는
                // intent를 통해서 로드할 컴포넌트를 지정해야한다.
                intent = new Intent(this, GridActivity.class);
                                            //^ 대상이되는 컴포넌트
                startActivity(intent);
                break;

            case R.id.cal:
                intent = new Intent(this, CalculatorActivity.class);

                startActivity(intent);
                break;

            case R.id.btnWidget:
                intent = new Intent(this, WidgetActivity.class);

                startActivity(intent);
                break;

            case R.id.btnUnit:
                intent = new Intent(this, UnitActivity.class);

                startActivity(intent);
                break;
        }
    }
}
