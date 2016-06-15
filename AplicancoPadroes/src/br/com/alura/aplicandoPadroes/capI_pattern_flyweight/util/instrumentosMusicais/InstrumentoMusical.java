package br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.instrumentosMusicais;

import java.util.Collection;

import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.NotaMusical;

public interface InstrumentoMusical {

	void tocar(Collection<NotaMusical> musica);
}
