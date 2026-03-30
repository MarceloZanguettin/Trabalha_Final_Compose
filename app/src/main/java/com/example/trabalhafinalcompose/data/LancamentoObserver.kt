package com.example.trabalhafinalcompose.data

interface LancamentoObserver {
    fun onUpdate(lancamentosAtualizados: List<Lancamento>)
}