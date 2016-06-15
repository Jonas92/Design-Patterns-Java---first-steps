package br.com.alura.calculandoImpostos.impostos;

import br.com.alura.calculandoImpostos.model.Orcamento;

public class ImpostoMuitoAlto extends Imposto {

	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}

	public ImpostoMuitoAlto() {
		super();
	}

	@Override
	public double calcularSobre(Orcamento orcamento) {
		return orcamento.getValor() * 0.20 + calculoDoOutroImposto(orcamento);
	}

}
