package br.com.alura.formato.formatos;

import br.com.alura.formato.model.Requisicao;
import br.com.alura.investimentos.contas.Conta;

public class FormatoIndisponivel implements Formatador{

	@Override
	public String formatar(Requisicao requisicao, Conta conta) {
		return "Formato indisponível!";
	}

}
