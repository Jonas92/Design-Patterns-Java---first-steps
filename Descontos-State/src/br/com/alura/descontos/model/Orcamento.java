package br.com.alura.descontos.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.descontos.descontosespeciais.estados.EmAprovacao;
import br.com.alura.descontos.descontosespeciais.estados.EstadoDoOrcamento;

public class Orcamento {

	private double valor;
	private List<Item> itens = new ArrayList<>();
	private EstadoDoOrcamento estado;

	public Orcamento(double valor) {
		this.valor = valor;
		this.estado = new EmAprovacao();
	}

	public void adicionar(Item item) {
		itens.add(item);
	}

	public double aplicarDescontoEspecial() {
		double desconto = 0;
		try {
			desconto = this.estado.aplicarDescontoEm(this);
		} catch (Exception e) {
			System.out.println("Erro ao aplicar desconto!\n" + e.getMessage());
		}
		return desconto;
	}

	public void aprovar() {
		try {
			this.estado.aprovar(this);
			System.out.println("Aprovado com sucesso!");
		} catch (Exception e) {
			System.out.println("Não posso aprovar! " + e.getMessage());
		}
	}

	public void reprovar() {
		try {
			this.estado.reprovar(this);
			System.out.println("Reprovado com sucesso!");
		} catch (Exception e) {
			System.out.println("Não posso reprovar");
		}
	}

	public void finalizar() {
		try {
			this.estado.finalizar(this);
			System.out.println("Finalizado com sucesso!");
		} catch (Exception e) {
			System.out.println("Não posso finalizar! " + e.getMessage());
		}
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void setEstado(EstadoDoOrcamento estado) {
		this.estado = estado;
	}

}
