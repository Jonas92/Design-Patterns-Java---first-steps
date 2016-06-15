package br.com.alura.descontos.descontosespeciais.estados;

import br.com.alura.descontos.model.Orcamento;

public abstract class EstadoDoOrcamento {

	private boolean descontoJaFoiAplicado;

	public final double aplicarDescontoEm(Orcamento orcamento) throws Exception {
		if (this.descontoJaFoiAplicado) {
			throw new Exception("Este desconto já foi aplicado!");
		}

		this.descontoJaFoiAplicado = true;
		return orcamento.getValor() * taxaDeDesconto();
	}

	protected abstract double taxaDeDesconto() throws Exception;

	public abstract void aprovar(Orcamento orcamento) throws Exception;

	public abstract void reprovar(Orcamento orcamento) throws Exception;

	public abstract void finalizar(Orcamento orcamento) throws Exception;

}
