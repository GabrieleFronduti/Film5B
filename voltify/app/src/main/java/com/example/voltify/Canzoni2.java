package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Canzoni2 extends AppCompatActivity {

    Button btnRitorna;
    TextView music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canzoni2);
        btnRitorna = findViewById(R.id.btnRitorna);
        music = findViewById(R.id.music);
        Intent i = getIntent();
        String dati = i.getStringExtra("musica");
        music.setText(dati);

    }

}