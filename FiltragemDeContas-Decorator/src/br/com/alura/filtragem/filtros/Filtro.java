package br.com.alura.filtragem.filtros;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.filtragem.modelo.Conta;

public abstract class Filtro {

	protected Filtro proximoFiltro;

	public Filtro(Filtro filtro) {
		this.proximoFiltro = filtro;
	}

	public Filtro() {
	}

	private final List<Conta> proximo(List<Conta> contas) {
		if (proximoFiltro != null)
			return proximoFiltro.aplicarEm(contas);
		else
			return new ArrayList<Conta>();
	}

	public final List<Conta> aplicarEm(List<Conta> contas) {

		List<Conta> suspeitas = new ArrayList<>();
		for (Conta conta : contas) {

			if (contaEhSuspeita(conta)) {

				suspeitas.add(conta);
			}
		}
		suspeitas.addAll(proximo(contas));
		return suspeitas;
	}

	protected abstract boolean contaEhSuspeita(Conta conta);

}
