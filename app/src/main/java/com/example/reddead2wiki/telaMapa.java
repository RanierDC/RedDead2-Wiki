package com.example.reddead2wiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;


public class telaMapa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_mapa);


    }

    public void irParaTelaInicial(View view){
        Intent novaTela = new Intent(telaMapa.this, MainActivity.class);
        startActivity(novaTela);
    }

    public void irParaMapaInterativo(View view){
        Uri siteMapa= Uri.parse("https://rdr2map.com");
        Intent visitarMapa = new Intent(Intent.ACTION_VIEW,siteMapa);
        startActivity(visitarMapa);
    }

}