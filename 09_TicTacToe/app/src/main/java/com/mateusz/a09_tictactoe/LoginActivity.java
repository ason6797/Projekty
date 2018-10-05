package com.mateusz.a09_tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
EditText playerOneName, playerTwoName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        playerOneName = findViewById(R.id.editTextPlayerOneName);
        playerTwoName = findViewById(R.id.editTextPlayerTwoName);
    }

    public void doStartGame(View view) {
        String p1name = playerOneName.getText().toString();
        String p2name = playerTwoName.getText().toString();

        if(p1name.isEmpty())
        {
            Toast.makeText(this, "Please add player one username" , Toast.LENGTH_LONG).show();
        }
        else if(p2name.isEmpty())
        {
            Toast.makeText(this, "Please add player two username" , Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Starting the game" , Toast.LENGTH_LONG).show();
            Intent i = new Intent(LoginActivity.this, GameActivity.class);
            startActivity(i);
        }
    }
}

