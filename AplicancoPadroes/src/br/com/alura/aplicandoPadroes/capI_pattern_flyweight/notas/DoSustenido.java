package br.com.alura.aplicandoPadroes.capI_pattern_flyweight.notas;

import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.NotaMusical;

public class DoSustenido implements NotaMusical {

	@Override
	public String simbolo() {
		return "C#";
	}

}
