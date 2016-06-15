package br.com.alura.aplicandoPadroes.capIV_pattern_interpreter;

public class Soma implements Expressao {

	private Expressao expressaoDaDireita;
	private Expressao expressaoDaEsquerda;

	public Soma(Expressao expressaoDaDireita, Expressao expressaoDaEsquerda) {
		this.expressaoDaDireita = expressaoDaDireita;
		this.expressaoDaEsquerda = expressaoDaEsquerda;
	}

	@Override
	public int avalia() {
		return expressaoDaEsquerda.avalia() + expressaoDaDireita.avalia();
	}
}
