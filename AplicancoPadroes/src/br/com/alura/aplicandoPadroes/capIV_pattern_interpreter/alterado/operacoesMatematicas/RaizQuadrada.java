package br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.operacoesMatematicas;

import br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.Expressao;

public class RaizQuadrada implements Expressao {

	private Expressao expressao;

	public RaizQuadrada(Expressao expressao) {
		this.expressao = expressao;
	}

	@Override
	public int avalia() {
		double resultadoDaExpressaoAnterior = expressao.avalia();
		return (int) Math.sqrt(resultadoDaExpressaoAnterior);
	}

}
