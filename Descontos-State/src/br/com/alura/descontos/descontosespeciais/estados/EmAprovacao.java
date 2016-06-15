package br.com.alura.descontos.descontosespeciais.estados;

import br.com.alura.descontos.descontosespeciais.estados.EstadoDoOrcamento;
import br.com.alura.descontos.model.Orcamento;

public class EmAprovacao extends EstadoDoOrcamento {

	@Override
	protected double taxaDeDesconto() throws Exception {
		return 0.05;
	}

	@Override
	public void aprovar(Orcamento orcamento) throws Exception {
		orcamento.setEstado(new Aprovado());
	}

	@Override
	public void reprovar(Orcamento orcamento) throws Exception {
		orcamento.setEstado(new Reprovado());
	}

	@Override
	public void finalizar(Orcamento orcamento) throws Exception {
		throw new Exception("Está em aprovação");
	}

}
