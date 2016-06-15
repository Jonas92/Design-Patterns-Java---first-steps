package br.com.alura.formato.formatos;

import br.com.alura.formato.model.Requisicao;
import br.com.alura.investimentos.contas.Conta;

public class Xml implements Formatador {

	private Formatador proximoFormatador;

	@Override
	public String formatar(Requisicao requisicao, Conta conta) {
		if (requisicao.getFormato().equals(Formato.XML)) {
			return formatadoComoXml(conta);
		} else {
			return proximoFormatador.formatar(requisicao, conta);
		}

	}

	private String formatadoComoXml(Conta conta) {
		return String.format("<conta>\n" + "<titular>%s</titular>\n" + "<saldo>%.2f</saldo>\n" + "</conta>\n",
				conta.getTitular(), conta.getSaldo());
	}

	@Override
	public void setProximoFormatador(Formatador formatador) {
		this.proximoFormatador = formatador;
	}

}
