package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

//import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView _username = (TextView) findViewById(R.id.username);
        TextView _password = (TextView) findViewById(R.id.password);
        MaterialButton _loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
        _loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(_username.getText().toString().equals("admin") && _password.getText().toString().equals("admin")){
                    //correct
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESFULL", Toast.LENGTH_SHORT).show();
                    //sendMessage(view);
                    setContentView(R.layout.activity_calculator);
                }else
                    Toast.makeText(MainActivity.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();
            }
        });
    }



    public void sendMessage(View view){
        Intent intent = new Intent(this, CalculatorActivity.class);
        EditText editText = (EditText) findViewById(R.id.username);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }



}