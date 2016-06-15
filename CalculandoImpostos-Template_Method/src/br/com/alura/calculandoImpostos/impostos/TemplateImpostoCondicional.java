package br.com.alura.calculandoImpostos.impostos;

import br.com.alura.calculandoImpostos.model.Orcamento;

public abstract class TemplateImpostoCondicional implements Imposto {

	@Override
	public final double calcularSobre(Orcamento orcamento) {
		if (deveAplicarTaxaMinima(orcamento)) {
			return taxaMinima(orcamento);
		} else {
			return taxaMaxima(orcamento);
		}
	}

	protected abstract boolean deveAplicarTaxaMinima(Orcamento orcamento);

	protected abstract double taxaMinima(Orcamento orcamento);

	protected abstract double taxaMaxima(Orcamento orcamento);

}
