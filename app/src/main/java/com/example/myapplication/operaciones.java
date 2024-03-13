package com.example.myapplication;

import android.widget.EditText;

public class operaciones {

    public String suma(String numero1, String numero2){
        int resultado = Integer.valueOf(String.valueOf(numero1)) + Integer.valueOf(String.valueOf(numero2));
        return String.valueOf(resultado);
    }

    public String resta(String numero1,String numero2){
        int resultado = Integer.valueOf(numero1) - Integer.valueOf(numero2);
        return String.valueOf(resultado);
    }
}
