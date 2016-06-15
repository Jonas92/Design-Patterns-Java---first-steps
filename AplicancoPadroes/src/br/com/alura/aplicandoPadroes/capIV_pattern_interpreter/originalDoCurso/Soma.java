package br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.originalDoCurso;

public class Soma implements Expressao {

	private Expressao expressaoDaDireita;
	private Expressao expressaoDaEsquerda;

	public Soma(Expressao expressaoDaEsquerda, Expressao expressaoDaDireita) {
		this.expressaoDaDireita = expressaoDaDireita;
		this.expressaoDaEsquerda = expressaoDaEsquerda;
	}

	@Override
	public int avalia() {
		return expressaoDaEsquerda.avalia() + expressaoDaDireita.avalia();
	}
}
