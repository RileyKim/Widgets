package com.taeksukim.android.widgets;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TestActivity extends AppCompatActivity {

    ToggleButton mToggle;
    RadioGroup mRadioGroup;
    RadioButton mRadio1, mRadio2, mRadio3;
    TextView mText;
    EditText mEdit;
    CheckBox mCheckBox;
    SeekBar mSeekbar;
    Spinner mSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        mToggle = (ToggleButton) findViewById(R.id.toggleButton);
        mRadioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        mRadio1 = (RadioButton) findViewById(R.id.radioButton4);
        mRadio2 = (RadioButton) findViewById(R.id.radioButton5);
        mRadio3 = (RadioButton) findViewById(R.id.radioButton6);

        mText = (TextView) findViewById(R.id.textView10);
        mEdit = (EditText) findViewById(R.id.editText);
        mCheckBox = (CheckBox) findViewById(R.id.checkBox);
        mSeekbar = (SeekBar) findViewById(R.id.seekBar);
        mSpinner = (Spinner) findViewById(R.id.spinner);

        mToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    mText.setText("checked");
                }else{
                    mText.setText("Unchecked");
                }
            }
        });
        mSpinner.setAdapter(new SimpleAdapter());
        mSpinner.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return 5;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                return null;
            }
        });
        mSpinner.setOnItemSelectedListener();
    }
}
