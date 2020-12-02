package com.example.espacocolorido

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_desenhos.*

class DesenhosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desenhos)

        imageMelancia.setOnClickListener {

            var intent = Intent(this, EscolhaACorAcitivity::class.java)
            intent.putExtra("FrutaDesenho","Melancia")
            startActivity(intent)

        }
        imageLaranjafruta.setOnClickListener {

            var intent = Intent(this, EscolhaACorAcitivity::class.java)
            intent.putExtra("FrutaDesenho","Laranja")
            startActivity(intent)

        }
        imagePera.setOnClickListener {

            var intent = Intent(this, EscolhaACorAcitivity::class.java)
            intent.putExtra("FrutaDesenho","Pera")
            startActivity(intent)

        }
        imageUva.setOnClickListener {

            var intent = Intent(this, EscolhaACorAcitivity::class.java)
            intent.putExtra("FrutaDesenho","Uva")
            startActivity(intent)

        }
        imageMorango.setOnClickListener {

            var intent = Intent(this, EscolhaACorAcitivity::class.java)
            intent.putExtra("FrutaDesenho","Morango")
            startActivity(intent)

        }
        imageBanana.setOnClickListener {

            var intent = Intent(this, EscolhaACorAcitivity::class.java)
            intent.putExtra("FrutaDesenho","Banana")
            startActivity(intent)

        }

        imagevoltar.setOnClickListener {

            var intent = Intent(this, MenuAcitivity::class.java)
            startActivity(intent)

        }



    }
}

