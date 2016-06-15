package br.com.alura.nf.modelo;

public class Item {

	private String nome;
	private double preco;

	public Item(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return String.format("Nome: %s - Preço: R$ %,.2f", this.nome, this.preco);
	}

	public double getPreco() {
		return preco;
	}
}
