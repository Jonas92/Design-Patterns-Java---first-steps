package br.com.alura.calculandoImpostos.testes;

import br.com.alura.calculandoImpostos.impostos.Ihit;
import br.com.alura.calculandoImpostos.impostos.Imposto;
import br.com.alura.calculandoImpostos.model.Item;
import br.com.alura.calculandoImpostos.model.Orcamento;
import br.com.alura.calculandoImpostos.util.CalculadorDeImpostos;

public class TestaIhit {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(100);
		orcamento.adicionar(new Item("Cadeira", 100));
		orcamento.adicionar(new Item("Cadeira", 100));

		CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

		Imposto impostos = new Ihit();

		System.out.println("IHIT: " + calculadorDeImpostos.calcular(impostos, orcamento));
	}
}
