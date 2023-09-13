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


    // TextView variables

    TextView inputTV, resultTV;

    // private instance variables to save values taken from the user input then set equal to the answer also and displayed
    private String input = " ";
    private String output;


    // all button variables
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button addButton, subtractButton, multiplyButton, divideButton;
    Button clearButton, allClearButton, enterButton, decimalButton;

    int numInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // process everything in the onCreate by referring to the View being used in the app
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


    // user can only use the buttons to calculate and not a keyboard as it is a textView not editText
    /**
     * the onClick method is called for each of the buttons and depending on the button,
     * whatever the button does is implemented here - whether its to do a mathematical operation,
     * clear the box, or get the answer (when hitting equals).
     * @param v takes in the button that is clicked
     */
    @Override
    public void onClick(View v){
        Button button = (Button) v;
        // getting what button it is by getting the text on the button
        String buttonText = button.getText().toString();

        // clear button
        if(buttonText.equals("C")){
            inputTV.setText("");
            input = "";
            output = "";
        }

        // all clear button (clears the box above with the prior equation as well)
        else if(buttonText.equals("AC")){
            inputTV.setText("");
            resultTV.setText("");
            input = "";
            output = "";
        }

        // equals button calls solve()
        else if(buttonText.equals("=")){
            solve();
        }

        // addition button calls solve()
        else if(buttonText.equals("+")){
            solve();
            input+=" + ";
        }

        // subtract button calls solve()
        else if(buttonText.equals("-")){
            solve();
            input+=" - ";
        }

        // multiplication button calls solve()
        else if(buttonText.equals("*")){
            solve();
            input+=" * ";
        }

        // division button calls solve()
        else if(buttonText.equals("/")){
            solve();
            input+=" / ";
        }

        // for the number buttons the number is just displayed
        else{
            input += buttonText;
        }

        // displays what buttons the user presses in the textView
        inputTV.setText(input);

    }


    /**
     * the solve function is used to solve mathematical operations (add, subtract, multiply, and divide)
     * its called when one of the mathematical operations and the equals signed are clicked on
     * so the expression can be solved and displayed in the resultTV with the answer and the inputTV with just the answer
     */

    public void solve(){
        // this first statement is for when the expression is using addition it splits
        // the string into separate strings that are put into an array with just the numbers (as strings)
        // then the strings are made into doubles using parseDouble and are added together.
        // the answer and expression are displayed in the right boxes
        if(input.split("\\+").length == 2){
            // refreshed on split method
            String numbers[] = input.split("\\+");
            try{
                double dNum = Double.parseDouble(numbers[0]) + Double.parseDouble(numbers[1]);
                // exclamation error appears here for some reason
                // but solves correctly
                output = Double.toString(dNum);
                resultTV.setText(input + " = " + output);
                input = dNum + "";
                inputTV.setText(input);
            }
            // will catch an error and not break
            catch (Exception e){
                resultTV.setError(e.getMessage().toString());
            }
        }

        // same as addition but for subtraction
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

        // same as addition but for multiplication
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

        // same as addition but for division
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