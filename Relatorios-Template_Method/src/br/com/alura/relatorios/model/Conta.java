package br.com.alura.relatorios.model;

public class Conta {

	private double saldo;
	private String titular;
	private int numero;
	private String agencia;

	public Conta(double saldo, String titular, int numero, String agencia) {
		this.saldo = saldo;
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public int getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}

}
