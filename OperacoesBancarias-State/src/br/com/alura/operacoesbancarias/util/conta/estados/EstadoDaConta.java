package br.com.alura.operacoesbancarias.util.conta.estados;

import br.com.alura.operacoesbancarias.modelo.Conta;

public abstract class EstadoDaConta {

	protected EstadosDasContas descricao;

	public abstract void sacar(double valor, Conta conta) throws Exception;

	public abstract void depositar(double valor, Conta conta);

	public EstadosDasContas getDescricao() {
		return descricao;
	}

}
