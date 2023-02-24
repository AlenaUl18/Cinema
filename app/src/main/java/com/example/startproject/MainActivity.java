package com.example.startproject;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView) findViewById(R.id.textView7);
        String s = "КинотеатрMyCinema";
        text.setText(s);

        ImageView image = (ImageView) findViewById(R.id.imageView2);
        Drawable draw = getResources().getDrawable(R.drawable.movie_player_play_video_svgrepo_com);
        image.setImageDrawable(draw);

        Button but1 = (Button) findViewById(R.id.button);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "Нажата кнопка РАСПИСАНИЕ");
            }
        });

        Button but2 = (Button) findViewById(R.id.button2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "Нажата кнопка ВЫБОР ЗАЛА");
            }
        });
    }
    public void onClick (View view){
        Log.i(TAG,"Нажата кнопка Войти в профиль");
    }
}


