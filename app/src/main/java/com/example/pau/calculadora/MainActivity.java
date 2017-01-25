package com.example.pau.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView input, output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView) findViewById(R.id.inputArea);
        output = (TextView) findViewById(R.id.outputArea);

        TextView equals = (TextView) findViewById(R.id.equalsButton);
        ImageView delButton = (ImageView) findViewById(R.id.delButton);
        ImageView acButton = (ImageView) findViewById(R.id.acButton);
        TextView mult = (TextView) findViewById(R.id.multButton);
        TextView div = (TextView) findViewById(R.id.divButton);
        TextView sum = (TextView) findViewById(R.id.sumButton);
        TextView sub = (TextView) findViewById(R.id.subButton);
        TextView lBracket = (TextView) findViewById(R.id.lBracket);
        TextView rBracket = (TextView) findViewById(R.id.rBracket);
        TextView point = (TextView) findViewById(R.id.pointButton);
        TextView num0 = (TextView) findViewById(R.id.num0);
        TextView num1 = (TextView) findViewById(R.id.num1);
        TextView num2 = (TextView) findViewById(R.id.num2);
        TextView num3 = (TextView) findViewById(R.id.num3);
        TextView num4 = (TextView) findViewById(R.id.num4);
        TextView num5 = (TextView) findViewById(R.id.num5);
        TextView num6 = (TextView) findViewById(R.id.num6);
        TextView num7 = (TextView) findViewById(R.id.num7);
        TextView num8 = (TextView) findViewById(R.id.num8);
        TextView num9 = (TextView) findViewById(R.id.num9);

        equals.setOnClickListener(this);
        delButton.setOnClickListener(this);
        acButton.setOnClickListener(this);
        mult.setOnClickListener(this);
        div.setOnClickListener(this);
        sum.setOnClickListener(this);
        sub.setOnClickListener(this);
        lBracket.setOnClickListener(this);
        rBracket.setOnClickListener(this);
        point.setOnClickListener(this);
        num0.setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.equalsButton:
                break;
            case R.id.delButton:
                String text = (String) input.getText();
                input.setText(text.substring(0,text.length()-1));
                break;
            case R.id.acButton:
                input.setText("");
                break;
            case R.id.multButton:
                input.append("x");
                break;
            case R.id.divButton:
                input.append("/");
                break;
            case R.id.sumButton:
                input.append("+");
                break;
            case R.id.subButton:
                input.append("-");
                break;
            case R.id.lBracket:
                input.append("(");
                break;
            case R.id.rBracket:
                input.append(")");
                break;
            case R.id.pointButton:
                input.append(".");
                break;
            case R.id.num0:
                input.append("0");
                break;
            case R.id.num1:
                input.append("1");
                break;
            case R.id.num2:
                input.append("2");
                break;
            case R.id.num3:
                input.append("3");
                break;
            case R.id.num4:
                input.append("4");
                break;
            case R.id.num5:
                input.append("5");
                break;
            case R.id.num6:
                input.append("6");
                break;
            case R.id.num7:
                input.append("7");
                break;
            case R.id.num8:
                input.append("8");
                break;
            case R.id.num9:
                input.append("9");
                break;
        }
    }
}
