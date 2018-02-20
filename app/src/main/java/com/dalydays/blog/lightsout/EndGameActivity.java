package com.dalydays.blog.lightsout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Owner on 2/20/2018.
 */

public class EndGameActivity extends Activity {
    private int numberOfMovesTaken;
    private int numberToBeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game);

        Button startOverButton = findViewById(R.id.startOverButton);
        startOverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EndGameActivity.this, StartScreenActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Bundle b = getIntent().getExtras();
        if (b != null) {
            numberOfMovesTaken = b.getInt("numberOfMovesTaken");
            numberToBeat = b.getInt("numberToBeat");
        }

        TextView numberOfMovesTakenTextView = findViewById(R.id.numberOfMovesTextView);
        TextView numberToBeatTextView = findViewById(R.id.numberToBeatTextView);

        numberOfMovesTakenTextView.setText("It took you " + numberOfMovesTaken + " moves to win");
        numberToBeatTextView.setText("The number to beat was " + numberToBeat);
    }
}
