package com.example.startproject;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("MainActivity", "Ошибка в onCreate");
        Log.w("MainActivity", "Предупреждение в onCreate");
        Log.i("MainActivity", "Информация в onCreate");
        Log.d("MainActivity", "Отладка в  onCreate");
        Log.v("MainActivity", "Подробности в onCreate");

        Toast toast = Toast.makeText(getApplicationContext(), "Работает onCreate", Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.e("MainActivity", "Ошибка в onStart");
        Log.w("MainActivity", "Предупреждение в onStart");
        Log.i("MainActivity", "Информация в onStart");
        Log.d("MainActivity", "Отладка в  onStart");
        Log.v("MainActivity", "Подробности в onStart");

        Toast toast = Toast.makeText(getApplicationContext(), "Работает onStart", Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.e("MainActivity", "Ошибка в onStop");
        Log.w("MainActivity", "Предупреждение в onStop");
        Log.i("MainActivity", "Информация в onStop");
        Log.d("MainActivity", "Отладка в  onStop");
        Log.v("MainActivity", "Подробности в onStop");

        Toast toast = Toast.makeText(getApplicationContext(), "Работает onStop", Toast.LENGTH_LONG);
        toast.show();

        if (isFinishing())
            finish();
    }

    @Override
    protected void onDestroy() {
        Log.e("MainActivity", "Ошибка в onDestroy");
        Log.w("MainActivity", "Предупреждение в onDestroy");
        Log.i("MainActivity", "Информация в onDestroy");
        Log.d("MainActivity", "Отладка в  onDestroy");
        Log.v("MainActivity", "Подробности в onDestroy");

        Toast toast = Toast.makeText(getApplicationContext(), "Работает onDestroy", Toast.LENGTH_LONG);
        toast.show();

        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.e("MainActivity", "Ошибка в onPause");
        Log.w("MainActivity", "Предупреждение в onPause");
        Log.i("MainActivity", "Информация в onPause");
        Log.d("MainActivity", "Отладка в  onPause");
        Log.v("MainActivity", "Подробности в onPause");

        Toast toast = Toast.makeText(getApplicationContext(), "Работает onPause", Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e("MainActivity", "Ошибка в onResume");
        Log.w("MainActivity", "Предупреждение в onResume");
        Log.i("MainActivity", "Информация в onResume");
        Log.d("MainActivity", "Отладка в  onResume");
        Log.v("MainActivity", "Подробности в onResume");

        Toast toast = Toast.makeText(getApplicationContext(), "Работает onResume", Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.e("MainActivity", "Ошибка в onRestart");
        Log.w("MainActivity", "Предупреждение в onRestart");
        Log.i("MainActivity", "Информация в onRestart");
        Log.d("MainActivity", "Отладка в  onRestart");
        Log.v("MainActivity", "Подробности в onRestart");

        Toast toast = Toast.makeText(getApplicationContext(), "Работает onRestart", Toast.LENGTH_LONG);
        toast.show();
    }
}