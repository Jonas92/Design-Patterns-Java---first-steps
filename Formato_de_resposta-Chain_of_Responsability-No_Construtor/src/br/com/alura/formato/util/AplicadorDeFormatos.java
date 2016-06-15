package br.com.alura.formato.util;

import br.com.alura.formato.formatos.Csv;
import br.com.alura.formato.formatos.Porcento;
import br.com.alura.formato.formatos.FormatoIndisponivel;
import br.com.alura.formato.formatos.Xml;
import br.com.alura.formato.model.Requisicao;
import br.com.alura.investimentos.contas.Conta;

public class AplicadorDeFormatos {

	public String formatar(Requisicao requisicao, Conta conta) {

		Csv csv = new Csv(new Xml(new Porcento(new FormatoIndisponivel())));

		String retornoFormatado = "";

		retornoFormatado = csv.formatar(requisicao, conta);

		return retornoFormatado;
	}

}
