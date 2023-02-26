package com.example.startproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle arguments = getIntent().getExtras();
        String s = arguments.get("строчка").toString();
        TextView text = (TextView) findViewById(R.id.editTextTextPersonName4);
        text.setText(s);
        Button but2 = (Button) findViewById(R.id.button5);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("строчка", "Вы зашли в аккаунт");
                setResult(RESULT_OK, intent);
                finish();;
            }
        });
    }
}