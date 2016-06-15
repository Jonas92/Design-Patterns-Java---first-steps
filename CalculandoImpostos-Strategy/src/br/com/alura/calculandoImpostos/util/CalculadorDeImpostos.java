package br.com.alura.calculandoImpostos.util;

import br.com.alura.calculandoImpostos.impostos.Imposto;
import br.com.alura.calculandoImpostos.orcamento.Orcamento;

public class CalculadorDeImpostos {
	public double calcular(Imposto impostos, Orcamento orcamento) {
		return impostos.calcularSobre(orcamento);
	}
}
