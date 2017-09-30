package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = (ImageView) findViewById(R.id.eight_ball);
        final int ballArray[] = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4,
                R.drawable.ball5};
        Button askButton = (Button) findViewById(R.id.ask_button);
        askButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Random r = new Random();
                int pick = r.nextInt(5);
                ballDisplay.setImageResource(ballArray[pick]);
            }
        });


    }
}

