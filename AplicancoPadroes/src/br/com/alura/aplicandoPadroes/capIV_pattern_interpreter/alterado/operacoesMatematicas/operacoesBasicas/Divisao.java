package br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.operacoesMatematicas.operacoesBasicas;

import br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.Expressao;

public class Divisao extends OperacaoMatematicaBasica {

	public Divisao(Expressao expressaoDaEsquerda, Expressao expressaoDaDireita) {
		super(expressaoDaEsquerda, expressaoDaDireita);
	}

	@Override
	protected int calculoDaOperacao() {
		return expressaoDaEsquerda.avalia() / expressaoDaDireita.avalia();
	}

}
