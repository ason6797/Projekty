package com.mateusz.a11_circleimageviewexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
CircleImageView image;
ImageView background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.circleImage);
        background = findViewById(R.id.backgroundImage);

        Picasso.get().load("http://cdn.home-designing.com/wp-content/uploads/2014/11/one-room-apartment.jpg").into(background);
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8ZKRHEVYc1Mnok2Vsko87zHvfgWGgL5p9mrissmMKdYyOtlpc").into(image);
    }
}
