package br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.operacoesMatematicas.operacoesBasicas;

import br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.Expressao;

public abstract class OperacaoMatematicaBasica implements Expressao {
	protected Expressao expressaoDaEsquerda;
	protected Expressao expressaoDaDireita;

	public OperacaoMatematicaBasica(Expressao expressaoDaEsquerda, Expressao expressaoDaDireita) {
		this.expressaoDaEsquerda = expressaoDaEsquerda;
		this.expressaoDaDireita = expressaoDaDireita;
	}

	@Override
	public final int avalia() {
		return calculoDaOperacao();
	}

	protected abstract int calculoDaOperacao();
}
