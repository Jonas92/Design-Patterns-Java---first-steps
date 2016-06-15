package br.com.alura.calculandoImpostos.impostos;

import br.com.alura.calculandoImpostos.model.Orcamento;

public class Iss extends Imposto {

	public Iss() {
		super();
	}

	public Iss(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcularSobre(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}

}
