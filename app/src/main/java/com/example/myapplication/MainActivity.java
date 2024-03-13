package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView res;
    private EditText num1;
    private  EditText num2;
    private Button suma;
    private Button resta;

    operaciones datos = new operaciones();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

      //  suma.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View view) {
             //   String result = datos.suma(num1,num2);
             //   res.setText(result);
           // }
       // });
    }
    private void init(){
        res =(TextView)findViewById(R.id.res);
        num1 =(EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        suma = (Button) findViewById(R.id.suma);
        resta = (Button) findViewById(R.id.resta);
    }
}