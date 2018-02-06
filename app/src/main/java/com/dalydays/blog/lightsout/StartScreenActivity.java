package com.dalydays.blog.lightsout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by edaly on 2/6/2018.
 */

public class StartScreenActivity extends Activity {
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);

        startButton = findViewById(R.id.startGameButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newPuzzle = new Intent(StartScreenActivity.this, PuzzleBoardActivity.class);
                StartScreenActivity.this.startActivity(newPuzzle);
            }
        });
    }

}
