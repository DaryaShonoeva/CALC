package com.geekbrains.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView firstNum;
    private TextView secondNum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        firstNum = findViewById(R.id.first_num);

        Button button0 = findViewById(R.id.button_0);
        Button button1 = findViewById(R.id.button_1);
        Button button2 = findViewById(R.id.button_2);
        Button button3 = findViewById(R.id.button_3);
        Button button4 = findViewById(R.id.button_4);
        Button button5 = findViewById(R.id.button_5);
        Button button6 = findViewById(R.id.button_6);
        Button button7 = findViewById(R.id.button_7);
        Button button8 = findViewById(R.id.button_8);
        Button button9 = findViewById(R.id.button_9);
        Button buttonMult = findViewById(R.id.button_mult);
        Button buttonDiv = findViewById(R.id.button_div);
        Button buttonAdd = findViewById(R.id.button_add);
        Button buttonSub = findViewById(R.id.button_sub);
        Button buttonEq = findViewById(R.id.button_eq);
        
        
        initButtonNumberClickListener(button1);


    }
    private void initButtonNumberClickListener(Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText(firstNum, button);
            }
        });
    }

    private void setText(TextView num, Button button){
        num.append(button.getText().toString());
    }
}