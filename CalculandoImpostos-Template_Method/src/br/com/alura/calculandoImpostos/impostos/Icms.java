package br.com.alura.calculandoImpostos.impostos;

import br.com.alura.calculandoImpostos.model.Orcamento;

public class Icms implements Imposto {

	@Override
	public double calcularSobre(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + 50;
	}

}
