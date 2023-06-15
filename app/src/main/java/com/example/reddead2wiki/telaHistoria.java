package com.example.reddead2wiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class telaHistoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_historia);
    }

    public void irParaTelaInicial(View view){
        Intent novaTela = new Intent(telaHistoria.this, MainActivity.class);
        startActivity(novaTela);
    }
}