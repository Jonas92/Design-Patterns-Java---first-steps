package br.com.alura.descontos.descontos;

import br.com.alura.descontos.model.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double aplicarNo(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto desconto) {
	}

}
