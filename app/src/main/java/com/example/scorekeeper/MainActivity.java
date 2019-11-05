package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener, OnCheckedChangeListener {


    private Button button_increment1;
    private Button button_decrement1;
    private Button button_increment2;
    private Button button_decrement2;
    private TextView text_view1;
    private TextView text_view2;
    private RadioButton radioby1, radioby2, radioby3;
    private RadioGroup radioScoreGroup;
    int score1 = 0;
    int score2 = 0;
    int chngVal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_increment1 = (Button) findViewById(R.id.button_increment1);
        button_decrement1 = (Button) findViewById(R.id.button_decrement1);
        button_increment2 = (Button) findViewById(R.id.button_increment2);
        button_decrement2 = (Button) findViewById(R.id.button_decrement2);
        text_view1 = (TextView) findViewById(R.id.text_view1);
        text_view2 = (TextView) findViewById(R.id.text_view2);
        radioScoreGroup = (RadioGroup) findViewById(R.id.radioScoreGroup);

        button_increment1.setOnClickListener(this);
        button_decrement1.setOnClickListener(this);
        button_increment2.setOnClickListener(this);
        button_decrement2.setOnClickListener(this);
        radioScoreGroup.setOnCheckedChangeListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_increment1) {
            String a = text_view1.getText().toString();
            score1 = Integer.parseInt(a) + chngVal;
            text_view1.setText(Integer.toString(score1));

        }
        if (v.getId() == R.id.button_increment2) {
            String b = text_view2.getText().toString();
            score2 = Integer.parseInt(b) + chngVal;
            text_view2.setText(Integer.toString(score2));

        }
        if (v.getId() == R.id.button_decrement1) {
            String b = text_view1.getText().toString();
            score2 = Integer.parseInt(b) - chngVal;
            text_view1.setText(Integer.toString(score2));

        }
        if (v.getId() == R.id.button_decrement2) {
            String a = text_view2.getText().toString();
            score1 = Integer.parseInt(a) - chngVal;
            text_view2.setText(Integer.toString(score1));

        }

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        switch (checkedId) {
            case R.id.radioby1:
            default:
                chngVal = 1;
                break;
            case R.id.radioby2:
                chngVal = 2;
                break;
            case R.id.radioby3:
                chngVal = 3;
                break;
        }
    }


}
