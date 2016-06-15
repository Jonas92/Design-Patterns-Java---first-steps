package br.com.alura.aplicandoPadroes.capI_pattern_flyweight.testes;

import static br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.Notas.Do;
import static br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.Notas.Fa;

import java.util.Arrays;
import java.util.Collection;

import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.instrumentosMusicais.Piano;
import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.instrumentosMusicais.InstrumentoMusical;
import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.NotaMusical;
import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.NotasMusicaisComplexa;

public class TestaNotasMusicaisComplexa {

	public static void main(String[] args) {

		InstrumentoMusical instrumentoMusical = new Piano();
		NotasMusicaisComplexa repositorioComplexoDeNotas = new NotasMusicaisComplexa();

		Collection<NotaMusical> musica = Arrays.asList(repositorioComplexoDeNotas.pega(Do),
			repositorioComplexoDeNotas.pega(Fa), repositorioComplexoDeNotas.pega(Fa),
			repositorioComplexoDeNotas.pega(Fa));

		instrumentoMusical.tocar(musica);

	}
}
