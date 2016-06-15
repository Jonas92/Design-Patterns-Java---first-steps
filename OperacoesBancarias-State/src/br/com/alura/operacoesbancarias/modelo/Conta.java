package br.com.alura.operacoesbancarias.modelo;

import br.com.alura.operacoesbancarias.util.conta.estados.EstadoDaConta;
import br.com.alura.operacoesbancarias.util.conta.estados.Positivo;

public class Conta {

	private String titular;
	private double saldo;
	private EstadoDaConta estado;

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.estado = new Positivo();
		this.depositar(saldo);
	}

	public void sacar(double valor) {

		try {
			validar(valor);
			this.estado.sacar(valor, this);
			System.out.println("Saque efetuado com sucesso!");
			System.out.println(this);
		} catch (IllegalArgumentException e) {
			System.out.println("Não pode sacar. " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Não pode sacar. " + e.getMessage());
		} finally {
			System.out.println("");
		}

	}

	public void depositar(double valor) {

		try {
			validar(valor);
			this.estado.depositar(valor, this);
			System.out.println("Deposito efetuado com sucesso!");
			System.out.println(this);
		} catch (IllegalArgumentException e) {
			System.out.println("Não pode sacar. " + e.getMessage());
		} finally {
			System.out.println("");
		}

	}

	private void validar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor inválido!");
		}
	}

	@Override
	public String toString() {
		return String.format("Saldo: R$ %,.2f - Titular: %s - Situação: %s", this.getSaldo(), this.getTitular(),
				this.estado.getDescricao().getSituacao());
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setEstado(EstadoDaConta estado) {
		this.estado = estado;
	}

	public String getTitular() {
		return titular;
	}

}
