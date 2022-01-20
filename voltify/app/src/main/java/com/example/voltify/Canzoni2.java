package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Canzoni2 extends AppCompatActivity {

    Button btnRitorna;
    View viewBrano;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canzoni2);
        btnRitorna = findViewById(R.id.btnRitorna);
        viewBrano = findViewById(R.id.viewBrano);
    }
    Intent intent = getIntent();
}