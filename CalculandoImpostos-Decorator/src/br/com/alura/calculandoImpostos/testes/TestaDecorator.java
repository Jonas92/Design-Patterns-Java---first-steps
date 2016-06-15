package br.com.alura.calculandoImpostos.testes;

import br.com.alura.calculandoImpostos.impostos.Iccc;
import br.com.alura.calculandoImpostos.impostos.Icms;
import br.com.alura.calculandoImpostos.impostos.Ihit;
import br.com.alura.calculandoImpostos.impostos.Ikcv;
import br.com.alura.calculandoImpostos.impostos.Iss;
import br.com.alura.calculandoImpostos.model.Orcamento;

public class TestaDecorator {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(500);

		Iss iss = new Iss(new Icms(new Iccc(new Ikcv(new Ihit(new Iss())))));

		double impostoISS = iss.calcularSobre(orcamento);

		System.out.println(impostoISS);
	}
}
