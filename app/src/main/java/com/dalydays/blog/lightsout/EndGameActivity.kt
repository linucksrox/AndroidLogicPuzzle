package com.dalydays.blog.lightsout

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_end_game.*

/**
 * Created by Owner on 2/20/2018.
 */

class EndGameActivity : Activity() {
    private var numberOfMovesTaken: Int = 0
    private var numberToBeat: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_game)

        startOverButton.setOnClickListener {
            val intent = Intent(this@EndGameActivity, StartScreenActivity::class.java)
            startActivity(intent)
            finish()
        }

        val b = intent.extras
        if (b != null) {
            numberOfMovesTaken = b.getInt("numberOfMovesTaken")
            numberToBeat = b.getInt("numberToBeat")
        }

        val numberOfMovesTakenTextView = findViewById<TextView>(R.id.numberOfMovesTextView)
        val numberToBeatTextView = findViewById<TextView>(R.id.numberToBeatTextView)

        numberOfMovesTakenTextView.text = getString(R.string.number_of_moves_taken_text, numberOfMovesTaken)
        numberToBeatTextView.text = getString(R.string.number_to_beat_text, numberToBeat)
    }
}
