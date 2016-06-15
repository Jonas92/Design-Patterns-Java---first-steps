package br.com.alura.relatorios.relatorios;

import br.com.alura.relatorios.model.Banco;
import br.com.alura.relatorios.model.Conta;

public class RelatorioSimples extends Relatorio {

	@Override
	protected void cabecalho(Banco banco) {
		exibirInfosDo(banco);
		System.out.println("");
	}

	private void exibirInfosDo(Banco banco) {
		System.out.println(banco.getNome() + "		" + banco.getTelefone());
	}

	@Override
	protected void corpo(Banco banco) {

		for (Conta conta : banco.getContas()) {
			System.out.println("Titular: " + conta.getTitular());
			System.out.println("Saldo: R$ " + conta.getSaldo());
			System.out.println("");
		}

	}

	@Override
	protected void rodape(Banco banco) {
		exibirInfosDo(banco);
	}

}
