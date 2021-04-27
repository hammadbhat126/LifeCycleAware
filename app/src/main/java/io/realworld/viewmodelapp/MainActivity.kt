package io.realworld.viewmodelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // NOW ADD OBSERVER TO MAIN ACTIVITY

        lifecycle.addObserver(Observer())
        Log.d("MAIN","ACTIVITY OnCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAIN","Activity onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("MAIN", "Activity onPause")

    }


    override fun onStart() {
        super.onStart()
        Log.d("MAIN", "Activity onStart")
    }
}