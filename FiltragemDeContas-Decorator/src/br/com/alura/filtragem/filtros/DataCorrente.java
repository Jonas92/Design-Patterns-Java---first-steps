package br.com.alura.filtragem.filtros;

import java.util.Date;

import br.com.alura.filtragem.modelo.Conta;

public class DataCorrente extends Filtro {

	public DataCorrente(Filtro filtro) {
		super(filtro);
	}

	public DataCorrente() {
		super();
	}

	@Override
	protected boolean contaEhSuspeita(Conta conta) {
		return mesDeAberturaDa(conta) == mesAtual();
	}

	@SuppressWarnings("deprecation")
	private int mesAtual() {
		return new Date(System.currentTimeMillis()).getMonth();
	}

	@SuppressWarnings("deprecation")
	private int mesDeAberturaDa(Conta conta) {
		return conta.getDataDeAbertura().getMonth();
	}

	// @Override
	// public List<Conta> aplicarEm(List<Conta> contas) {
	//
	// List<Conta> suspeitas = new ArrayList<>();
	// for (Conta conta : contas) {
	//
	// if (contaEhSuspeita(conta)) {
	//
	// suspeitas.add(conta);
	// }
	// }
	// suspeitas.addAll(proximo(contas));
	// return suspeitas;
	// }

}
