package br.com.alura.descontos.descontos;

import br.com.alura.descontos.model.Orcamento;

public class ValorMaiorQ500 implements Desconto {

	private Desconto proximoDesconto;

	@Override
	public double aplicarNo(Orcamento orcamento) {

		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		} else {
			return this.proximoDesconto.aplicarNo(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximoDesconto = desconto;

	}

}
