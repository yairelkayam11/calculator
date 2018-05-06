package com.example.j.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activitycalcul extends AppCompatActivity {

    TextView tv2;
    Button btn8;
    Intent gi = getIntent();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_activitycalcul);

        tv2 = (TextView) findViewById(R.id.tv2);
        btn8 = (Button) findViewById(R.id.btn8);


        tv2.setText("Last result : "+getIntent().getExtras().getString("key1"));
        tv2.setTextSize(30);




    }

    public void back(View view) {

        Intent t = new Intent(this, MainActivity.class);
        startActivity(t);
    }
}



