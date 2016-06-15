package br.com.alura.operacoesbancarias.util.conta.estados;

import br.com.alura.operacoesbancarias.modelo.Conta;

public class Negativo extends EstadoDaConta {

	public Negativo() {
		this.descricao = EstadosDasContas.Negativo;
	}

	@Override
	public void sacar(double valor, Conta conta) throws Exception {
		throw new Exception("Você não pode sacar!");
	}

	@Override
	public void depositar(double valor, Conta conta) {
		double novoSaldo = conta.getSaldo() + valor * 0.95;
		conta.setSaldo(novoSaldo);

		if (conta.getSaldo() >= 0) {
			conta.setEstado(new Positivo());
		}
	}

}
