package br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.originalDoCurso;

public class Subtracao implements Expressao {

	private Expressao expressaoDaDireita;
	private Expressao expressaoDaEsquerda;

	public Subtracao(Expressao expressaoDaEsquerda, Expressao expressaoDaDireita) {
		this.expressaoDaEsquerda = expressaoDaEsquerda;
		this.expressaoDaDireita = expressaoDaDireita;
	}

	@Override
	public int avalia() {
		return expressaoDaEsquerda.avalia() - expressaoDaDireita.avalia();
	}
}
