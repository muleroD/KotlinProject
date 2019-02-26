package com.example.financaskotlin.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.financaskotlin.R
import com.example.financaskotlin.model.Transacao
import com.example.financaskotlin.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.*

class ListaTransacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes = listOf(
            Transacao(BigDecimal(20.50), "Comida", Calendar.getInstance()),
            Transacao(BigDecimal(100.00), "Economia", Calendar.getInstance())
        )

        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transacoes, this)
    }
}