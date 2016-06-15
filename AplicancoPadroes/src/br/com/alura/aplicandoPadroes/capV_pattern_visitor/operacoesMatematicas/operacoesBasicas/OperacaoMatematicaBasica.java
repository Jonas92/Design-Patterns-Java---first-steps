package br.com.alura.aplicandoPadroes.capV_pattern_visitor.operacoesMatematicas.operacoesBasicas;

import br.com.alura.aplicandoPadroes.capV_pattern_visitor.util.Expressao;
import br.com.alura.aplicandoPadroes.capV_pattern_visitor.util.impressores.Impressor;

public abstract class OperacaoMatematicaBasica implements Expressao {
	protected final Expressao expressaoDaEsquerda;
	protected final Expressao expressaoDaDireita;

	public OperacaoMatematicaBasica(Expressao expressaoDaEsquerda, Expressao expressaoDaDireita) {
		this.expressaoDaEsquerda = expressaoDaEsquerda;
		this.expressaoDaDireita = expressaoDaDireita;
	}

	protected abstract int calculoDaOperacao();

	public abstract String getSimbolo();

	@Override
	public final int avalia() {
		return calculoDaOperacao();
	}

	@Override
	public final void aceita(Impressor visitor) {
		visitor.visita(this);
	}

	public final Expressao getExpressaoDaEsquerda() {
		return expressaoDaEsquerda;
	}

	public final Expressao getExpressaoDaDireita() {
		return expressaoDaDireita;
	}

}
