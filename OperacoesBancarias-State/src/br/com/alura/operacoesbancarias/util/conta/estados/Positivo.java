package br.com.alura.operacoesbancarias.util.conta.estados;

import br.com.alura.operacoesbancarias.modelo.Conta;

public class Positivo extends EstadoDaConta {

	public Positivo() {
		this.descricao = EstadosDasContas.Positivo;
	}

	@Override
	public void sacar(double valor, Conta conta) {
		double novoSaldo = conta.getSaldo() - valor;
		conta.setSaldo(novoSaldo);

		if (conta.getSaldo() < 0) {
			conta.setEstado(new Negativo());
		}
	}

	@Override
	public void depositar(double valor, Conta conta) {
		double novoSaldo = conta.getSaldo() + valor * 0.98;
		conta.setSaldo(novoSaldo);
	}

}
