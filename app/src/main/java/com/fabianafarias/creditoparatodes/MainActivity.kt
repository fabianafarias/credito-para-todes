package com.fabianafarias.creditoparatodes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun automovelIntent(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    fun imovelIntent(view: View) {
        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }

    fun rendaIntent(view: View) {
        val intent = Intent(this, FourthActivity::class.java)
        startActivity(intent)
    }

    fun contratarIntent1(view: View) {
        val intent = Intent(this, FifthActivity::class.java)
        startActivity(intent)
    }

    fun contratarIntent2(view: View) {
        val intent = Intent(this, FifthActivity::class.java)
        startActivity(intent)
    }

    fun contratarIntent3(view: View) {
        val intent = Intent(this, FifthActivity::class.java)
        startActivity(intent)
    }






}


