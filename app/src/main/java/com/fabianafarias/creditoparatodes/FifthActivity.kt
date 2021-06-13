package com.fabianafarias.creditoparatodes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_fifth.*


class FifthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            val checked = view.isChecked

            when (view.getId()) {
                R.id.radio_automovel ->
                    if (checked) {
                        radio_automovel.isChecked
                    }
                R.id.radio_imovel ->
                    if (checked) {
                        radio_imovel.isChecked
                    }
                R.id.radio_sem_renda ->
                    if (checked) {
                        radio_sem_renda.isChecked
                    }
            }
        }
    }

    fun contratarOnClicked(view: View) {
        val intent = Intent(this, SixthActivity::class.java)
        startActivity(intent)
    }
}






