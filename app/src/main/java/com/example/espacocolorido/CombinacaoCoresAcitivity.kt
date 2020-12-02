package com.example.espacocolorido

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_combinacao_cores_acitivity.*

class CombinacaoCoresAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_combinacao_cores_acitivity)
        var amarelo: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.amarelo)
        var vermelho: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.vermelho)
        var azul: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.azul)
        var verde: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.verde)
        var roxo: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.roxo)
        var laranja: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.laranja)

        imageamarelomusica2.setOnClickListener {

            amarelo?.start()
        }
        imageamarelomusica3.setOnClickListener {

            amarelo?.start()
        }
        imagevermelhomusica2.setOnClickListener {

            vermelho?.start()
        }
        imagevermelhomusica3.setOnClickListener {

            vermelho?.start()
        }
        imageroxomusica2.setOnClickListener {

            roxo?.start()
        }
        imageazulmusica2.setOnClickListener {

            azul?.start()
        }
        imageazulmusica3.setOnClickListener {

            azul?.start()
        }
        imageverdemusica2.setOnClickListener {

            verde?.start()
        }
        imagelaranjamusica2.setOnClickListener {

            laranja?.start()
        }

        imagevoltar2.setOnClickListener {

            val intent = Intent(this, MenuAcitivity::class.java)
            startActivity(intent)
        }
    }
}