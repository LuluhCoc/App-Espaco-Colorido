package com.example.espacocolorido

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_aprendendo_cores_acitivity.*


class AprendendoCoresAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aprendendo_cores_acitivity)

        var amarelo: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.amarelo)
        var vermelho: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.vermelho)
        var azul: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.azul)
        var verde: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.verde)
        var roxo: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.roxo)
        var laranja: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.laranja)
        var rosa: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.rosa)
        var ciano: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.ciano)

        imageamarelomusic.setOnClickListener {

            amarelo?.start()
        }
        imagevermelhomusic.setOnClickListener {

            vermelho?.start()
        }
        imageazulmusic.setOnClickListener {

            azul?.start()
        }
        imageverdemusic.setOnClickListener {

            verde?.start()
        }
        imageroxomusic.setOnClickListener {

            roxo?.start()
        }
        imagelaranjamusic.setOnClickListener {

            laranja?.start()
        }
        imagerosamusic.setOnClickListener {

            rosa?.start()
        }
        imagecianomusic.setOnClickListener {

            ciano?.start()
        }
        imagecianomusic.setOnClickListener {

            ciano?.start()
        }

        imagevoltar1.setOnClickListener {

            val intent = Intent(this, MenuAcitivity::class.java)
            startActivity(intent)
        }

    }
}