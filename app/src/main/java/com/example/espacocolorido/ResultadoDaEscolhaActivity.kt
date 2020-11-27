package com.example.espacocolorido

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_colorindo_acitivity.*
import kotlinx.android.synthetic.main.activity_colorindo_acitivity.nomeImageFruta
import kotlinx.android.synthetic.main.activity_combinacao_cores_acitivity.*
import kotlinx.android.synthetic.main.activity_resultado_da_escolha.*

class ResultadoDaEscolhaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_da_escolha)

        var amarelo: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.amarelo)
        var vermelho: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.vermelho)
        var verde: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.verde)
        var roxo: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.roxo)
        var laranja: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.laranja)
        var mediaPlayer: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.correto)
        var acertou: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.parabensvocacertou)

        val dadosResul: Bundle? = intent.extras
        val corResult = dadosResul?.getString("CorEscolha")

        val dadosResull: Bundle? = intent.extras
        val frutaResul = dadosResull?.getString("FrutaEscolha")

        var amarelo2: Boolean = false
        var vermelho2: Boolean = false
        var verde2: Boolean = false
        var roxo2: Boolean = false
        var laranja2: Boolean = false

        if (corResult == "Amarelo" && frutaResul == "Banana") {
            nomeImageFruta2.setBackgroundResource(R.drawable.bananacolorida)
            nomeTextFruta2.text=(frutaResul)
            nomeTextFruta2.setBackgroundResource(R.color.amarelo)
            nomeCorResultadoMusic.setBackgroundResource(R.drawable.amarelomusic2)
            amarelo2 = true
            acertou?.start()
        } else if (corResult == "VermelhoClaro" && frutaResul == "Melancia") {
            nomeImageFruta2.setBackgroundResource(R.drawable.melanciacolorida)
            nomeTextFruta2.text=(frutaResul)
            nomeTextFruta2.setBackgroundResource(R.color.vermelhoClaro)
            nomeCorResultadoMusic.setBackgroundResource(R.drawable.vermelhomusic2)
            vermelho2 = true
            acertou?.start()
        } else if (corResult == "Verde" && frutaResul == "Pera") {
            nomeImageFruta2.setBackgroundResource(R.drawable.peracolorida)
            nomeTextFruta2.text=(frutaResul)
            nomeTextFruta2.setBackgroundResource(R.color.verde)
            nomeCorResultadoMusic.setBackgroundResource(R.drawable.verdemusic2)
            verde2 = true
            acertou?.start()
        } else if (corResult == "Roxo" && frutaResul == "Uva") {
            nomeImageFruta2.setBackgroundResource(R.drawable.uvacolorida)
            nomeTextFruta2.text=(frutaResul)
            nomeTextFruta2.setBackgroundResource(R.color.roxo)
            nomeCorResultadoMusic.setBackgroundResource(R.drawable.roxomusic2)
            roxo2 = true
            acertou?.start()
        } else if (corResult == "Laranja" && frutaResul == "Laranja") {
            nomeImageFruta2.setBackgroundResource(R.drawable.laranjacolorida)
            nomeTextFruta2.text=(frutaResul)
            nomeTextFruta2.setBackgroundResource(R.color.laranja)
            nomeCorResultadoMusic.setBackgroundResource(R.drawable.laranjamusic2)
            laranja2 = true
            acertou?.start()
        } else if (corResult == "Vermelho" && frutaResul == "Morango") {
            nomeImageFruta2.setBackgroundResource(R.drawable.morangocolorido)
            nomeTextFruta2.text=(frutaResul)
            nomeTextFruta2.setBackgroundResource(R.color.vermelho)
            nomeCorResultadoMusic.setBackgroundResource(R.drawable.vermelhomusic2)
            vermelho2 = true
            acertou?.start()
        } else {
            mediaPlayer?.start()
            var intent = Intent(this, DesenhosActivity::class.java)
            startActivity(intent)

        }
        nomeCorResultadoMusic.setOnClickListener {
            if (amarelo2) {
                amarelo?.start()
            } else if (vermelho2) {
                vermelho?.start()
            } else if (verde2) {
                verde?.start()
            } else if (roxo2) {
                roxo?.start()
            } else if (laranja2) {
                laranja?.start()
            }
        }
        imagevoltar4.setOnClickListener {
            val intent = Intent(this, DesenhosActivity::class.java)
            startActivity(intent)
        }
    }
}
