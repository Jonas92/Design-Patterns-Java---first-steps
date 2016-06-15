package br.com.alura.calculandoImpostos.model;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	private double valor;
	private List<Item> itens = new ArrayList<>();

	public Orcamento(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void adicionar(Item item) {
		itens.add(item);
	}

	public List<Item> getItens() {
		return itens;
	}
}
