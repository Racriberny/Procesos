package com.cristobalbernal.procesos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.println(Log.ASSERT,"OnCreate","Cuando empieza la aplicacion!!");
    }

    @Override
    protected void onStart() {
        System.out.println("Aqui empieza el onStart");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        System.out.println("Aqui es donde se resetea!!");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        System.out.println("Aqui es donde se hace el resumen!!");
        super.onResume();
    }

    @Override
    protected void onPause() {
        System.out.println("Donde se pausa!!!");
        super.onPause();
    }

    @Override
    protected void onStop() {
        System.out.println("Donde se para!!!");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        System.out.println("Donde se destruye!!!");
        super.onDestroy();
    }
}