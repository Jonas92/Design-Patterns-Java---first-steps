package br.com.alura.relatorios.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private List<Conta> contas = new ArrayList<>();

	public Banco(String nome, String endereco, String telefone, String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}

	public void adicionar(Conta conta) {
		this.contas.add(conta);
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getEmail() {
		return email;
	}

	public List<Conta> getContas() {
		return contas;
	}
}
