package com.mateusz.a06_constraintlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.grandCentralTerminal);
        Picasso.get().load("https://www.tripsavvy.com/thmb/NjbqxvWHM-xTbe-C-jMNORa8kvs=/960x0/filters:no_upscale():max_bytes(150000):strip_icc()/159807805-56a5ed795f9b58b7d0df314d.jpg").into(logo);
    }
}
