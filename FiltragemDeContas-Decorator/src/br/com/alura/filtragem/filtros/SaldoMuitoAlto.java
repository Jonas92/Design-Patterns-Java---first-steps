package br.com.alura.filtragem.filtros;

import static br.com.alura.filtragem.filtros.ValoreDeSaldoSuspeito.SaldoMuitoAlto;

import br.com.alura.filtragem.modelo.Conta;

public class SaldoMuitoAlto extends Filtro {

	public SaldoMuitoAlto(Filtro filtro) {
		super(filtro);
	}

	public SaldoMuitoAlto() {
		super();
	}

	@Override
	protected boolean contaEhSuspeita(Conta conta) {
		return conta.getSaldo() > SaldoMuitoAlto.getValor();
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
