package br.com.alura.filtragem.filtros;

import static br.com.alura.filtragem.filtros.ValoreDeSaldoSuspeito.SaldoMuitoBaixo;

import br.com.alura.filtragem.modelo.Conta;

public class SaldoMuitoBaixo extends Filtro {

	public SaldoMuitoBaixo(Filtro filtro) {
		super(filtro);
	}

	public SaldoMuitoBaixo() {
		super();
	}

	protected boolean contaEhSuspeita(Conta conta) {
		return conta.getSaldo() < SaldoMuitoBaixo.getValor();
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
