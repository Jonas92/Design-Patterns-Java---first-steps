package br.com.alura.aplicandoPadroes.capV_pattern_visitor.operacoesMatematicas.operacoesBasicas;

import br.com.alura.aplicandoPadroes.capV_pattern_visitor.util.Expressao;

public class Soma extends OperacaoMatematicaBasica {

	public Soma(Expressao expressaoDaEsquerda, Expressao expressaoDaDireita) {
		super(expressaoDaEsquerda, expressaoDaDireita);
	}

	@Override
	protected int calculoDaOperacao() {
		return expressaoDaEsquerda.avalia() + expressaoDaDireita.avalia();
	}

	@Override
	public String getSimbolo() {
		return "+";
	}

}
