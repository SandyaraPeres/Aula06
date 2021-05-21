package com.sandyara.aula06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var campo : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = listOf(2, 3, 4, 5)
        val mLista = mutableListOf(6, 7, 8, 9)
//
//        for(item in lista){
//
//        }
//
//        for(i in lista[1]..lista[4]){
//
//        }

        val itemLista = lista[0]
        val itemMLista = mLista[1]

        val resultado = itemLista + itemMLista
        campo.text = "o resultado é: $resultado"

    }
}