package com.example.reddead2wiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class telaGameplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_gameplay);
    }

    public void irParaTelaInicial(View view){
        Intent novaTela = new Intent(telaGameplay.this, MainActivity.class);
        startActivity(novaTela);
    }
}