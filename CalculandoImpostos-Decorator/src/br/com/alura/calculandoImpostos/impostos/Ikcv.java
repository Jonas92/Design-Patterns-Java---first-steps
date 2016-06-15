package br.com.alura.calculandoImpostos.impostos;

import br.com.alura.calculandoImpostos.model.Item;
import br.com.alura.calculandoImpostos.model.Orcamento;

public class Ikcv extends TemplateImpostoCondicional {

	public Ikcv(Imposto outroImposto) {
		super(outroImposto);
	}

	public Ikcv() {
		super();
	}

	// EXEMPLO DE USO DO FINAL EM UM MÉTODO, NA CLASSE PAI. DESSA FORMA NÃO É
	// POSSÍVEL REESCREVÊ-LO
	// @Override
	// public double calcularSobre(Orcamento orcamento) {
	// // TODO Auto-generated method stub
	// return super.calcularSobre(orcamento);
	// }

	@Override
	public boolean deveAplicarTaxaMinima(Orcamento orcamento) {
		return orcamento.getValor() < 500 && !possuiItemComPrecoMaiorQue500No(orcamento);
	}

	private boolean possuiItemComPrecoMaiorQue500No(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getPreco() > 500) {
				return true;
			}
		}
		return false;
	}

	@Override
	public double taxaMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double taxaMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

}
