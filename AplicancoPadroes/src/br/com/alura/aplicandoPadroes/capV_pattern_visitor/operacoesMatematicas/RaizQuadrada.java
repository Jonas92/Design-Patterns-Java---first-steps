package br.com.alura.aplicandoPadroes.capV_pattern_visitor.operacoesMatematicas;

import br.com.alura.aplicandoPadroes.capV_pattern_visitor.util.Expressao;
import br.com.alura.aplicandoPadroes.capV_pattern_visitor.util.impressores.Impressor;

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

	@Override
	public void aceita(Impressor visitor) {
		visitor.visita(this);
	}

}
