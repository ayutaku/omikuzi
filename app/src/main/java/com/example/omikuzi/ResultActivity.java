package com.example.omikuzi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ResultActivity extends AppCompatActivity {

    int[] images ={
          R.drawable.daikiti,
        R.drawable.tyukiti,
        R.drawable.shokiti,
            R.drawable.kiti,
            R.drawable.suekiti,
            R.drawable.kyou,
            R.drawable.daikyou

    };

    Random r = new Random();
    int n = r.nextInt(7);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ((ImageView)findViewById(R.id.imageview)).setImageResource(images[n]);

    }

    public void b1 (View v){
        Intent intent= new Intent( this,MainActivity.class);
        startActivity(intent);
    }
}
