package br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas;

import static br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.Notas.Do;
import static br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.Notas.Do_Sustenido;
import static br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.Notas.Fa;
import static br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.Notas.La;
import static br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.Notas.Mi;
import static br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.Notas.Re;
import static br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.Notas.Re_Sustenido;
import static br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.Notas.Si;
import static br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas.Notas.Sol;

import java.util.HashMap;
import java.util.Map;

import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.notas.Do;
import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.notas.DoSustenido;
import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.notas.Fa;
import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.notas.La;
import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.notas.Mi;
import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.notas.Re;
import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.notas.ReSustenido;
import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.notas.Si;
import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.notas.Sol;

public class RepositorioDeNotasMusicais {

	private static Map<Notas, NotaMusical> notas = new HashMap<>();

	static {
		notas.put(Do, new Do());
		notas.put(Re, new Re());
		notas.put(Mi, new Mi());
		notas.put(Fa, new Fa());
		notas.put(Sol, new Sol());
		notas.put(La, new La());
		notas.put(Si, new Si());
		notas.put(Do_Sustenido, new DoSustenido());
		notas.put(Re_Sustenido, new ReSustenido());
	}

	public NotaMusical pega(Notas nota) {

		return notas.get(nota);
	}
}
