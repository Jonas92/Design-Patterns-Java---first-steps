package br.com.alura.descontos.testes;

import br.com.alura.descontos.model.Item;
import br.com.alura.descontos.model.Orcamento;
import br.com.alura.descontos.util.CalculadorDeDesconto;

public class TestaVendaCasada {
 
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(100);
		orcamento.adicionar(new Item("lápis", 10));
		orcamento.adicionar(new Item("Caneta", 2));
		
		CalculadorDeDesconto calculadorDeDesconto = new CalculadorDeDesconto();
		
		System.out.println("Valor do desconto: R$ " + calculadorDeDesconto.aplicarNo(orcamento));
		
	}
}
