package br.com.alura.aplicandoPadroes.capV_pattern_visitor.util;

import br.com.alura.aplicandoPadroes.capV_pattern_visitor.util.impressores.Impressor;

public interface Expressao {

	int avalia();

	void aceita(Impressor visitor);

}
