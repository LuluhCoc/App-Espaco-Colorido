package com.example.espacocolorido

import android.R.*
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_colorindo_acitivity.*
import kotlinx.android.synthetic.main.activity_desenhos.*
import kotlinx.android.synthetic.main.activity_resultado_da_escolha.*

class EscolhaACorAcitivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colorindo_acitivity)


        var Melancia: Boolean? = null
        var Morango: Boolean? = null
        var Uva: Boolean? = null
        var Pera: Boolean? = null
        var Laranja: Boolean? = null
        var Banana: Boolean? = null


        val dadosEscolha: Bundle? = intent.extras
        val frutaEscolha = dadosEscolha?.getString("FrutaDesenho")

        if(frutaEscolha == "Melancia"){
            nomeImageFruta.setBackgroundResource(R.drawable.melancia)
            nomeTextFruta.text=(frutaEscolha)
            nomeTextFruta.setBackgroundResource(R.color.vermelhoClaro)
            Melancia = true
        }else if(frutaEscolha == "Morango"){
            nomeImageFruta.setBackgroundResource(R.drawable.morango)
            nomeTextFruta.text=(frutaEscolha)
            nomeTextFruta.setBackgroundResource(R.color.vermelho)
            Morango = true
        }else if(frutaEscolha == "Uva"){
            nomeImageFruta.setBackgroundResource(R.drawable.uva)
            nomeTextFruta.text=(frutaEscolha)
            nomeTextFruta.setBackgroundResource(R.color.roxo)
            Uva = true

        }else if(frutaEscolha == "Pera"){
            nomeImageFruta.setBackgroundResource(R.drawable.pera)
            nomeTextFruta.text=(frutaEscolha)
            nomeTextFruta.setBackgroundResource(R.color.verde)
            Pera = true

        }else if(frutaEscolha == "Laranja"){
            nomeImageFruta.setBackgroundResource(R.drawable.laranjac)
            nomeTextFruta.text=(frutaEscolha)
            nomeTextFruta.setBackgroundResource(R.color.laranja)
            Laranja = true

        }else if ((frutaEscolha == "Banana")){
            nomeImageFruta.setBackgroundResource(R.drawable.bananac)
            nomeTextFruta.text=(frutaEscolha)
            nomeTextFruta.setBackgroundResource(R.color.amarelo)
            Banana = true

        }

        imageAmareloEscolha.setOnClickListener {

            var intent = Intent(this, ResultadoDaEscolhaActivity::class.java)
            intent.putExtra("CorEscolha","Amarelo")
            if(Banana == true) {
                intent.putExtra("FrutaEscolha", "Banana")
            }
            startActivity(intent)

        }
        imageverdeEscolha.setOnClickListener {

            var intent = Intent(this, ResultadoDaEscolhaActivity::class.java)
            intent.putExtra("CorEscolha","Verde")
            if(Pera == true) {
                intent.putExtra("FrutaEscolha", "Pera")
            }
            startActivity(intent)

        }
        imagevermelhoEscolha.setOnClickListener {

            var intent = Intent(this, ResultadoDaEscolhaActivity::class.java)
            intent.putExtra("CorEscolha","Vermelho")
            if(Morango == true) {
                intent.putExtra("FrutaEscolha", "Morango")
            }
            startActivity(intent)

        }
        imageLaranjaEscolha.setOnClickListener {

            var intent = Intent(this, ResultadoDaEscolhaActivity::class.java)
            intent.putExtra("CorEscolha","Laranja")
            if(Laranja == true) {
                intent.putExtra("FrutaEscolha", "Laranja")
            }
            startActivity(intent)

        }
        imageRoxoEscolha.setOnClickListener {

            var intent = Intent(this, ResultadoDaEscolhaActivity::class.java)
            intent.putExtra("CorEscolha","Roxo")
            if(Uva == true) {
                intent.putExtra("FrutaEscolha", "Uva")
            }
            startActivity(intent)

        }
        imageVermelhoClaroEscolha.setOnClickListener {

            var intent = Intent(this, ResultadoDaEscolhaActivity::class.java)
            intent.putExtra("CorEscolha","VermelhoClaro")
            if(Melancia == true) {
                intent.putExtra("FrutaEscolha", "Melancia")
            }
            startActivity(intent)

        }
        imagevoltar3.setOnClickListener {

            var intent = Intent(this, DesenhosActivity::class.java)
            startActivity(intent)

        }




    }

}




