package br.com.alura.formato.formatos;

import br.com.alura.formato.model.Requisicao;
import br.com.alura.investimentos.contas.Conta;

public class Porcento implements Formatador {

	private Formatador proximoFormatador;

	public Porcento(Formatador formatador) {
		this.proximoFormatador = formatador;
	}

	@Override
	public String formatar(Requisicao requisicao, Conta conta) {
		if (requisicao.getFormato().equals(Formato.PORCENTO)) {
			return formatadoComPorcento(conta);
		} else {
			return this.proximoFormatador.formatar(requisicao, conta);
		}
	}

	private String formatadoComPorcento(Conta conta) {
		return "%Conta%\n%Titular%" + conta.getTitular() + "%\n%Saldo%" + conta.getSaldo() + "%\n%Conta%\n";
	}

}
