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
    public void getTextValues(View v) {
        // reference to EditText's by locating its elements in the xml file
        // then convert to string then integer

        Button buttonAdd = findViewById(R.id.addButton);
        Button buttonSubtract = findViewById(R.id.subtractButton);



        // input 1
        EditText userInputEt1 = findViewById(R.id.inputEditNumberDecimal1);
        int input1 = userInputEt1.getInputType();

        // input 2
        EditText userInputEt2 = findViewById(R.id.inputEditNumberDecimal2);
        int input2 = userInputEt2.getInputType();


        // don't forget to CALL this method with the onClick
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

    @Override
    public void onClick(View view) {

    }
}