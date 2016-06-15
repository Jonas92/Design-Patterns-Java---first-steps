package br.com.alura.investimentos.investidores;

import br.com.alura.investimentos.contas.Conta;

public class Arrojado implements Investidor {

	@Override
	public double investirNa(Conta conta) {

		double fr = new FatorDeRisco().calculado();

		if (fr >= 0.5) {
			return conta.getSaldo() * 0.006;
		} else {
			if (fr >= 0.2) {
				return conta.getSaldo() * 0.03;
			} else {
				return conta.getSaldo() * 0.05;
			}

		}
	}

}
