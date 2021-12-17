package com.example.welcomefronduti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class secondaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconda);
        Intent i = getIntent();
        String name;
        String messaggioRicevuto= i.getStringExtra(name;"mes");
        Toast t= Toast.makeText(getApplicationContext(),name.toString(),Toast.LENGTH_LONG);
        t.show();;
        t.setGravity(10,3,5);
    }
}