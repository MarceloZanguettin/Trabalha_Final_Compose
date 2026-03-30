package com.example.trabalhafinalcompose.data


class LancamentoDatasource private constructor() {
    companion object {
        val instance: LancamentoDatasource by lazy {
            LancamentoDatasource()
        }
    }

    private val lancamentos: MutableList<Lancamento> = mutableListOf()
    private val lancamentosObservers: MutableList<LancamentoObserver> = mutableListOf()

    fun registrarObserver(lancamentoObserver: LancamentoObserver) {
        lancamentosObservers.add(lancamentoObserver)
    }

    fun removerObserver(lancamentoObserver: LancamentoObserver) {
        lancamentosObservers.remove(lancamentoObserver)
    }

    private fun notificarObservers() {
        lancamentosObservers.forEach { it.onUpdate(listar()) }
    }

    fun salvar(lancamento: Lancamento): Lancamento = if (lancamento.id > 0) {
        val indice = lancamentos.indexOfFirst { it.id == lancamento.id }
        lancamento.also { lancamentos[indice] = it }
    } else {
        val maiorId = lancamentos.maxByOrNull { it.id }?.id ?: 0
        lancamento.copy(id = maiorId + 1).also { lancamentos.add(it) }
    }.also {
        notificarObservers()
    }

    fun remover(lancamento: Lancamento) {
        if (lancamento.id > 0) {
            lancamentos.removeIf { it.id == lancamento.id }
            notificarObservers()
        }
    }

    fun listar(): List<Lancamento> = lancamentos.toList().sortedBy { it.data }

    fun carregar(id: Int): Lancamento? = lancamentos.firstOrNull { it.id == id }
}
