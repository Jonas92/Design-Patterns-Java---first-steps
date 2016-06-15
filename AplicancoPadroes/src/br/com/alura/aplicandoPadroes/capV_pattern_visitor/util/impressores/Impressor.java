package br.com.alura.aplicandoPadroes.capV_pattern_visitor.util.impressores;

import br.com.alura.aplicandoPadroes.capV_pattern_visitor.operacoesMatematicas.RaizQuadrada;
import br.com.alura.aplicandoPadroes.capV_pattern_visitor.operacoesMatematicas.operacoesBasicas.OperacaoMatematicaBasica;
import br.com.alura.aplicandoPadroes.capV_pattern_visitor.util.Numero;

public interface Impressor {

	void visita(OperacaoMatematicaBasica operacaoMatematicaBasica);

	void visita(RaizQuadrada raizQuadrada);

	void visita(Numero numero);

}
