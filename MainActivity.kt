package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceimage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton:Button=findViewById(R.id.roll_button)
        rollbutton.text="Lets Roll"
        rollbutton.setOnClickListener{
        rollDice()
        //Toast.makeText(this,"Button Clicked",Toast.LENGTH_SHORT).show()
        }
        diceimage=findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        //val textview:TextView=findViewById(R.id.result_text)
        val randInt= Random.nextInt(1,7)
        val imgselec= when(randInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6
           }


       // textview.text=randInt.toString()
        ////val diceimage:ImageView=findViewById(R.id.dice_image)
    diceimage.setImageResource(imgselec)
    }
}