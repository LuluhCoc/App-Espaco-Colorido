
package com.example.espacocolorido

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.espacocolorido.R.drawable.*
import kotlinx.android.synthetic.main.activity_jogo_da_memoria_acitivity.*


class JogoDaMemoriaAcitivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")


    override fun onCreate(savedInstanceState: Bundle?) {
        val toast = Toast.makeText(applicationContext, "Parabens voce ganhou :)", Toast.LENGTH_LONG)
        var mediaPlayer: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.correto)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogo_da_memoria_acitivity)

        var buttonTela2 = arrayListOf<Button>()
        val images: MutableList<Int> = mutableListOf(
                amarelo,
                azul,
                roxo,
                laranja,
                vermelho,
                verde,
                amarelo,
                azul,
                roxo,
                laranja,
                vermelho,
                verde
        )
        var buttons = arrayOf(
                button, button1, button2, button3, button4, button5, button6,
                button7, button8, button9, button10, button11
        )

        val cardBack = cinza
        var clicked = 0
        var turnOver = false
        var lastClicked = -1
        var count =0

        images.shuffle()
        for (i in 0..11) {
            buttons[i].text = "cardBack"
            buttons[i].textSize = 0.0F
            buttons[i].setOnClickListener {
                if (buttons[i].text == "cardBack" && !turnOver) {
                    buttons[i].setBackgroundResource(images[i])
                    buttons[i].setText(images[i])
                    if (clicked == 0) {
                        lastClicked = i
                    }
                    clicked++
                } else if (buttons[i].text !in "cardBack") {
                    buttons[i].setBackgroundResource(cardBack)
                    buttons[i].text = "cardBack"
                    clicked--
                }


                if (clicked == 2) {
                    turnOver = true
                    if (buttons[i].text == buttons[lastClicked].text) {
                        buttonTela2.add(buttons[lastClicked])
                        buttons[i].isClickable = false
                        buttons[lastClicked].isClickable = false
                        turnOver = false
                        clicked = 0
                        mediaPlayer?.start()
                        count += 1

                    }
                } else if (clicked == 0) {
                    turnOver = false
                }
                if(count  == 6){
                    toast.show()
                }
            }
            imagevoltar6.setOnClickListener {

                val intent = Intent(this, MenuAcitivity::class.java)
                startActivity(intent)
            }
        }

    }




}






