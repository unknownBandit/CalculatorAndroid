package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    private EditText _display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        _display = findViewById(R.id.input1);

        _display.setShowSoftInputOnFocus(false);

        _display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getString(R.string.display).equals(_display.getText().toString())){
                    _display.setText("");
                }
            }
        });

        /*_display.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(getString(R.string.display).equals(_display.getText().toString()))
                {
                    R.string.display.setText("");
                }
            }
        });*/

    }
    public void zero_BTN(View view){

    }

    public void one_BTN(View view){

    }

    public void two_BTN(View view){

    }

    public void three_BTN(View view){

    }

    public void four_BTN(View view){

    }

    public void five_BTN(View view){

    }

    public void six_BTN(View view){

    }

    public void seven_BTN(View view){

    }

    public void eight_BTN(View view){

    }

    public void nine_BTN(View view){

    }

    public void clear_BTN(View view){

    }

    public void exponent_BTN(View view){

    }

    public void parentheses_BTN(View view){

    }

    public void divide_BTN(View view){

    }

    public void multiply_BTN(View view){

    }

    public void add_BTN(View view){

    }

    public void subtract_BTN(View view){

    }

    public void plusminus_BTN(View view){

    }

    public void point_BTN(View view){

    }

    public void equals_BTN(View view){

    }
    public void backspace_BTN(View view){

    }


}