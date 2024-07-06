package com.example.calculadora

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //instanciar elementos del formulario
        //findview va y busca en el XML
            val operador1 : EditText = findViewById(R.id.Operador1_num)
            val operador2 : EditText = findViewById(R.id.Operador2_num)
            val operadores : Spinner = findViewById(R.id.TipoOperacion)
            val calcular : Button = findViewById(R.id.Calcular)
            val resultado : TextView = findViewById(R.id.ResultadoVista)
        //cargar datos en el spinner
        //array adapter permite crear los recursos
            val adaptador = ArrayAdapter.createFromResource(this, R.array.ListaOperadores, android.R.layout.simple_spinner_item)
            operadores.adapter = adaptador
        //operaciones
            calcular.setOnClickListener{
                when (operadores.selectedItem){
                    "Suma" -> resultado.text = (operador1.text.toString().toDouble() + operador2.text.toString().toDouble()).toString()
                    "Resta" -> resultado.text = (operador1.text.toString().toDouble() - operador2.text.toString().toDouble()).toString()
                    "Multiplicacion" -> resultado.text = (operador1.text.toString().toDouble() * operador2.text.toString().toDouble()).toString()
                    "Division" -> resultado.text = (operador1.text.toString().toDouble() / operador2.text.toString().toDouble()).toString()
                }
            }
        //reset

    }
    }
