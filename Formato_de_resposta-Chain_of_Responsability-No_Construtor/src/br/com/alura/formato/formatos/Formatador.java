package br.com.alura.formato.formatos;

import br.com.alura.formato.model.Requisicao;
import br.com.alura.investimentos.contas.Conta;

public interface Formatador {

	String formatar(Requisicao requisicao, Conta conta);
}
