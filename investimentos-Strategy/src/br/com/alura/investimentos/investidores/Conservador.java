package br.com.alura.investimentos.investidores;

import br.com.alura.investimentos.contas.Conta;

public class Conservador implements Investidor {

	@Override
	public double investirNa(Conta conta) {
		return conta.getSaldo() * 0.008;
	}

}
