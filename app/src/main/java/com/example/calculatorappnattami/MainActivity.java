package com.example.calculatorappnattami;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v){

    }
    public void getInputs(View v) {
        // reference to EditText's by locating its elements in the xml file
        // then convert to string then integer

        Button buttonAdd = findViewById(R.id.addButton);
        Button buttonSubtract = findViewById(R.id.subtractButton);
        Button buttonDivide = findViewById(R.id.divideButton);
        Button buttonMultiply = findViewById(R.id.multiplyButton);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);







        // input 1
        EditText userInputEt1 = findViewById(R.id.inputEditNumberDecimal1);
        double input1 = userInputEt1.getInputType();

        // input 2
        EditText userInputEt2 = findViewById(R.id.inputEditNumberDecimal2);
        double input2 = userInputEt2.getInputType();




        // don't forget to CALL this method with the onClick
    }
    public void solve(){

    }


    public void buttonSelect(View v){
        int numInput;
        if(v.getId() == R.id.button1){
            numInput = 1;
        }
        else if(v.getId() == R.id.button2){
            numInput = 2;
        }
        else if(v.getId() == R.id.button3){
            numInput = 3;
        }
        else if(v.getId() == R.id.button4){
            numInput = 4;
        }
        else if(v.getId() == R.id.button5){
            numInput = 5;
        }
        else if(v.getId() == R.id.button6){
            numInput = 6;
        }
        else if(v.getId() == R.id.button7){
            numInput = 7;
        }
        else if(v.getId() == R.id.button8){
            numInput = 8;
        }
        else if(v.getId() == R.id.button9){
            numInput = 9;
        }
        else if(v.getId() == R.id.button0){
            numInput = 0;
        }
    }



}