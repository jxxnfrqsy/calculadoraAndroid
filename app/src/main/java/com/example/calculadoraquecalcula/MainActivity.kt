

package com.example.calculadoraquecalcula

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
import android.widget.TextView
import android.view.View;

class MainActivity : AppCompatActivity() {

    private EditText et1;
    private EditText et2;
    private TextView tv1;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        et1 = (EditText)FindViewById(R.id.txt_num1);
        et2 = (EditText)FindViewById(R.id.txt_num2);
        tv1 = (EditText)FindViewById(R.id.txt_resultado);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

     public void sumar(View view) {

       String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 + num2;

        String resultado = String.ValueOf(suma);

        tv1.SetText(resultado);


    }

}