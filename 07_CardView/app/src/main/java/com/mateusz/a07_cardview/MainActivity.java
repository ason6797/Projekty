package com.mateusz.a07_cardview;

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

        logo = findViewById(R.id.hotelLogo);
        Picasso.get().load("https://media.virtuoso.com/m/Images/Brochures/h500/11130968_2_0.jpg").into(logo);
    }
}
