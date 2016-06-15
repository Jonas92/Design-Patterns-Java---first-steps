package br.com.alura.calculandoImpostos.testes;

import br.com.alura.calculandoImpostos.impostos.Iccc;
import br.com.alura.calculandoImpostos.impostos.Icms;
import br.com.alura.calculandoImpostos.impostos.Imposto;
import br.com.alura.calculandoImpostos.impostos.Iss;
import br.com.alura.calculandoImpostos.orcamento.Orcamento;

public class TestaCalculador {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(10000);

		Imposto icms = new Icms();
		Imposto iss = new Iss();
		Imposto iccc = new Iccc();

		System.out.println("Valor do orçamento: " + orcamento.getValor());
		System.out.println("ICMS: " + icms.calcularSobre(orcamento));
		System.out.println("ISS: " + iss.calcularSobre(orcamento));
		System.out.println("ICCC: " + iccc.calcularSobre(orcamento));
	}
}
