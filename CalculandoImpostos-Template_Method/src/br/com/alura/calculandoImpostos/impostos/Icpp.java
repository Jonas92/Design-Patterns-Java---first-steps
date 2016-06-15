package br.com.alura.calculandoImpostos.impostos;

import br.com.alura.calculandoImpostos.model.Orcamento;

public class Icpp extends TemplateImpostoCondicional {

	@Override
	public boolean deveAplicarTaxaMinima(Orcamento orcamento) {
		return orcamento.getValor() < 500;
	}

	@Override
	public double taxaMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	public double taxaMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

}
