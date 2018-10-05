package com.mateusz.a12_checkboxes;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
CheckBox cbRed, cbYellow, cbBlue;
ConstraintLayout layoutBg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbRed = findViewById(R.id.checkBoxRed);
        cbYellow = findViewById(R.id.checkBoxYellow);
        cbBlue = findViewById(R.id.checkBoxBlue);
        layoutBg = findViewById(R.id.layout);



    }

    public void clickRed(View view) {
        changeColors();
    }

    public void clickBlue(View view) {
        changeColors();
    }

    public void clickYellow(View view) {
        changeColors();
    }

    @SuppressLint("ResourceAsColor")
    public void changeColors() {
        boolean red = cbRed.isChecked();
        boolean yellow = cbYellow.isChecked();
        boolean blue = cbBlue.isChecked();

        if(red && yellow && !blue)
        {
            layoutBg.setBackgroundColor(ContextCompat.getColor(this,R.color.colorOrange));
        }
        else if(red && blue && !yellow)
        {
            layoutBg.setBackgroundColor(ContextCompat.getColor(this,R.color.colorViolet));
        }

        else if(blue && yellow && !red)
        {
            layoutBg.setBackgroundColor(ContextCompat.getColor(this,R.color.colorGreen));
        }

        else if(blue&&yellow&&red)
        {
            layoutBg.setBackgroundColor(ContextCompat.getColor(this,R.color.colorBlack));

        }

        else if(!blue&&!yellow&&!red)
        {
            layoutBg.setBackgroundColor(ContextCompat.getColor(this,R.color.colorWhite));
        }
        else if(blue&&!yellow&&!red)
        {
            layoutBg.setBackgroundColor(ContextCompat.getColor(this,R.color.colorBlue));
        }
        else if(!blue&&yellow&&!red)
        {
            layoutBg.setBackgroundColor(ContextCompat.getColor(this,R.color.colorYellow));
        }
        else if(!blue&&!yellow&&red)
        {
            layoutBg.setBackgroundColor(ContextCompat.getColor(this,R.color.colorRed));
        }

        if((blue&&yellow&&red)||(!blue&&!yellow&&red)||(!blue&&!yellow&&red)||(blue&&!yellow&&!red)||(blue&&!yellow&&red)) {
            cbRed.setTextColor(ContextCompat.getColor(this,R.color.colorWhite));
            cbBlue.setTextColor(ContextCompat.getColor(this,R.color.colorWhite));
            cbYellow.setTextColor(ContextCompat.getColor(this,R.color.colorWhite));
        }
        else {
            cbRed.setTextColor(ContextCompat.getColor(this,R.color.colorBlack));
            cbBlue.setTextColor(ContextCompat.getColor(this,R.color.colorBlack));
            cbYellow.setTextColor(ContextCompat.getColor(this,R.color.colorBlack));
        }

        }
    }


