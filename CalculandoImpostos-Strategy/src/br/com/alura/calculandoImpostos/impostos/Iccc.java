package br.com.alura.calculandoImpostos.impostos;

import br.com.alura.calculandoImpostos.orcamento.Orcamento;

public class Iccc implements Imposto {

	@Override
	public double calcularSobre(Orcamento orcamento) {
		double valorIccc = 0;

		if (orcamento.getValor() < 1000) {
			valorIccc = orcamento.getValor() * 0.05;
		} else {
			if (orcamento.getValor() > 3000) {
				valorIccc = orcamento.getValor() * 0.08 + 30;
			} else {
				valorIccc = orcamento.getValor() * 0.07;
			}
		}

		return valorIccc;
	}

}
