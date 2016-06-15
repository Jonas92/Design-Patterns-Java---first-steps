package br.com.alura.descontos.descontos;

import br.com.alura.descontos.model.Orcamento;

public interface Desconto {

	double aplicarNo(Orcamento orcamento);

	void setProximo(Desconto desconto);

}
