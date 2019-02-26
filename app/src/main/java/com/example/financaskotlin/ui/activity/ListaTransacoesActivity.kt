package com.example.financaskotlin.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import com.example.financaskotlin.R
import com.example.financaskotlin.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*

class ListaTransacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes = listOf("Comida - R$ 20,50", "Economia - R$ 100,00")

        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transacoes, this)
    }
}