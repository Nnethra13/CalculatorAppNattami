package com.example.calculatorappnattami;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView inputTV, resultTV;
    private String input = " ";
    private String output;

    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private Button addButton, subtractButton, multiplyButton, divideButton;
    private Button clearButton, allClearButton, enterButton, decimalButton;

    int numInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputTV = findViewById(R.id.inputTextView);
        resultTV = findViewById(R.id.resultTextView);
        enterButton = findViewById(R.id.enterButton);
        decimalButton = findViewById(R.id.decimalButton);
        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);
        divideButton = findViewById(R.id.divideButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        decimalButton = findViewById(R.id.decimalButton);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        clearButton = findViewById(R.id.clearButton);
        allClearButton = findViewById(R.id.allClearButton);
    }



    @Override
    public void onClick(View v){
        Button button = (Button) v;
        String buttonText = button.getText().toString();

        if(buttonText.equals("C")){
            inputTV.setText("");
            input = "";
            output = "";
        }
        else if(buttonText.equals("AC")){
            inputTV.setText("");
            resultTV.setText("");
            input = "";
            output = "";
        }
        else if(buttonText.equals("=")){
            solve();
        }
        else if(buttonText.equals("+")){
            solve();
            input+=" + ";
        }
        else if(buttonText.equals("-")){
            solve();
            input+=" - ";
        }
        else if(buttonText.equals("*")){
            solve();
            input+=" * ";
        }
        else if(buttonText.equals("/")){
            solve();
            input+=" / ";
        }
        else{
            input += buttonText;
        }

        inputTV.setText(input);

    }

    public void solve(){
        if(input.split("\\+").length == 2){
            // refreshed on split method
            String numbers[] = input.split("\\+");
            try{
                double dNum = Double.parseDouble(numbers[0]) + Double.parseDouble(numbers[1]);
                output = Double.toString(dNum);
                resultTV.setText(input + " = " + output);
                input = dNum + "";
                inputTV.setText(input);
            }
            catch (Exception e){
                resultTV.setError(e.getMessage().toString());
            }
        }

        if(input.split("\\-").length == 2) {
            String numbers[] = input.split("\\-");
            try {
                double dNum = Double.parseDouble(numbers[0]) - Double.parseDouble(numbers[1]);
                output = Double.toString(dNum);
                resultTV.setText(input + " = " + output);
                input = dNum + "";
                inputTV.setText(input);
            }
            catch (Exception e){
                resultTV.setError(e.getMessage().toString());
            }
        }

        if(input.split("\\*").length == 2){
            String numbers[] = input.split("\\*");
            try{
                double dNum = Double.parseDouble(numbers[0])*Double.parseDouble(numbers[1]);
                output = Double.toString(dNum);
                resultTV.setText(input + " = " + output);
                input = dNum + "";
                inputTV.setText(input);
            }
            catch (Exception e){
                resultTV.setError(e.getMessage().toString());
            }
        }

        if(input.split("\\/").length == 2){
            String numbers[] = input.split("\\/");
            try{
                double dNum = Double.parseDouble(numbers[0])/Double.parseDouble(numbers[1]);
                output = Double.toString(dNum);
                resultTV.setText(input + " = " + output);
                input = dNum + "";
                inputTV.setText(input);
            }
            catch (Exception e){
                resultTV.setError(e.getMessage().toString());
            }
        }

    }


}