package br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado;

public class Numero implements Expressao {

	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public int avalia() {
		return numero;
	}

}
