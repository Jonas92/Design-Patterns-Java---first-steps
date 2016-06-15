package br.com.alura.calculandoImpostos.impostos;

import br.com.alura.calculandoImpostos.model.Orcamento;

public class Icms extends Imposto {

	public Icms(Imposto outroImposto) {
		super(outroImposto);
	}

	public Icms() {
		super();
	}

	@Override
	public double calcularSobre(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + 50 + calculoDoOutroImposto(orcamento);
	}

}
