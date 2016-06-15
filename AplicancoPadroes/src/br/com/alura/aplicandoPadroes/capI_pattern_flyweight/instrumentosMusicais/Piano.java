package br.com.alura.aplicandoPadroes.capI_pattern_flyweight.instrumentosMusicais;

import java.util.Collection;

import org.jfugue.Player;

import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.instrumentosMusicais.InstrumentoMusical;
import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.NotaMusical;

public class Piano implements InstrumentoMusical {

	@Override
	public void tocar(Collection<NotaMusical> musica) {

		StringBuilder musicaEmNotas = new StringBuilder();

		for (NotaMusical notaMusical : musica) {
			musicaEmNotas.append(notaMusical.simbolo() + " ");
		}

		Player player = new Player();
		player.play(musicaEmNotas.toString());

	}

}
