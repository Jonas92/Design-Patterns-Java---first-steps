package br.com.alura.calculandoImpostos.impostos;

import br.com.alura.calculandoImpostos.orcamento.Orcamento;

public interface Imposto {

	double calcularSobre(Orcamento orcamento);
}
