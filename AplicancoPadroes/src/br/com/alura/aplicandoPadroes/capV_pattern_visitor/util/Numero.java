package br.com.alura.aplicandoPadroes.capV_pattern_visitor.util;

import br.com.alura.aplicandoPadroes.capV_pattern_visitor.util.impressores.Impressor;

public class Numero implements Expressao {

	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public int avalia() {
		return numero;
	}

	@Override
	public void aceita(Impressor visitor) {
		visitor.visita(this);
	}

	public int getNumero() {
		return numero;
	}

}
