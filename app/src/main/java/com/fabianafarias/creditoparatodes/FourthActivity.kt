package com.fabianafarias.creditoparatodes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
    }

    fun contratarSemRendaOnClicked(view: View){
        val intent = Intent(this, FifthActivity::class.java)
        startActivity(intent)
    }


}