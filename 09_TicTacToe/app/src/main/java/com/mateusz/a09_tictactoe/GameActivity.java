package com.mateusz.a09_tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
    ImageView iv1, iv2, iv3, iv4, iv5, iv6, iv7, iv8, iv9;
    boolean isPlayingPlayer1 = true;
    boolean gameOver = false;
    Button btnRestart;
    int[] selectedCells = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    EditText playerOneName, playerTwoName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        iv1 = findViewById(R.id.imageView1);
        iv2 = findViewById(R.id.imageView2);
        iv3 = findViewById(R.id.imageView3);
        iv4 = findViewById(R.id.imageView4);
        iv5 = findViewById(R.id.imageView5);
        iv6 = findViewById(R.id.imageView6);
        iv7 = findViewById(R.id.imageView7);
        iv8 = findViewById(R.id.imageView8);
        iv9 = findViewById(R.id.imageView9);
        btnRestart = findViewById(R.id.buttonRestart);


    }

    public void cellClicked(View view) {
        if (gameOver) {
            Toast.makeText(this, "The GAME is over", Toast.LENGTH_SHORT).show();
        } else {
            int id = view.getId();
            ImageView imageViewClicked = null;
            int positionClicked = 0;

            if (id == R.id.imageView1) {
                imageViewClicked = iv1;
                positionClicked = 0;
            } else if (id == R.id.imageView2) {
                imageViewClicked = iv2;
                positionClicked = 1;
            } else if (id == R.id.imageView3) {
                imageViewClicked = iv3;
                positionClicked = 2;
            } else if (id == R.id.imageView4) {
                imageViewClicked = iv4;
                positionClicked = 3;
            } else if (id == R.id.imageView5) {
                imageViewClicked = iv5;
                positionClicked = 4;
            } else if (id == R.id.imageView6) {
                imageViewClicked = iv6;
                positionClicked = 5;
            } else if (id == R.id.imageView7) {
                imageViewClicked = iv7;
                positionClicked = 6;
            } else if (id == R.id.imageView8) {
                imageViewClicked = iv8;
                positionClicked = 7;
            } else if (id == R.id.imageView9) {
                imageViewClicked = iv9;
                positionClicked = 8;
            }

            if (selectedCells[positionClicked] == 0) {
                if (isPlayingPlayer1) {
                    imageViewClicked.setImageResource(R.drawable.ic_checkbox_tick);

                    selectedCells[positionClicked] = 1;
                } else {
                    imageViewClicked.setImageResource(R.drawable.ic_user_dryer);

                    selectedCells[positionClicked] = 2;
                }

                checkWinner();

            } else {
                Toast.makeText(this, "Select empty cell!!!", Toast.LENGTH_SHORT).show();
            }
        }

    }


    private void checkWinner() {
        boolean existSolution = false;

        if (selectedCells[0] == selectedCells[4] && selectedCells[4] == selectedCells[8] && selectedCells[8] != 0) {
            existSolution = true;
        } else if (selectedCells[2] == selectedCells[4] && selectedCells[4] == selectedCells[6] && selectedCells[6] != 0) {
            existSolution = true;
        } else if (selectedCells[0] == selectedCells[3] && selectedCells[3] == selectedCells[6] && selectedCells[6] != 0) {
            existSolution = true;
        } else if (selectedCells[1] == selectedCells[4] && selectedCells[4] == selectedCells[7] && selectedCells[7] != 0) {
            existSolution = true;
        } else if (selectedCells[2] == selectedCells[5] && selectedCells[5] == selectedCells[8] && selectedCells[8] != 0) {
            existSolution = true;
        } else if (selectedCells[0] == selectedCells[1] && selectedCells[1] == selectedCells[2] && selectedCells[2] != 0) {
            existSolution = true;
        } else if (selectedCells[3] == selectedCells[4] && selectedCells[4] == selectedCells[5] && selectedCells[5] != 0) {
            existSolution = true;
        } else if (selectedCells[6] == selectedCells[7] && selectedCells[7] == selectedCells[8] && selectedCells[8] != 0) {
            existSolution = true;
        }


        if (existSolution) {
            gameOver = true;
            btnRestart.setVisibility(View.VISIBLE);

            if (isPlayingPlayer1) {
                Toast.makeText(this, "Winner is Player 1", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Winner is Player 2", Toast.LENGTH_SHORT).show();
            }
        } else {

            boolean twoWinners = true;
            for (int i = 0; i < 9; i++) {
                if (selectedCells[i] == 0) {
                    twoWinners = false;
                }

                if (twoWinners) {
                    gameOver = true;
                    btnRestart.setVisibility(View.VISIBLE);
                    Toast.makeText(this, "P1 & P2 remis!!!", Toast.LENGTH_SHORT).show();
                } else {
                    isPlayingPlayer1 = !isPlayingPlayer1;
                }

            }


        }

    }

    public void restartGame(View view) {
        iv1.setImageResource(R.drawable.ic_checkbox);
        iv2.setImageResource(R.drawable.ic_checkbox);
        iv3.setImageResource(R.drawable.ic_checkbox);
        iv4.setImageResource(R.drawable.ic_checkbox);
        iv5.setImageResource(R.drawable.ic_checkbox);
        iv6.setImageResource(R.drawable.ic_checkbox);
        iv7.setImageResource(R.drawable.ic_checkbox);
        iv8.setImageResource(R.drawable.ic_checkbox);
        iv9.setImageResource(R.drawable.ic_checkbox);

        isPlayingPlayer1 = true;

        for (int i = 0; i < 9; i++) {
            selectedCells[1] = 0;
        }

        btnRestart.setVisibility(View.INVISIBLE);

        gameOver = false;


    }
}
