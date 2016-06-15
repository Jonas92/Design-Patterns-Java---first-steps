package br.com.alura.aplicandoPadroes.capI_pattern_flyweight.util.notas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.notas.Do;
import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.notas.Fa;
import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.notas.La;
import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.notas.Mi;
import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.notas.Re;
import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.notas.Si;
import br.com.alura.aplicandoPadroes.capI_pattern_flyweight.notas.Sol;

public class NotasMusicaisComplexa {

	private static Map<Notas, NotaMusical> notas = new HashMap<>();
	private static List<Class<? extends NotaMusical>> classesDeNotasMusicais;

	static {
		classesDeNotasMusicais = Arrays.asList(Do.class, Re.class, Mi.class, Fa.class, Sol.class, La.class, Si.class);
	}

	public NotaMusical pega(Notas nota) {
		try {
			if (aindaNaoFoiCriadaA(nota)) {
				for (Class<? extends NotaMusical> clazz : classesDeNotasMusicais) {
					if (acheiA(nota, clazz)) {
						notas.put(nota, clazz.newInstance());
						break;
					}
				}
			}

			return notas.get(nota);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private boolean acheiA(Notas nota, Class<? extends NotaMusical> clazz) {
		return clazz.getSimpleName().toLowerCase().equals(nota.toString().toLowerCase());
	}

	private boolean aindaNaoFoiCriadaA(Notas nota) {
		return !notas.containsKey(nota);
	}
}
