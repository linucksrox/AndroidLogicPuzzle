package com.dalydays.blog.lightsout

import android.app.Activity
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.widget.Button
import kotlinx.android.synthetic.main.puzzle_board.*

class PuzzleBoardActivity : Activity() {
    private var numberOfLightsOn = 0
    private var numberOfRandomPresses = 0
    private var runningNumberOfMoves = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.puzzle_board)

        // set click listeners on all buttons, which also maps their coordinates
        a0.setOnClickListener {
            toggleAdjacent(0, 0)
            checkIfSolved()
        }
        a1.setOnClickListener {
            toggleAdjacent(0, 1)
            checkIfSolved()
        }
        a2.setOnClickListener {
            toggleAdjacent(0, 2)
            checkIfSolved()
        }
        a3.setOnClickListener {
            toggleAdjacent(0, 3)
            checkIfSolved()
        }
        a4.setOnClickListener {
            toggleAdjacent(0, 4)
            checkIfSolved()
        }

        b0.setOnClickListener {
            toggleAdjacent(1, 0)
            checkIfSolved()
        }
        b1.setOnClickListener {
            toggleAdjacent(1, 1)
            checkIfSolved()
        }
        b2.setOnClickListener {
            toggleAdjacent(1, 2)
            checkIfSolved()
        }
        b3.setOnClickListener {
            toggleAdjacent(1, 3)
            checkIfSolved()
        }
        b4.setOnClickListener {
            toggleAdjacent(1, 4)
            checkIfSolved()
        }

        c0.setOnClickListener {
            toggleAdjacent(2, 0)
            checkIfSolved()
        }
        c1.setOnClickListener {
            toggleAdjacent(2, 1)
            checkIfSolved()
        }
        c2.setOnClickListener {
            toggleAdjacent(2, 2)
            checkIfSolved()
        }
        c3.setOnClickListener {
            toggleAdjacent(2, 3)
            checkIfSolved()
        }
        c4.setOnClickListener {
            toggleAdjacent(2, 4)
            checkIfSolved()
        }

        d0.setOnClickListener {
            toggleAdjacent(3, 0)
            checkIfSolved()
        }
        d1.setOnClickListener {
            toggleAdjacent(3, 1)
            checkIfSolved()
        }
        d2.setOnClickListener {
            toggleAdjacent(3, 2)
            checkIfSolved()
        }
        d3.setOnClickListener {
            toggleAdjacent(3, 3)
            checkIfSolved()
        }
        d4.setOnClickListener {
            toggleAdjacent(3, 4)
            checkIfSolved()
        }

        e0.setOnClickListener {
            toggleAdjacent(4, 0)
            checkIfSolved()
        }
        e1.setOnClickListener {
            toggleAdjacent(4, 1)
            checkIfSolved()
        }
        e2.setOnClickListener {
            toggleAdjacent(4, 2)
            checkIfSolved()
        }
        e3.setOnClickListener {
            toggleAdjacent(4, 3)
            checkIfSolved()
        }
        e4.setOnClickListener {
            toggleAdjacent(4, 4)
            checkIfSolved()
        }

        randomizeBoard()
    }

    private fun randomizeBoard() {
        // pick a number of buttons to press
        var min = 5
        var max = 20
        var range = max - min
        var numToPress = (Math.random() * range).toInt() + min
        numberOfRandomPresses = numToPress

        // randomly press that number of buttons
        min = 0
        max = 4
        range = max - min
        var randomX: Int
        var randomY: Int
        while (numToPress > 0) {
            randomX = (Math.random() * range).toInt() + min
            randomY = (Math.random() * range).toInt() + min
            toggleAdjacent(randomX, randomY)
            numToPress--
        }

        // if no lights are on, we should randomize again
        if (numberOfLightsOn == 0) {
            randomizeBoard()
        }

        // reset running number of moves because we should only count moves made by the user
        runningNumberOfMoves = 0
    }

    private fun toggleAdjacent(row: Int, column: Int) {
        when (row) {
            0 -> when (column) {
                0 -> {
                    toggleButton(a0)
                    toggleButton(a1)
                    toggleButton(b0)
                }
                1 -> {
                    toggleButton(a1)
                    toggleButton(a0)
                    toggleButton(b1)
                    toggleButton(a2)
                }
                2 -> {
                    toggleButton(a2)
                    toggleButton(a1)
                    toggleButton(b2)
                    toggleButton(a3)
                }
                3 -> {
                    toggleButton(a3)
                    toggleButton(a2)
                    toggleButton(b3)
                    toggleButton(a4)
                }
                4 -> {
                    toggleButton(a4)
                    toggleButton(a3)
                    toggleButton(b4)
                }
            }
            1 -> when (column) {
                0 -> {
                    toggleButton(b0)
                    toggleButton(a0)
                    toggleButton(c0)
                    toggleButton(b1)
                }
                1 -> {
                    toggleButton(b1)
                    toggleButton(a1)
                    toggleButton(c1)
                    toggleButton(b0)
                    toggleButton(b2)
                }
                2 -> {
                    toggleButton(b2)
                    toggleButton(a2)
                    toggleButton(c2)
                    toggleButton(b1)
                    toggleButton(b3)
                }
                3 -> {
                    toggleButton(b3)
                    toggleButton(a3)
                    toggleButton(c3)
                    toggleButton(b2)
                    toggleButton(b4)
                }
                4 -> {
                    toggleButton(b4)
                    toggleButton(a4)
                    toggleButton(c4)
                    toggleButton(b3)
                }
            }
            2 -> when (column) {
                0 -> {
                    toggleButton(c0)
                    toggleButton(b0)
                    toggleButton(d0)
                    toggleButton(c1)
                }
                1 -> {
                    toggleButton(c1)
                    toggleButton(b1)
                    toggleButton(d1)
                    toggleButton(c0)
                    toggleButton(c2)
                }
                2 -> {
                    toggleButton(c2)
                    toggleButton(b2)
                    toggleButton(d2)
                    toggleButton(c1)
                    toggleButton(c3)
                }
                3 -> {
                    toggleButton(c3)
                    toggleButton(b3)
                    toggleButton(d3)
                    toggleButton(c2)
                    toggleButton(c4)
                }
                4 -> {
                    toggleButton(c4)
                    toggleButton(b4)
                    toggleButton(d4)
                    toggleButton(c3)
                }
            }
            3 -> when (column) {
                0 -> {
                    toggleButton(d0)
                    toggleButton(c0)
                    toggleButton(e0)
                    toggleButton(d1)
                }
                1 -> {
                    toggleButton(d1)
                    toggleButton(c1)
                    toggleButton(e1)
                    toggleButton(d0)
                    toggleButton(d2)
                }
                2 -> {
                    toggleButton(d2)
                    toggleButton(c2)
                    toggleButton(e2)
                    toggleButton(d1)
                    toggleButton(d3)
                }
                3 -> {
                    toggleButton(d3)
                    toggleButton(c3)
                    toggleButton(e3)
                    toggleButton(d2)
                    toggleButton(d4)
                }
                4 -> {
                    toggleButton(d4)
                    toggleButton(c4)
                    toggleButton(e4)
                    toggleButton(d3)
                }
            }
            4 -> when (column) {
                0 -> {
                    toggleButton(e0)
                    toggleButton(d0)
                    toggleButton(e1)
                }
                1 -> {
                    toggleButton(e1)
                    toggleButton(d1)
                    toggleButton(e0)
                    toggleButton(e2)
                }
                2 -> {
                    toggleButton(e2)
                    toggleButton(d2)
                    toggleButton(e1)
                    toggleButton(e3)
                }
                3 -> {
                    toggleButton(e3)
                    toggleButton(d3)
                    toggleButton(e2)
                    toggleButton(e4)
                }
                4 -> {
                    toggleButton(e4)
                    toggleButton(d4)
                    toggleButton(e3)
                }
            }
        }

        // count one more move
        runningNumberOfMoves++
    }

    private fun toggleButton(button: Button?) {
        val buttonColor = button!!.background as ColorDrawable
        if (buttonColor.color == ContextCompat.getColor(this, R.color.colorLightOn)) {
            button.setBackgroundColor(ContextCompat.getColor(this, R.color.colorLightOff))
            numberOfLightsOn--
        } else {
            button.setBackgroundColor(ContextCompat.getColor(this, R.color.colorLightOn))
            numberOfLightsOn++
        }
    }

    private fun checkIfSolved() {
        if (numberOfLightsOn == 0) {
            // Go to winning screen, passing all values to be displayed
            val intent = Intent(this@PuzzleBoardActivity, EndGameActivity::class.java)
            val b = Bundle()
            b.putInt("numberOfMovesTaken", runningNumberOfMoves)
            b.putInt("numberToBeat", numberOfRandomPresses)
            intent.putExtras(b)
            startActivity(intent)
            finish()
        }
    }
}
