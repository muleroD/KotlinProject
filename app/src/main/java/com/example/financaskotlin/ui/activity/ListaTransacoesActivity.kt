package com.example.financaskotlin.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.financaskotlin.R
import com.example.financaskotlin.model.Tipo
import com.example.financaskotlin.model.Transacao
import com.example.financaskotlin.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.*

class ListaTransacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes: List<Transacao> = transacoesExample()

        lista_transacoes_listview.adapter = configuraLista(transacoes)
    }

    private fun configuraLista(transacoes: List<Transacao>) =
        ListaTransacoesAdapter(transacoes, this)

    private fun transacoesExample(): List<Transacao> {
        return listOf(
            Transacao(valor = BigDecimal(20.50), categoria = "Comida", tipo = Tipo.despesa),
            Transacao(valor = BigDecimal(100.00), categoria = "Economia", tipo = Tipo.receita),
            Transacao(valor = BigDecimal(200.00), categoria = "Roupas", tipo = Tipo.despesa)
        )
    }
}