package br.com.alura.aplicandoPadroes.capI_pattern_flyweight.testes;

import static br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.Notas.Do;
import static br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.Notas.Do_Sustenido;
import static br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.Notas.Fa;
import static br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.Notas.Mi;
import static br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.Notas.Re;
import static br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.Notas.Re_Sustenido;
import static br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.Notas.Sol;

import java.util.Arrays;
import java.util.List;

import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.instrumentosMusicais.Piano;
import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.instrumentosMusicais.InstrumentoMusical;
import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.NotaMusical;
import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.RepositorioDeNotasMusicais;

public class TestaRepositorioDeNotas {

	public static void main(String[] args) {

		RepositorioDeNotasMusicais repositorioDeNotasMusicais = new RepositorioDeNotasMusicais();
		InstrumentoMusical instrumentoMusical = new Piano();

		List<NotaMusical> musica = Arrays.asList(repositorioDeNotasMusicais.pega(Do),
			repositorioDeNotasMusicais.pega(Re), repositorioDeNotasMusicais.pega(Mi),
			repositorioDeNotasMusicais.pega(Fa), repositorioDeNotasMusicais.pega(Fa),
			repositorioDeNotasMusicais.pega(Fa),

			repositorioDeNotasMusicais.pega(Do), repositorioDeNotasMusicais.pega(Re),
			repositorioDeNotasMusicais.pega(Do), repositorioDeNotasMusicais.pega(Re),
			repositorioDeNotasMusicais.pega(Re), repositorioDeNotasMusicais.pega(Re),

			repositorioDeNotasMusicais.pega(Do), repositorioDeNotasMusicais.pega(Sol),
			repositorioDeNotasMusicais.pega(Fa), repositorioDeNotasMusicais.pega(Mi),
			repositorioDeNotasMusicais.pega(Mi), repositorioDeNotasMusicais.pega(Mi),

			repositorioDeNotasMusicais.pega(Do), repositorioDeNotasMusicais.pega(Re),
			repositorioDeNotasMusicais.pega(Mi), repositorioDeNotasMusicais.pega(Do_Sustenido),
			repositorioDeNotasMusicais.pega(Do_Sustenido), repositorioDeNotasMusicais.pega(Re_Sustenido),
			repositorioDeNotasMusicais.pega(Fa), repositorioDeNotasMusicais.pega(Fa),
			repositorioDeNotasMusicais.pega(Fa));

		instrumentoMusical.tocar(musica);

	}
}
