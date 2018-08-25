package com.marianeleite.appescola

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.ButtonBarLayout
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // getSupportActionBar()!!.hide(); //aqui a mágica
        setContentView(R.layout.activity_main)
    }

    fun Exibetexto(){
        button = (android.support.design.widget.FloatingActionButton) findViewById(R.id.floatingActionButton);

    }
}
