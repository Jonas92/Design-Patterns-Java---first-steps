package br.com.alura.descontos.descontos;

import br.com.alura.descontos.model.Orcamento;

public class AcimaDe5Itens implements Desconto {

	private Desconto proximoDesconto;

	@Override
	public double aplicarNo(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		} else {
			return this.proximoDesconto.aplicarNo(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximoDesconto = desconto;
	}

}
