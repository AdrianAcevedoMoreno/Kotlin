package com.example.ejercicio1

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //para no repetir en cada log MainActivity.kt se puede clarar con una variable constante

     val TAG = "MainActivity.kt"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "La app ha sido puesta en marcha")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.d(TAG, "La app ha dejado de estar en marcha")

        }
    }
