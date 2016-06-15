package br.com.alura.calculandoImpostos.impostos;

import br.com.alura.calculandoImpostos.model.Item;
import br.com.alura.calculandoImpostos.model.Orcamento;

public class Ihit extends TemplateImpostoCondicional {

	public Ihit(Imposto outroImposto) {
		super(outroImposto);
	}

	public Ihit() {
		super();
	}

	@Override
	protected boolean deveAplicarTaxaMinima(Orcamento orcamento) {
		return !possuiProdutosRepetidos(orcamento);
	}

	private boolean possuiProdutosRepetidos(Orcamento orcamento) {

		String nomeProdutoCorrente = "";

		for (Item item : orcamento.getItens()) {
			if (nomeProdutoCorrente.equalsIgnoreCase(item.getDescricao())) {
				return true;
			}

			nomeProdutoCorrente = item.getDescricao();
		}
		return false;
	}

	@Override
	protected double taxaMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.01 * orcamento.getItens().size();
	}

	@Override
	protected double taxaMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

}
