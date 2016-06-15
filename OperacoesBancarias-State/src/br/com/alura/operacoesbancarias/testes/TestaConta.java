package br.com.alura.operacoesbancarias.testes;

import br.com.alura.operacoesbancarias.modelo.Conta;

public class TestaConta {

	public static void main(String[] args) {

		Conta conta = new Conta("Jonas", 100);
		conta.sacar(50.0);
		conta.depositar(100.0);
		conta.sacar(-0);
		conta.depositar(100);
		conta.sacar(1000);
		conta.sacar(10);
		conta.sacar(10);
		conta.depositar(1000);
		conta.sacar(20);
	}
}
