package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton = findViewById<Button>(R.id.rollButton)
        rollButton.setOnClickListener {
//           Toast.makeText(this,"Dice Roller!",Toast.LENGTH_SHORT).show()
            rollDice()

        }


    }

    private fun rollDice() {

        val dice = Dice(6)
        val diceRoll = dice.roll()
        val textView =  findViewById<TextView>(R.id.textView)
        textView.text = diceRoll.toString()
    }
}
class Dice(val numSide:Int){
    fun roll():Int{
        return (1..numSide).random()
    }

}