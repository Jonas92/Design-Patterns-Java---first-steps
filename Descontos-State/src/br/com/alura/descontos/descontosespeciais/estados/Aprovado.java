package br.com.alura.descontos.descontosespeciais.estados;

import br.com.alura.descontos.model.Orcamento;

public class Aprovado extends EstadoDoOrcamento {

	@Override
	protected double taxaDeDesconto() throws Exception {
		return 0.02;
	}

	@Override
	public void aprovar(Orcamento orcamento) throws Exception {
		throw new Exception("Já está aprovado!");
	}

	@Override
	public void reprovar(Orcamento orcamento) throws Exception {
		throw new Exception("Já está aprovado!");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setEstado(new Finalizado());
	}

}
