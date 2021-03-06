package br.com.alura.relatorios.relatorios;

import br.com.alura.relatorios.model.Banco;

public abstract class Relatorio {
	
	public void imprimir(Banco banco) {
		cabecalho(banco);
		corpo(banco);
		rodape(banco);
	}

	protected abstract void cabecalho(Banco banco);

	protected abstract void corpo(Banco banco);

	protected abstract void rodape(Banco banco);
}
