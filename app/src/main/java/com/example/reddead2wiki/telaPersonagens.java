package com.example.reddead2wiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.app.SearchManager;

public class telaPersonagens extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_personagens);
    }

    public void irParaTelaInicial(View view){
        Intent novaTela = new Intent(telaPersonagens.this, MainActivity.class);
        startActivity(novaTela);
    }

    public void procurarPersonagens(View view) {
        Intent procuraPersonagem = new Intent(Intent.ACTION_WEB_SEARCH);
        String pesquisa = "Personagens Red Dead Redemption 2";
        procuraPersonagem.putExtra(SearchManager.QUERY, pesquisa);
        startActivity(procuraPersonagem);
    }
}