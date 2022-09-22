package com.example.tiempoactiva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var hrInicial: Long= 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onCreate")
        hrInicial = System.nanoTime()
    }

    override fun onPause() {
        super.onPause()
        val hrFinal: Long= System.nanoTime()
        val t = (hrFinal-hrInicial)/1000

        Log.d("Estado","El tiempo:  $t")



    }
    override fun onStart() {
        super.onStart()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onStart")
    }


    override fun onResume() {
        super.onResume()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onResume")
    }
}