package com.fabianafarias.creditoparatodes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
    }

    fun contratarImovelOnClicked(view: View){
        val intent = Intent(this, FifthActivity::class.java)
        startActivity(intent)
    }

}