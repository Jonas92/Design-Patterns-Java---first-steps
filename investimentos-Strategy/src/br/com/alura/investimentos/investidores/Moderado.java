package br.com.alura.investimentos.investidores;

import br.com.alura.investimentos.contas.Conta;

public class Moderado implements Investidor {

	@Override
	public double investirNa(Conta conta) {

		FatorDeRisco fatorDeRisco = new FatorDeRisco();

		if (fatorDeRisco.calculado() >= 0.5) {
			return conta.getSaldo() * 0.007;
		} else {
			return conta.getSaldo() * 0.025;
		}
	}

}
