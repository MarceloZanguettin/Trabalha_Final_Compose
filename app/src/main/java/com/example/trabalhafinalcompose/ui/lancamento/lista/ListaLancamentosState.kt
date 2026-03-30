package com.example.trabalhafinalcompose.ui.lancamento.lista

import com.example.trabalhafinalcompose.data.Lancamento

data class ListaLancamentosState(
    val carregando: Boolean = false,
    val erroAoCarregar: Boolean = false,
    val lancamentos: List<Lancamento> = listOf()
)