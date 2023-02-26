package com.example.startproject;


import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    ActivityResultLauncher<Intent> StartForResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if(result.getResultCode() == MainActivity2.RESULT_OK){
                        Intent intent = result.getData();
                        String str = intent.getStringExtra("строчка");
                        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
                    }
                }
            });

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
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("строчка", "Аня");
        StartForResult.launch(intent);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (data == null) {
            return;
        } String str = data.getStringExtra("строчка");
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
    }
}




