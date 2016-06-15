package br.com.alura.calculandoImpostos.testes;

import br.com.alura.calculandoImpostos.impostos.Icpp;
import br.com.alura.calculandoImpostos.impostos.Ikcv;
import br.com.alura.calculandoImpostos.impostos.Imposto;
import br.com.alura.calculandoImpostos.model.Item;
import br.com.alura.calculandoImpostos.model.Orcamento;
import br.com.alura.calculandoImpostos.util.CalculadorDeImpostos;

public class TestaIkcvEIcpp {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(100);
		orcamento.adicionar(new Item("Bicicleta", 80));

		CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

		Imposto ikcv = new Ikcv();
		Icpp icpp = new Icpp();

		System.out.println("IKCV: " + calculadorDeImpostos.calcular(ikcv, orcamento));
		System.out.println("ICPP: " + calculadorDeImpostos.calcular(icpp, orcamento));
	}
}
