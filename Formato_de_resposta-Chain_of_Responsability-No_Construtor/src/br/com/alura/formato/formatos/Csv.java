package br.com.alura.formato.formatos;

import br.com.alura.formato.model.Requisicao;
import br.com.alura.investimentos.contas.Conta;

public class Csv implements Formatador {

	private Formatador proximoFormatador;

	public Csv(Formatador formatador) {
		this.proximoFormatador = formatador;
	}

	@Override
	public String formatar(Requisicao requisicao, Conta conta) {
		if (requisicao.getFormato().equals(Formato.CSV)) {
			return formatadoComoCsv(conta);
		} else {
			return this.proximoFormatador.formatar(requisicao, conta);
		}
	}

	private String formatadoComoCsv(Conta conta) {
		return String.format("Conta\nTitular;Saldo\n%s;%.2f\n", conta.getTitular(), conta.getSaldo());
	}

}
