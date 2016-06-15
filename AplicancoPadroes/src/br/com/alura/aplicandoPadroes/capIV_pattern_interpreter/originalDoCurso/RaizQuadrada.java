package br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.originalDoCurso;

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
