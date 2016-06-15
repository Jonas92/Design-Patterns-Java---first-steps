package br.com.alura.descontos.descontos;

import br.com.alura.descontos.model.Item;
import br.com.alura.descontos.model.Orcamento;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximoDesconto;

	@Override
	public double aplicarNo(Orcamento orcamento) {
		if (possuiProdutosParaDarDescontoNo(orcamento)) {
			return orcamento.getValor() * 0.05;
		} else {
			return this.proximoDesconto.aplicarNo(orcamento);
		}
	}

	private boolean possuiProdutosParaDarDescontoNo(Orcamento orcamento) {
		return existe("Caneta", orcamento) && existe("Lápis", orcamento);
	}

	private boolean existe(String nomeProduto, Orcamento orcamento) {

		for (Item item : orcamento.getItens()) {
			if (item.getDescricao().equalsIgnoreCase(nomeProduto)) {
				return true;
			}
		}

		return false;
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximoDesconto = desconto;
	}

}
