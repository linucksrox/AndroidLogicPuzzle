package com.dalydays.blog.lightsout;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PuzzleBoardActivity extends Activity {
    private Button a0;
    private Button a1;
    private Button a2;
    private Button a3;
    private Button a4;
    private Button b0;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button c0;
    private Button c1;
    private Button c2;
    private Button c3;
    private Button c4;
    private Button d0;
    private Button d1;
    private Button d2;
    private Button d3;
    private Button d4;
    private Button e0;
    private Button e1;
    private Button e2;
    private Button e3;
    private Button e4;
    private int numberOfLightsOn = 0;
    private int numberOfRandomPresses = 0;
    private int runningNumberOfMoves = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puzzle_board);

        // Get a handle on all buttons
        // row a
        a0 = findViewById(R.id.a0);
        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        a3 = findViewById(R.id.a3);
        a4 = findViewById(R.id.a4);
        // row b
        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        //row c
        c0 = findViewById(R.id.c0);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        // row d
        d0 = findViewById(R.id.d0);
        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        d3 = findViewById(R.id.d3);
        d4 = findViewById(R.id.d4);
        // row e
        e0 = findViewById(R.id.e0);
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        e3 = findViewById(R.id.e3);
        e4 = findViewById(R.id.e4);

        // set click listeners on all buttons, which also maps their coordinates
        a0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(0, 0);
                checkIfSolved();
            }
        });
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(0, 1);
                checkIfSolved();
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(0, 2);
                checkIfSolved();
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(0, 3);
                checkIfSolved();
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(0, 4);
                checkIfSolved();
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(1, 0);
                checkIfSolved();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(1, 1);
                checkIfSolved();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(1, 2);
                checkIfSolved();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(1, 3);
                checkIfSolved();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(1, 4);
                checkIfSolved();
            }
        });

        c0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(2, 0);
                checkIfSolved();
            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(2, 1);
                checkIfSolved();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(2, 2);
                checkIfSolved();
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(2, 3);
                checkIfSolved();
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(2, 4);
                checkIfSolved();
            }
        });

        d0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(3, 0);
                checkIfSolved();
            }
        });
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(3, 1);
                checkIfSolved();
            }
        });
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(3, 2);
                checkIfSolved();
            }
        });
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(3, 3);
                checkIfSolved();
            }
        });
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(3, 4);
                checkIfSolved();
            }
        });

        e0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(4, 0);
                checkIfSolved();
            }
        });
        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(4, 1);
                checkIfSolved();
            }
        });
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(4, 2);
                checkIfSolved();
            }
        });
        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(4, 3);
                checkIfSolved();
            }
        });
        e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleAdjacent(4, 4);
                checkIfSolved();
            }
        });

        randomizeBoard();
    }

    private void randomizeBoard() {
        // pick a number of buttons to press
        int min = 5;
        int max = 20;
        int range = max - min;
        int numToPress = (int) (Math.random() * range) + min;
        numberOfRandomPresses = numToPress;

        // randomly press that number of buttons
        min = 0;
        max = 4;
        range = max - min;
        int randomX;
        int randomY;
        while (numToPress > 0) {
            randomX = (int) (Math.random() * range) + min;
            randomY = (int) (Math.random() * range) + min;
            toggleAdjacent(randomX, randomY);
            numToPress--;
        }

        // if no lights are on, we should randomize again
        if (numberOfLightsOn == 0) {
            randomizeBoard();
        }

        // reset running number of moves because we should only count moves made by the user
        runningNumberOfMoves = 0;
    }

    private void toggleAdjacent(int row, int column) {
        switch(row) {
            case 0:
                switch(column) {
                    case 0:
                        toggleButton(a0);
                        toggleButton(a1);
                        toggleButton(b0);
                        break;
                    case 1:
                        toggleButton(a1);
                        toggleButton(a0);
                        toggleButton(b1);
                        toggleButton(a2);
                        break;
                    case 2:
                        toggleButton(a2);
                        toggleButton(a1);
                        toggleButton(b2);
                        toggleButton(a3);
                        break;
                    case 3:
                        toggleButton(a3);
                        toggleButton(a2);
                        toggleButton(b3);
                        toggleButton(a4);
                        break;
                    case 4:
                        toggleButton(a4);
                        toggleButton(a3);
                        toggleButton(b4);
                        break;
                }
                break;
            case 1:
                switch(column) {
                    case 0:
                        toggleButton(b0);
                        toggleButton(a0);
                        toggleButton(c0);
                        toggleButton(b1);
                        break;
                    case 1:
                        toggleButton(b1);
                        toggleButton(a1);
                        toggleButton(c1);
                        toggleButton(b0);
                        toggleButton(b2);
                        break;
                    case 2:
                        toggleButton(b2);
                        toggleButton(a2);
                        toggleButton(c2);
                        toggleButton(b1);
                        toggleButton(b3);
                        break;
                    case 3:
                        toggleButton(b3);
                        toggleButton(a3);
                        toggleButton(c3);
                        toggleButton(b2);
                        toggleButton(b4);
                        break;
                    case 4:
                        toggleButton(b4);
                        toggleButton(a4);
                        toggleButton(c4);
                        toggleButton(b3);
                        break;
                }
                break;
            case 2:
                switch(column) {
                    case 0:
                        toggleButton(c0);
                        toggleButton(b0);
                        toggleButton(d0);
                        toggleButton(c1);
                        break;
                    case 1:
                        toggleButton(c1);
                        toggleButton(b1);
                        toggleButton(d1);
                        toggleButton(c0);
                        toggleButton(c2);
                        break;
                    case 2:
                        toggleButton(c2);
                        toggleButton(b2);
                        toggleButton(d2);
                        toggleButton(c1);
                        toggleButton(c3);
                        break;
                    case 3:
                        toggleButton(c3);
                        toggleButton(b3);
                        toggleButton(d3);
                        toggleButton(c2);
                        toggleButton(c4);
                        break;
                    case 4:
                        toggleButton(c4);
                        toggleButton(b4);
                        toggleButton(d4);
                        toggleButton(c3);
                        break;
                }
                break;
            case 3:
                switch(column) {
                    case 0:
                        toggleButton(d0);
                        toggleButton(c0);
                        toggleButton(e0);
                        toggleButton(d1);
                        break;
                    case 1:
                        toggleButton(d1);
                        toggleButton(c1);
                        toggleButton(e1);
                        toggleButton(d0);
                        toggleButton(d2);
                        break;
                    case 2:
                        toggleButton(d2);
                        toggleButton(c2);
                        toggleButton(e2);
                        toggleButton(d1);
                        toggleButton(d3);
                        break;
                    case 3:
                        toggleButton(d3);
                        toggleButton(c3);
                        toggleButton(e3);
                        toggleButton(d2);
                        toggleButton(d4);
                        break;
                    case 4:
                        toggleButton(d4);
                        toggleButton(c4);
                        toggleButton(e4);
                        toggleButton(d3);
                        break;
                }
                break;
            case 4:
                switch(column) {
                    case 0:
                        toggleButton(e0);
                        toggleButton(d0);
                        toggleButton(e1);
                        break;
                    case 1:
                        toggleButton(e1);
                        toggleButton(d1);
                        toggleButton(e0);
                        toggleButton(e2);
                        break;
                    case 2:
                        toggleButton(e2);
                        toggleButton(d2);
                        toggleButton(e1);
                        toggleButton(e3);
                        break;
                    case 3:
                        toggleButton(e3);
                        toggleButton(d3);
                        toggleButton(e2);
                        toggleButton(e4);
                        break;
                    case 4:
                        toggleButton(e4);
                        toggleButton(d4);
                        toggleButton(e3);
                        break;
                }
                break;
        }

        // count one more move
        runningNumberOfMoves++;
    }

    private void toggleButton(Button button) {
        ColorDrawable buttonColor = (ColorDrawable) button.getBackground();
        if (buttonColor.getColor() == getResources().getColor(R.color.colorLightOn)) {
            button.setBackgroundColor(getResources().getColor(R.color.colorLightOff));
            numberOfLightsOn--;
        }
        else {
            button.setBackgroundColor(getResources().getColor(R.color.colorLightOn));
            numberOfLightsOn++;
        }
    }

    private void checkIfSolved() {
        if (numberOfLightsOn == 0) {
            // Go to winning screen, passing all values to be displayed
            Intent intent = new Intent(PuzzleBoardActivity.this, EndGameActivity.class);
            Bundle b = new Bundle();
            b.putInt("numberOfMovesTaken", runningNumberOfMoves);
            b.putInt("numberToBeat", numberOfRandomPresses);
            intent.putExtras(b);
            startActivity(intent);
            finish();
        }
    }
}
