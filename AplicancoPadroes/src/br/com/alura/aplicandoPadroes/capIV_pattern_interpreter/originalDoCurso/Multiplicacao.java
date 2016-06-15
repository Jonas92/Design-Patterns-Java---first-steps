package br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.originalDoCurso;

public class Multiplicacao implements Expressao {

	private Expressao expressaoDaDireita;
	private Expressao expressaoDaEsquerda;

	public Multiplicacao(Expressao expressaoDaEsquerda, Expressao expressaoDaDireita) {
		this.expressaoDaEsquerda = expressaoDaEsquerda;
		this.expressaoDaDireita = expressaoDaDireita;
	}

	@Override
	public int avalia() {
		return expressaoDaEsquerda.avalia() * expressaoDaDireita.avalia();
	}

}
