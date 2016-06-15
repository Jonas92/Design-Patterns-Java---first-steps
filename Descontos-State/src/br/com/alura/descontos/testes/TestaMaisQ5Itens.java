package br.com.alura.descontos.testes;

import br.com.alura.descontos.model.Item;
import br.com.alura.descontos.model.Orcamento;
import br.com.alura.descontos.util.CalculadorDeDesconto;

public class TestaMaisQ5Itens {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(100);
		orcamento.adicionar(new Item("Xícara", 100));
		orcamento.adicionar(new Item("Xícara", 100));
		orcamento.adicionar(new Item("Xícara", 100));
		orcamento.adicionar(new Item("Xícara", 100));
		orcamento.adicionar(new Item("Xícara", 100));
		orcamento.adicionar(new Item("Xícara", 100));

		CalculadorDeDesconto aplicadorDeDesconto = new CalculadorDeDesconto();

		System.out.println("Total de desconto: R$ " + aplicadorDeDesconto.aplicarNo(orcamento));
	}
	
}
