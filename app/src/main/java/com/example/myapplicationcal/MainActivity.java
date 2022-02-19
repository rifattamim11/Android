package com.example.myapplicationcal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView priview,secondaryview;
    String operator;
    Double num1,num2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        priview=findViewById(R.id.priviewID);
        secondaryview=findViewById(R.id.secondaryviewID);
    }

    public void numberFunction(View view) {
        String PrimaryValue=priview.getText().toString();
        if(PrimaryValue.equals("0")) {
            if (view.getId() == R.id.zero_btnID) {
                priview.setText("0");
            } else if (view.getId() == R.id.one_btnID) {
                priview.setText("1");
            } else if (view.getId() == R.id.two_btnID) {
                priview.setText("2");
            } else if (view.getId() == R.id.three_btnID) {
                priview.setText("3");
            } else if (view.getId() == R.id.four_btnID) {
                priview.setText("4");
            } else if (view.getId() == R.id.five_btnID) {
                priview.setText("5");
            } else if (view.getId() == R.id.six_btnID) {
                priview.setText("6");
            } else if (view.getId() == R.id.seven_btnID) {
                priview.setText("7");
            } else if (view.getId() == R.id.eight_btnID) {
                priview.setText("8");
            } else if (view.getId() == R.id.nine_btnID) {
                priview.setText("9");
            } else {
                priview.setText(".");
            }
        }
        else{
            if (view.getId() == R.id.zero_btnID) {
                priview.setText(PrimaryValue+"0");
            } else if (view.getId() == R.id.one_btnID) {
                priview.setText(PrimaryValue+"1");
            } else if (view.getId() == R.id.two_btnID) {
                priview.setText(PrimaryValue+"2");
            } else if (view.getId() == R.id.three_btnID) {
                priview.setText(PrimaryValue+"3");
            } else if (view.getId() == R.id.four_btnID) {
                priview.setText(PrimaryValue+"4");
            } else if (view.getId() == R.id.five_btnID) {
                priview.setText(PrimaryValue+"5");
            } else if (view.getId() == R.id.six_btnID) {
                priview.setText(PrimaryValue+"6");
            } else if (view.getId() == R.id.seven_btnID) {
                priview.setText(PrimaryValue+"7");
            } else if (view.getId() == R.id.eight_btnID) {
                priview.setText(PrimaryValue+"8");
            } else if (view.getId()==R.id.nine_btnID){
                priview.setText(PrimaryValue+"9");
            } else {
                priview.setText(PrimaryValue+".");
            }
        }
    }

    public void operatorFunction(View view) {
        String primaryvalue=priview.getText().toString();
        if(view.getId()==R.id.plusID){
            operator="+";
        }
        else if(view.getId()==R.id.subID){
            operator="-";
        }
        else if(view.getId()==R.id.multiplyID){
            operator="*";
        }
        else {
            operator="/";
        }
        secondaryview.setText(""+primaryvalue+" "+operator);
        priview.setText("0");
        num1=Double.parseDouble(primaryvalue);
    }

    public void resultFunction(View view) {
        String Primaryvalue=priview.getText().toString();
        num2=Double.parseDouble(Primaryvalue);
        if(operator.equals("+")){
            result=num1 + num2;
        }
        else if(operator.equals("-")){
            result=num1 - num2;
        }
        else if(operator.equals("*")){
            result=num1 * num2;
        }
        else {
            result=num1 / num2;
        }
        secondaryview.setText(num1+operator+num2+" ");
        priview.setText(""+result);
    }

    public void clearFunction(View view) {
        secondaryview.setText("");
        priview.setText("0");
        num2=0.0;
        num1=0.0;
        result=0.0;
        operator="";
    }

    public void clearPriView(View view) {
        secondaryview.getText().toString();
        priview.setText("0");
    }

    public void OnebyX(View view) {
        String primaryValue=priview.getText().toString();
        num1=Double.parseDouble(primaryValue);
        if(primaryValue.equals("0")){
            secondaryview.setText("1/("+primaryValue+")");
            priview.setText(primaryValue);
        }
        else{
            secondaryview.setText("1/("+primaryValue+")");
            result=1/num1;
            priview.setText(""+result);
        }
    }

    public void squer(View view) {
        String primaryValue=priview.getText().toString();
        num1=Double.parseDouble(primaryValue);
        if(primaryValue.equals("0")){
            secondaryview.setText("sqr("+primaryValue+")");
            priview.setText(primaryValue);
        }
        else{
            secondaryview.setText("sqr("+primaryValue+")");
            result=num1*num1;
            priview.setText(""+result);
        }
    }

    public void backFunction(View view) {

        String primaryValue=priview.getText().toString();
        if(primaryValue.length() != 0){
            primaryValue = primaryValue.substring(0,primaryValue.length() -1);
            priview.setText(primaryValue);
        }
    }

    public void percent(View view) {
        double num = Double.parseDouble(priview.getText().toString())/100;
        priview.setText(num+"");
    }
}