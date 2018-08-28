package com.marianeleite.appescola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.widget.ButtonBarLayout
import android.view.View
import android.widget.*
import com.marianeleite.appescola.R.id.buttonAtividade
import com.marianeleite.appescola.R.id.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonAtividade2 =  findViewById(R.id.buttonAtividade) as ImageButton
        var buttonMaterial2 = findViewById(R.id.buttonMaterial) as ImageButton

        buttonMaterial.setOnClickListener {
            val telaAtividade = Intent(this, Atividade::class.java)
            // start your next activity
            startActivity(telaAtividade) }

        //buttonAtividade2.setOnClickListener(this)
        buttonAtividade.setOnClickListener {
            var texto =  findViewById(R.id.textView2) as TextView
            texto.text = "helooui"
            texto.visibility = View.VISIBLE }

    }

        override fun onClick(v: View?) {

        }


    }


