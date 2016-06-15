package br.com.alura.relatorios.relatorios;

import java.util.Calendar;

import br.com.alura.relatorios.model.Banco;
import br.com.alura.relatorios.model.Conta;

public class RelatorioComplexo extends Relatorio {

	@Override
	protected void cabecalho(Banco banco) {
		System.out.println(banco.getNome() + "		" + banco.getTelefone());
		System.out.println(banco.getEndereco());
		System.out.println("");
	}

	@Override
	protected void corpo(Banco banco) {

		for (Conta conta : banco.getContas()) {
			System.out.println("Titular: " + conta.getTitular());
			System.out.println("Saldo: R$ " + conta.getSaldo());
			System.out.println("Agência: " + conta.getAgencia());
			System.out.println("Número: " + conta.getNumero());
			System.out.println("");
		}

	}

	@Override
	protected void rodape(Banco banco) {

		System.out.println(banco.getEmail());
		System.out.println(Calendar.getInstance().getTime());
	}

}
