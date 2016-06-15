package br.com.alura.aplicandoPadroes.capIII_pattern_memento;

import java.util.HashMap;
import java.util.Map;

public class Historico {

	private Map<TipoContrato, Estado> historicoDeEstados = new HashMap<>();

	public void adiciona(Estado estado) {
		if (aindaNaoPossuiEste(estado))
			historicoDeEstados.put(estado.getTipo(), estado);
	}

	private boolean aindaNaoPossuiEste(Estado estado) {
		return !historicoDeEstados.containsKey(estado.getTipo());
	}

	public Estado pega(TipoContrato tipoContrato) {
		if (historicoDeEstados.containsKey(tipoContrato))
			return historicoDeEstados.get(tipoContrato);

		throw new IllegalArgumentException("não possui este estado no histórico!");
	}

}
