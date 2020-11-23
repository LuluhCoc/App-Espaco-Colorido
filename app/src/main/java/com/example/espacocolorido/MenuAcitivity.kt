package com.example.espacocolorido

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu_acitivity.*

class MenuAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_acitivity)

        button_aprendendo_cores.setOnClickListener {

            val intent = Intent(this, AprendendoCoresAcitivity::class.java)
            startActivity(intent)
        }
        button_combinando_cores.setOnClickListener {

            val intent = Intent(this, CombinacaoCoresAcitivity::class.java)
            startActivity(intent)
        }
        button_desenhos.setOnClickListener {

            val intent = Intent(this, DesenhosActivity::class.java)
            startActivity(intent)
        }

        button_jogo_memoria.setOnClickListener {

            val intent = Intent(this, JogoDaMemoriaAcitivity::class.java)
            startActivity(intent)
        }
        button_voltar.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}