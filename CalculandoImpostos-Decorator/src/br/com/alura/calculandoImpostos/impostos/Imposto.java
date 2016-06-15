package br.com.alura.calculandoImpostos.impostos;

import br.com.alura.calculandoImpostos.model.Orcamento;

public abstract class Imposto {

	private final Imposto outroImposto;

	public Imposto() {
		outroImposto = null;
	}

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public abstract double calcularSobre(Orcamento orcamento);

	protected double calculoDoOutroImposto(Orcamento orcamento) {
		if (outroImposto == null) {
			return 0;
		}
		return outroImposto.calcularSobre(orcamento);
	}
}
