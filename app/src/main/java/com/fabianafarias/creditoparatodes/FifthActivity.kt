package com.fabianafarias.creditoparatodes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FifthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)
    }

    fun onRadioAutomovelClicked(view: View){
        val intent = Intent(this, FifthActivity::class.java)
        startActivity(intent)
    }

    fun onRadioImovelClicked(view: View){
        val intent = Intent(this, FifthActivity::class.java)
        startActivity(intent)
    }

    fun onRadioSemRendaClicked(view: View){
        val intent = Intent(this, FifthActivity::class.java)
        startActivity(intent)
    }

    fun sickBarClicked(view: View){
        val intent = Intent(this, FifthActivity::class.java)
        startActivity(intent)
    }

    fun cadastrarOnClicked(view: View) {
        val intent = Intent(this, SixthActivity::class.java)
        startActivity(intent)
    }

}