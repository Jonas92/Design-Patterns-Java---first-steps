package br.com.alura.descontos.descontosespeciais.estados;

import br.com.alura.descontos.model.Orcamento;

public class Finalizado extends EstadoDoOrcamento {

	@Override
	protected double taxaDeDesconto() throws Exception {
		throw new Exception("Já está finalizado!");
	}

	@Override
	public void aprovar(Orcamento orcamento) throws Exception {
		throw new Exception("Já está finalizado!");
	}

	@Override
	public void reprovar(Orcamento orcamento) throws Exception {
		throw new Exception("Já está finalizado!");
	}

	@Override
	public void finalizar(Orcamento orcamento) throws Exception {
		throw new Exception("Já está finalizado!");
	}

}
