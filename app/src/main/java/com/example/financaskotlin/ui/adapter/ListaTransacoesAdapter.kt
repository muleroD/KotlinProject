package com.example.financaskotlin.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

import com.example.financaskotlin.R
import com.example.financaskotlin.extension.dataBr
import com.example.financaskotlin.extension.limitaString
import com.example.financaskotlin.extension.moedaBr

import com.example.financaskotlin.model.Tipo
import com.example.financaskotlin.model.Transacao
import kotlinx.android.synthetic.main.transacao_item.view.*

class ListaTransacoesAdapter(
    private val transacoes: List<Transacao>,
    private val context: Context
) : BaseAdapter() {

    private val limiteDaString = 14;

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val viewCreate = LayoutInflater.from(context).inflate(
            R.layout.transacao_item,
            parent,
            false
        )

        val transacao = transacoes[position]

        designView(transacao, viewCreate)

        viewCreate.transacao_valor.text = transacao.valor.moedaBr()
        viewCreate.transacao_categoria.text = transacao.categoria.limitaString(limiteDaString)
        viewCreate.transacao_data.text = transacao.data.dataBr()

        return viewCreate
    }

    private fun designView(transacao: Transacao, viewCreate: View) {
        when {
            transacao.tipo == Tipo.receita -> {
                viewCreate.transacao_valor.setTextColor(ContextCompat.getColor(context, R.color.receita))
                viewCreate.transacao_icone.setBackgroundResource(R.drawable.icone_transacao_item_receita)
            }
            transacao.tipo == Tipo.despesa -> {
                viewCreate.transacao_valor.setTextColor(ContextCompat.getColor(context, R.color.despesa))
                viewCreate.transacao_icone.setBackgroundResource(R.drawable.icone_transacao_item_despesa)
            }
            else -> viewCreate.transacao_valor.setTextColor(ContextCompat.getColor(context, R.color.indefinida))
        }
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