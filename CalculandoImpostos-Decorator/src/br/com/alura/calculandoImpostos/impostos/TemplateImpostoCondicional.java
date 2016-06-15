package br.com.alura.calculandoImpostos.impostos;

import br.com.alura.calculandoImpostos.model.Orcamento;

public abstract class TemplateImpostoCondicional extends Imposto {

	public TemplateImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}

	public TemplateImpostoCondicional() {
		super();
	}

	@Override
	public final double calcularSobre(Orcamento orcamento) {

		double valorDoImposto = 0;

		if (deveAplicarTaxaMinima(orcamento)) {
			valorDoImposto = taxaMinima(orcamento);
		} else {
			valorDoImposto = taxaMaxima(orcamento);
		}

		return valorDoImposto + calculoDoOutroImposto(orcamento);
	}

	protected abstract boolean deveAplicarTaxaMinima(Orcamento orcamento);

	protected abstract double taxaMinima(Orcamento orcamento);

	protected abstract double taxaMaxima(Orcamento orcamento);

}
