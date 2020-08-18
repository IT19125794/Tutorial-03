package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private EditText numb1;
    private EditText numb2;
    protected Button add;
    protected Button sub;
    protected Button mul;
    protected Button div;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Intent intent = getIntent();

        String no1 = intent.getStringExtra(FirstActivity.num1, 0);
        String no2 = intent.getStringExtra(FirstActivity.num2, 0);

        EditText t1 = (EditText)findViewById(R.id.numb1);
        EditText t2 = (EditText)findViewById(R.id.numb2);

        numb1.setText(" " + no1);
        numb2.setText(" " + no2);

        numb1 = (EditText)findViewById(R.id.num1);
        numb2 = (EditText)findViewById(R.id.num2);
        add = (Button)findViewById(R.id.add);
        sub = (Button)findViewById(R.id.sub);
        mul = (Button)findViewById(R.id.mul);
        div = (Button)findViewById(R.id.div);
        result = (TextView)findViewById(R.id.result);

        Button add = (Button) findViewById(R.id.add);
        add.setOnClickListener((v) {
            if((numb1.getText().length()>0 && (numb2.getText().length()>0)){
                double n1 = Double.parseDouble(numb1.getText().toString());
                double n2 = Double.parseDouble(numb2.getText().toString());
                double results = n1 + n2;
                result.setText(Double.toString(results));
        }
        });

        Button sub = (Button) findViewById(R.id.sub);
        add.setOnClickListener((v) {
        if((numb1.getText().length()>0 && (numb2.getText().length()>0)){
            double n1 = Double.parseDouble(numb1.getText().toString());
            double n2 = Double.parseDouble(numb2.getText().toString());
            double results = n1 - n2;
            result.setText(Double.toString(results));
        }
        });

        Button mul = (Button) findViewById(R.id.mul);
        add.setOnClickListener((v) {
        if((numb1.getText().length()>0 && (numb2.getText().length()>0)){
            double n1 = Double.parseDouble(numb1.getText().toString());
            double n2 = Double.parseDouble(numb2.getText().toString());
            double results = n1 * n2;
            result.setText(Double.toString(results));
        }
        });

        Button div = (Button) findViewById(R.id.div);
        add.setOnClickListener((v) {
        if((numb1.getText().length()>0 && (numb2.getText().length()>0)){
            double n1 = Double.parseDouble(numb1.getText().toString());
            double n2 = Double.parseDouble(numb2.getText().toString());
            double results = n1 / n2;
            result.setText(Double.toString(results));
        }
        });

    }
}