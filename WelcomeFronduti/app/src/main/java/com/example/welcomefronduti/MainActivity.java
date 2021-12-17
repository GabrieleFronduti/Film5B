package com.example.welcomefronduti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnReset;
    Button btnText;
    Button btnPlay;
    TextView lblEdit;
    EditText edtNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnReset= (Button) findViewById(R.id.btnReset);
        btnText= (Button) findViewById(R.id.btnText);
        btnPlay= (Button) findViewById(R.id.btnPlay);
        lblEdit= (TextView) findViewById(R.id.lblEdit);
    }
    public void lanciaSecondaActivity(View v){
        Intent i= new Intent(getApplicationContext(),secondaActivity.class);
        String name;
        i.putExtra(name: "mes",lblEdit.getText());
        startActivity(i);
    }
    public void reset(View v){
        lblEdit.setText(" ");
    }
    public void test(View v){
        String text;
        Toast t=Toast.makeText(getApplicationContext(),text:"messaggio",Toast.LENGTH_LONG);
        t.show();
    }
    public void lanciadue(View v){
        Intent i= new Intent(getApplicationContext(), secondaActivity.class);
        startActivity(i);
    }
}