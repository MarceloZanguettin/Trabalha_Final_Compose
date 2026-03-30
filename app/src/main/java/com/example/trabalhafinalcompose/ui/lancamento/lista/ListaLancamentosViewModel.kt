package com.example.trabalhafinalcompose.ui.lancamento.lista

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.trabalhafinalcompose.data.Lancamento
import com.example.trabalhafinalcompose.data.LancamentoDatasource
import com.example.trabalhafinalcompose.data.LancamentoObserver

class ListaLancamentosViewModel : ViewModel(), LancamentoObserver {
    var state: ListaLancamentosState by mutableStateOf(ListaLancamentosState())
        private set

    init {
        LancamentoDatasource.instance.registrarObserver(this)
        carregarLancamentos()
    }

    override fun onCleared() {
        LancamentoDatasource.instance.removerObserver(this)
        super.onCleared()
    }

    fun carregarLancamentos() {
        state = state.copy(
            carregando = true,
            erroAoCarregar = false
        )
        val lancamentos = LancamentoDatasource.instance.listar()
        state = state.copy(
            carregando = false,
            lancamentos = lancamentos
        )
    }

    override fun onUpdate(lancamentosAtualizados: List<Lancamento>) {
        state = state.copy(lancamentos = lancamentosAtualizados)
    }
}