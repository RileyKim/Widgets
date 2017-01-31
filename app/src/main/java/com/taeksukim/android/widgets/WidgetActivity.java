package com.taeksukim.android.widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class WidgetActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    ToggleButton tb;
    CheckBox hi;
    CheckBox hello;
    CheckBox bye;

    RadioGroup rg;
    Spinner sp;
    SeekBar sb;
    TextView seekTv;

    ArrayList<String> months= new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget);
        // 1. 컴파운드 계열 버튼 생성
        tb = (ToggleButton) findViewById(R.id.togglebutton);
        hi = (CheckBox) findViewById(R.id.cb1);
        hello = (CheckBox) findViewById(R.id.cb2);
        bye = (CheckBox) findViewById(R.id.cb2);


        // 1.1 컴파운드 계열 리스너 등록
        tb.setOnCheckedChangeListener(this);
        hi.setOnCheckedChangeListener(this);
        hello.setOnCheckedChangeListener(this);
        bye.setOnCheckedChangeListener(this);

        //라디오
        rg = (RadioGroup) findViewById(R.id.rb);
        // 1. 라디오 그룹 리스너 생성 및 등록 같이하기
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int button_id) {
                switch(button_id){
                    case R.id.rb1:
                        Toast.makeText(WidgetActivity.this, "rb1 라디오 버튼", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.rb2:
                        Toast.makeText(WidgetActivity.this, "rb2 라디오 버튼", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.rb3:
                        Toast.makeText(WidgetActivity.this, "rb3 라디오 버튼", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });


        //3. 스피너
        sp = (Spinner) findViewById(R.id.sp);

        //3. pre스피너에 들어갈 데이터를 동적으로 정의하세요
        // 데이터는 올해부터 100년 전까지
        // month[0] = "1917";
        for(int index = 2017; index < 2017-100; index--) {
            months.add(index+"");
        }

        //3.1 스피너 데이터 아탑터로 생성
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_dropdown_item, months
                    //컨텍스트          스피너에서 사용할 레이아웃          배열데이터
        );
        //3.2 스피너에 아답터 등록
        sp.setAdapter(adapter);
        //3.3 스피너 리스너에 등록
        sp.setOnItemSelectedListener( new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(WidgetActivity.this, "선택된 아이템 =" + months.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sb = (SeekBar) findViewById(R.id.sb);
        seekTv = (TextView) findViewById(R.id.seekTv);

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            //4.1.2 seekbar를 움직이면 호출되는 함수
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekTv.setText( progress + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }


    @Override
    public void onCheckedChanged(CompoundButton cb, boolean flag) {
        switch (cb.getId()) {
            case R.id.togglebutton:
                Toast.makeText(this, "토글됨 ="+flag, Toast.LENGTH_SHORT).show();
                break;

            case R.id.cb1:
                Toast.makeText(this, "hi ="+flag, Toast.LENGTH_SHORT).show();
                break;

            case R.id.cb2:
                Toast.makeText(this, "hello" + flag, Toast.LENGTH_SHORT).show();

            case R.id.cb3:
                Toast.makeText(this, "bye" + flag, Toast.LENGTH_SHORT).show();
        }
    }
}
