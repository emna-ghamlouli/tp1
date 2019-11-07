package com.example.tp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LOG_TAG", "Debug ");
        Log.e("LOG_TAG", " Error");
        Log.w("LOG_TAG", "Warn");
        Log.i("LOG_TAG", " Info");
        Log.v("LOG_TAG", " verbose");
        Log.i("LOG_TAG", "  le nom du fichier de mise en page de l'activité principale: MainActivity.java ");
        Log.i("LOG_TAG", "  le nom de la ressource chaîne qui spécifie le nom de l'application: app_name ");
        Log.i("LOG_TAG", " pour créer un nouvel émulateur on utilise AVD Manager");
        Log.i("LOG_TAG", " le volet Logcat si le menu de niveau Log est réglé sur lequel l'élément Info");
    }
}
