package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button btnInserisci;
    EditText txtitolo;
    EditText txtdurata;
    EditText txtautore;
    GestoreBrani gb;
    Spinner spnGenere;
    ArrayAdapter<String>spGen;
    String[] elencogeneri = {"jazz", "Hip-hop", "grunge", "reagge"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInserisci=findViewById(R.id.btnInserisci);
        txtitolo=findViewById(R.id.txtitolo);
        spnGenere = (Spinner)findViewById(R.id.spnGenere);
        ArrayAdapter<String> spGen = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item, elencogeneri);
        spnGenere.setAdapter(spGen);
        //contenitore generico (contenitore grafico spinner)
        //spGen al posto del aaG del prof




        gb= new GestoreBrani();
        btnInserisci.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Brano b = new Brano(txtitolo.getText().toString(), txtdurata.getText().toString(),
                        txtautore.getText().toString(), spnGenere.getSelectedItem().toString());
                gb.addBrano(b);
                Log.d("brano creato", b.toString());

                /*String genselezionato = spnGenere.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(),genselezionato,Toast.LENGTH_LONG).show();
                gb.addBrano(txtitolo.getText().toString());*/
            }
        });
        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Canzoni2.class);
                intent.putExtra("tit", (Parcelable) txtitolo);
                intent.putExtra("d", (Parcelable) txtdurata);
                intent.putExtra("aut", (Parcelable) txtautore);
                intent.putExtra("spn", (Parcelable) spnGenere);
                startActivity(intent);
            }
        });
    }
}






