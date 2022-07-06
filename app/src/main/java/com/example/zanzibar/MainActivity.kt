package com.example.zanzibar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playerOneScore: TextView = findViewById(R.id.PlOneScore)
        val playerTwoScore: TextView = findViewById(R.id.PlTwoScore)
        val currentRollScore: TextView = findViewById(R.id.TvCurrentScoreNumber)
        val firstDicePicture: ImageView = findViewById(R.id.IVfirstDice)
        val secondDicePivture: ImageView = findViewById(R.id.IVsecondDice)
        val firstPlayerButton: Button = findViewById(R.id.BfirstPlayaerRoll)
        val secondPlayerButton: Button = findViewById(R.id.BsecondPlayaerRoll)
        val winner: TextView = findViewById(R.id.winner)
        val winnerPicture: ImageView = findViewById(R.id.IVwinningpicture)

        var pl1sc = 0
        var pl2sc = 0
        var currentScore = 0
        val winnerPl1Zanzibar = "Zanzibar Player 1 wins the game"
        val winnerPl2Zanzibar = "Zanzibar Player 2 wins the game"
        val winnerPl1 = "Player 1 wins the game"
        val winnerpl2 = "Player 2 wins the game"
        var zanzibar = "Zanzibar"

        firstPlayerButton.setOnClickListener {

            val randomFirstDiceNumber = Random.nextInt(1, 7)
            val randomSecondDiceNumber = Random.nextInt(1, 7)
            currentScore = randomFirstDiceNumber + randomSecondDiceNumber
            pl1sc += randomFirstDiceNumber + randomSecondDiceNumber
            playerOneScore.text = pl1sc.toString()

            when (randomFirstDiceNumber) {
                1 -> firstDicePicture.setImageResource(R.drawable.ic_one)
                2 -> firstDicePicture.setImageResource(R.drawable.ic_two)
                3 -> firstDicePicture.setImageResource(R.drawable.ic_three)
                4 -> firstDicePicture.setImageResource(R.drawable.ic_four)
                5 -> firstDicePicture.setImageResource(R.drawable.ic_five)
                6 -> firstDicePicture.setImageResource(R.drawable.ic_six)
            }

            when (randomSecondDiceNumber) {
                1 -> secondDicePivture.setImageResource(R.drawable.ic_one)
                2 -> secondDicePivture.setImageResource(R.drawable.ic_two)
                3 -> secondDicePivture.setImageResource(R.drawable.ic_three)
                4 -> secondDicePivture.setImageResource(R.drawable.ic_four)
                5 -> secondDicePivture.setImageResource(R.drawable.ic_five)
                6 -> secondDicePivture.setImageResource(R.drawable.ic_six)
            }
            if(randomFirstDiceNumber == 5 && randomSecondDiceNumber == 6){

                winner.text = winnerPl1Zanzibar
                winnerPicture.setImageResource(R.drawable.ic__winner)
                currentRollScore.text = zanzibar

            }
            else  {
                currentRollScore.text = currentScore.toString()

            }
            if(pl1sc >= 111){
                winner.text = winnerPl1
                winnerPicture.setImageResource(R.drawable.ic__winner)
            }

        }


        secondPlayerButton.setOnClickListener {

            val randomFirstDiceNumber = Random.nextInt(1, 7)
            val randomSecondDiceNumber = Random.nextInt(1, 7)
            currentScore = randomFirstDiceNumber + randomSecondDiceNumber
            pl2sc += randomFirstDiceNumber + randomSecondDiceNumber
            playerTwoScore.text = pl2sc.toString()
            when (randomFirstDiceNumber) {
                1 -> firstDicePicture.setImageResource(R.drawable.ic_one)
                2 -> firstDicePicture.setImageResource(R.drawable.ic_two)
                3 -> firstDicePicture.setImageResource(R.drawable.ic_three)
                4 -> firstDicePicture.setImageResource(R.drawable.ic_four)
                5 -> firstDicePicture.setImageResource(R.drawable.ic_five)
                6 -> firstDicePicture.setImageResource(R.drawable.ic_six)
            }

            when (randomSecondDiceNumber) {
                1 -> secondDicePivture.setImageResource(R.drawable.ic_one)
                2 -> secondDicePivture.setImageResource(R.drawable.ic_two)
                3 -> secondDicePivture.setImageResource(R.drawable.ic_three)
                4 -> secondDicePivture.setImageResource(R.drawable.ic_four)
                5 -> secondDicePivture.setImageResource(R.drawable.ic_five)
                6 -> secondDicePivture.setImageResource(R.drawable.ic_six)
            }
            if(randomFirstDiceNumber == 5 && randomSecondDiceNumber == 6){

                winner.text = winnerPl2Zanzibar
                winnerPicture.setImageResource(R.drawable.ic__winner)
                currentRollScore.text = zanzibar

            }
            else  {
                currentRollScore.text = currentScore.toString()
            }



        }
        if(pl2sc >= 111){
            winner.text = winnerpl2
            winnerPicture.setImageResource(R.drawable.ic__winner)
        }


    }


}