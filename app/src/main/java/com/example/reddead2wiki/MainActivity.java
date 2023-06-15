package com.example.reddead2wiki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.net.Uri;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irParaRockstar(View view){
        Uri site= Uri.parse("https://www.rockstargames.com/reddeadredemption2/restricted-content/agegate/form?redirect=https%3A%2F%2Fwww.rockstargames.com%2Freddeadredemption2%2F&options=&locale=en_us");
        Intent mover = new Intent(Intent.ACTION_VIEW,site);
        startActivity(mover);
    }

    public void irParaTelaGameplay(View view){
        Intent novaTela = new Intent(MainActivity.this, telaGameplay.class);
        startActivity(novaTela);
    }

    public void irParaTelaPersonagens(View view){
        Intent novaTela = new Intent(MainActivity.this, telaPersonagens.class);
        startActivity(novaTela);

    }

    public void irParaTelaHistoria(View view){
        Intent novaTela = new Intent(MainActivity.this, telaHistoria.class);
        startActivity(novaTela);
    }

    public void irParaTelaMapa(View view){
        Intent novaTela = new Intent(MainActivity.this, telaMapa.class);
        startActivity(novaTela);
    }

}