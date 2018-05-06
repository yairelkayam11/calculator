package com.example.j.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    EditText et1;
    double sum1 = 0;
    double var1;
    boolean bo1;
    boolean bo2;
    boolean bo3;
    boolean bo4;
    int counter1 = 0;
    int counter2=0 ;
    int x=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        et1 = (EditText) findViewById(R.id.et1);
    }




    public void yair1(View view) {//add

        counter1++;
        counter2++;
        x=x+counter2;


        String st = et1.getText().toString();
        var1 = Double.parseDouble(st);


        bo1 = true;
        bo2 = false;
        bo3 = false;
        bo4 = false;





        sum1 = sum1 + var1;

        et1.setText("  ");






    }


    public void yair2(View view) {//sub

        counter1++;
        counter2++;
        x=x+counter2;


        String st = et1.getText().toString();
        var1 = Double.parseDouble(st);


        if (counter1 == 1 && counter2 == 1) {
            sum1 = var1 * 2;
        }


        bo1 = false;
        bo2 = true;
        bo3 = false;
        bo4 = false;

        sum1 = sum1 - var1;

        et1.setText("  ");




    }


    public void yair3(View view) {//multi

        counter1++;
        counter2++;
        x=x+counter2;


        String st = et1.getText().toString();
        var1 = Double.parseDouble(st);


        if (counter1 == 1 && counter2 == 1) {

            sum1 = 1;
        }


        bo1 = false;
        bo2 = false;
        bo3 = true;
        bo4 = false;

        sum1 = sum1 * var1;

        et1.setText("  ");


    }






    public void yair4(View view) {//div

        counter1++;
        counter2++;
        x=x+counter2;




        String st = et1.getText().toString();
        var1 = Double.parseDouble(st);

        if (counter1==1&&counter2==1) {

            sum1 = var1 * var1;
        }



        bo1=false;
        bo2=false;
        bo3=false;
        bo4=true;

        if (var1 == 0) {
            Toast.makeText(this, "Math ERROR!", Toast.LENGTH_LONG).show();
        } else {
            sum1 = sum1 / var1;

        }

        et1.setText("  ");



    }


    public void yair5(View view) {
        sum1 = 0;
        et1.setText("");
        et1.setHint("Type here");
    }


    public void yair6(View view) {//equal


        String st = et1.getText().toString();
        var1 = Double.parseDouble(st);

        et1.setText("  ");


        if (bo1) {//add

            sum1 = sum1 + var1;

            Intent t1 = new Intent(this, Main2Activitycalcul.class);

            st = Double.toString(sum1);
            t1.putExtra("key1", st);
            startActivity(t1);

            if (bo2) {


                sum1 = sum1;

                Intent t2 = new Intent(this, Main2Activitycalcul.class);

                st = Double.toString(sum1);
                t2.putExtra("key1", st);
                startActivity(t2);
            }

            if (bo3) {

                sum1 = sum1;

                Intent t3 = new Intent(this, Main2Activitycalcul.class);

                st = Double.toString(sum1);
                t3.putExtra("key1", st);
                startActivity(t3);
            }

            if (bo4) {

                sum1 = sum1;

                Intent t4 = new Intent(this, Main2Activitycalcul.class);

                st = Double.toString(sum1);
                t4.putExtra("key1", st);
                startActivity(t4);
            }
        }


        if (bo2) {//sub

            sum1 = sum1 - var1;

            Intent t5 = new Intent(this, Main2Activitycalcul.class);

            st = Double.toString(sum1);
            t5.putExtra("key1", st);
            startActivity(t5);


            if (bo1) {

                sum1 = sum1;

                Intent t6 = new Intent(this, Main2Activitycalcul.class);

                st = Double.toString(sum1);
                t6.putExtra("key1", st);
                startActivity(t6);
            }
            if (bo3) {

                sum1 = sum1;

                Intent t = new Intent(this, Main2Activitycalcul.class);

                st = Double.toString(sum1);
                t.putExtra("key1", st);
                startActivity(t);

            }
            if (bo4) {

                sum1 = sum1;

                Intent t7 = new Intent(this, Main2Activitycalcul.class);

                st = Double.toString(sum1);
                t7.putExtra("key1", st);
                startActivity(t7);


            }
        }


        if (bo3) {//multi

            sum1 = sum1 * var1;

            Intent t8 = new Intent(this, Main2Activitycalcul.class);

            st = Double.toString(sum1);
            t8.putExtra("key1", st);
            startActivity(t8);

            if (bo1) {

                sum1 = sum1;

                Intent t9 = new Intent(this, Main2Activitycalcul.class);

                st = Double.toString(sum1);
                t9.putExtra("key1", st);
                startActivity(t9);
            }
            if (bo2) {

                sum1 = sum1;

                Intent t10 = new Intent(this, Main2Activitycalcul.class);

                st = Double.toString(sum1);
                t10.putExtra("key1", st);
                startActivity(t10);
            }
            if (bo4) {

                sum1 = sum1;

                Intent t11 = new Intent(this, Main2Activitycalcul.class);

                st = Double.toString(sum1);
                t11.putExtra("key1", st);
                startActivity(t11);


            }
        }


        if (bo4) {//div

            sum1 = sum1 / var1;

            Intent t12 = new Intent(this, Main2Activitycalcul.class);

            st = Double.toString(sum1);
            t12.putExtra("key1", st);
            startActivity(t12);


            if (bo1) {

                sum1 = sum1;

                Intent t13 = new Intent(this, Main2Activitycalcul.class);

                st = Double.toString(sum1);
                t13.putExtra("key1", st);
                startActivity(t13);
            }
            if (bo2) {

                sum1 = sum1;

                Intent t14 = new Intent(this, Main2Activitycalcul.class);

                st = Double.toString(sum1);
                t14.putExtra("key1", st);
                startActivity(t14);
            }
            if (bo3) {

                sum1 = sum1 * var1;

                Intent t15 = new Intent(this, Main2Activitycalcul.class);

                st = Double.toString(sum1);
                t15.putExtra("key1", st);
                startActivity(t15);

            }
        }
    }




    public void go(View view) {

        Intent t = new Intent(this, Main2Activitycalcul.class);
        startActivity(t);

    }
}



















