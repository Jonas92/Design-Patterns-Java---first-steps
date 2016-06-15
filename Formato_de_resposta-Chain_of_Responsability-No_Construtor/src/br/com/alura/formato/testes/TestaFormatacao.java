package br.com.alura.formato.testes;

import br.com.alura.formato.formatos.Formato;
import br.com.alura.formato.model.Requisicao;
import br.com.alura.formato.util.AplicadorDeFormatos;
import br.com.alura.investimentos.contas.Conta;

public class TestaFormatacao {

	public static void main(String[] args) {

		Requisicao requisicao = new Requisicao(Formato.CSV);
		Requisicao requisicao2 = new Requisicao(Formato.XML);
		Requisicao requisicao3 = new Requisicao(Formato.PORCENTO);
		Requisicao requisicao4 = new Requisicao(Formato.FORMATOINDISPONIVEL);

		Conta conta = new Conta("Jonas", 1000);

		AplicadorDeFormatos aplicadorDeFormatos = new AplicadorDeFormatos();

		System.out.println(aplicadorDeFormatos.formatar(requisicao, conta));
		System.out.println(aplicadorDeFormatos.formatar(requisicao2, conta));
		System.out.println(aplicadorDeFormatos.formatar(requisicao3, conta));
		System.out.println(aplicadorDeFormatos.formatar(requisicao4, conta));
	}
}
