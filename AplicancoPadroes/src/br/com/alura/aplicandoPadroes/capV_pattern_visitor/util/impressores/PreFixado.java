package br.com.alura.aplicandoPadroes.capV_pattern_visitor.util.impressores;

import br.com.alura.aplicandoPadroes.capV_pattern_visitor.operacoesMatematicas.RaizQuadrada;
import br.com.alura.aplicandoPadroes.capV_pattern_visitor.operacoesMatematicas.operacoesBasicas.OperacaoMatematicaBasica;
import br.com.alura.aplicandoPadroes.capV_pattern_visitor.util.Numero;

public class PreFixado implements Impressor {

	@Override
	public void visita(OperacaoMatematicaBasica operacaoMatematicaBasica) {
		System.out.print(operacaoMatematicaBasica.getSimbolo());

		System.out.print("(");

		operacaoMatematicaBasica.getExpressaoDaEsquerda().aceita(this);
		operacaoMatematicaBasica.getExpressaoDaEsquerda().aceita(this);

		System.out.print(")");
	}

	@Override
	public void visita(RaizQuadrada raizQuadrada) {}

	@Override
	public void visita(Numero numero) {
		System.out.print(" " + numero.getNumero());
	}

}
