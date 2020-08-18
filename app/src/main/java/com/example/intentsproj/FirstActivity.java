package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    public static final String No1 = "com.example.IntentsProj.num1";
    public static final String No2 = "com.example.IntentsProj.num2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);

        Button btn= (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondActivity();
            }

        public void openSecondActivity(){

            EditText t1 = (EditText)findViewById(R.id.num1);
            int no1 = Integer.parseInt(num1.getText().toString());

            EditText t2 = (EditText)findViewById(R.id.num2);
            int no2 = Integer.parseInt(num2.getText().toString());

            Intent intent = new Intent(FirstActivity.this , SecondActivity.class);

            intent.putExtra(No1,no1);
            intent.putExtra(No2,no2);

            startActivity(intent);
        }

        });
        /* Context context = getApplicationContext(); //The context to
        use. Usually your Application or Activity object
        CharSequence message = "You just clicked the OK button";
//Display string
        int duration = Toast.LENGTH_SHORT; //How long the toast
        message will lasts
        Toast toast = Toast.makeText(context, "Select the OK button", duration);
        toast.show(); */
    }

}