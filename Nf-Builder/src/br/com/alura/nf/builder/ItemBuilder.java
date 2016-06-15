package br.com.alura.nf.builder;

import br.com.alura.nf.modelo.Item;

public class ItemBuilder {

	private String nome;
	private double preco;

	public ItemBuilder comNome(String nome) {
		this.nome = nome;
		return this;
	}

	public ItemBuilder comPreco(double preco) {
		this.preco = preco;
		return this;
	}

	public Item criarItem() {
		return new Item(this.nome, this.preco);
	}

}
