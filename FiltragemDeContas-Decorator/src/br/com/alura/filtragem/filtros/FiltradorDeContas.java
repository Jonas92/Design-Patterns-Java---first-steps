package br.com.alura.filtragem.filtros;

import java.util.List;

import br.com.alura.filtragem.modelo.Conta;

public class FiltradorDeContas {

	private List<Conta> selecionadasParaAnalise;

	public void aplicarFiltros(List<Conta> contas) {

		Filtro filtros = new SaldoMuitoBaixo(new DataCorrente(new SaldoMuitoAlto()));

		this.selecionadasParaAnalise = filtros.aplicarEm(contas);
	}

	public List<Conta> retornarFiltradas() {
		return this.selecionadasParaAnalise;
	}

}
