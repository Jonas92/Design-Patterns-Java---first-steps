package br.com.alura.formato.model;

import br.com.alura.formato.formatos.Formato;

public class Requisicao {

	private Formato formato;

	public Requisicao(Formato formato) {
		this.formato = formato;
	}

	public Formato getFormato() {
		return formato;
	}
}
