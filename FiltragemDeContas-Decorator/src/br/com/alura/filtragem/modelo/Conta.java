package br.com.alura.filtragem.modelo;

import java.util.Date;

public class Conta {

	private double saldo;
	private Date dataDeAbertura;

	public Conta(double saldo, Date dataDeAbertura) {
		this.saldo = saldo;
		this.dataDeAbertura = dataDeAbertura;
	}

	public Date getDataDeAbertura() {
		return dataDeAbertura;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Saldo: R$ " + this.getSaldo() + "-Data de abertura: " + this.getDataDeAbertura() + "\n";
	}

}
