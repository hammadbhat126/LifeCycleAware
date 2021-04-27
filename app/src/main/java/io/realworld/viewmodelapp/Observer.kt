package io.realworld.viewmodelapp

import android.util.Log
import androidx.lifecycle.Lifecycle

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class Observer : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(){
        Log.d("MAIN","OBSERVER - ON CREATE")

    }
        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
     fun onPause(){
         Log.d("MAIN","OBSERVER - ON PAUSE")

     }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart(){
        Log.d("MAIN", "OBSEERVER - ON START")


    }


}