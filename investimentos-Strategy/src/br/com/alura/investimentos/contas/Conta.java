package br.com.alura.investimentos.contas;

public class Conta {

	private double saldo;
	private String titular;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public String getTitular() {
		return titular;
	}
}
