package br.com.alura.investimentos.util;

import br.com.alura.investimentos.contas.Conta;
import br.com.alura.investimentos.investidores.Investidor;

public class RealizadorDeInvestimentos {

	private Investidor investidor;
	private Conta conta;

	public RealizadorDeInvestimentos como(Investidor investidor) {
		this.investidor = investidor;
		return this;
	}

	public void na(Conta conta) {
		this.conta = conta;
		investir();
	}

	private void investir() {
		double valorBrutoDoInvestimento = this.investidor.investirNa(this.conta);
		this.conta.depositar(retornoLiquidoSobre(valorBrutoDoInvestimento));
	}

	private double retornoLiquidoSobre(double valorBrutoDoInvestimento) {
		return valorBrutoDoInvestimento *= 0.75; 
	}
}
