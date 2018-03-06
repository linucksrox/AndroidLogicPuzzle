package com.dalydays.blog.lightsout

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.start_screen.*

/**
 * Created by edaly on 2/6/2018.
 */

class StartScreenActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_screen)

        startGameButton.setOnClickListener {
            val newPuzzle = Intent(this@StartScreenActivity, PuzzleBoardActivity::class.java)
            startActivity(newPuzzle)
            finish()
        }
    }
}
