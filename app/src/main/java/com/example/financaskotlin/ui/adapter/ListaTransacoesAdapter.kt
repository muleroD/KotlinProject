package com.example.financaskotlin.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.financaskotlin.R
import com.example.financaskotlin.extension.formataToBR
import com.example.financaskotlin.model.Transacao
import kotlinx.android.synthetic.main.transacao_item.view.*

class ListaTransacoesAdapter(
    private val transacoes: List<Transacao>,
    private val context: Context
) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val viewCreate = LayoutInflater.from(context).inflate(
            R.layout.transacao_item,
            parent,
            false
        )

        val transacao = transacoes[position]
        viewCreate.transacao_valor.text = transacao.valor.toString()
        viewCreate.transacao_categoria.text = transacao.categoria
        viewCreate.transacao_data.text = transacao.data.formataToBR()

        return viewCreate
    }

    override fun getItem(position: Int): Transacao {
        return transacoes[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return transacoes.size
    }

}