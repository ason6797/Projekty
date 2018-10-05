package com.mateusz.a08_basicintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etFirstName, etPassword, etConfirmPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstName = findViewById(R.id.editTextFirstName);
        etPassword = findViewById(R.id.editTextPassword);
        etConfirmPassword = findViewById(R.id.editTextConfirmPassword);
    }

    public void doRegister(View view) {
        String fname = etFirstName.getText().toString();
        String password = etPassword.getText().toString();
        String confirmpassword = etConfirmPassword.getText().toString();

        if(confirmpassword.equals(password))
        {
            Toast.makeText(this, "Signup ok" + fname, Toast.LENGTH_LONG).show();
            Intent i = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(i);
        }
        
        else
        {
            Toast.makeText(this, "Signup wrong" + fname, Toast.LENGTH_LONG).show();
        }

    }
}
