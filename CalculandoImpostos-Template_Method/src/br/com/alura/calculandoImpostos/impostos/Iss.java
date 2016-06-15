package br.com.alura.calculandoImpostos.impostos;

import br.com.alura.calculandoImpostos.model.Orcamento;

public class Iss implements Imposto{

	@Override
	public double calcularSobre(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
