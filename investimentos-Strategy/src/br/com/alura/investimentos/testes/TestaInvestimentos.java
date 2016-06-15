package br.com.alura.investimentos.testes;

import br.com.alura.investimentos.contas.Conta;
import br.com.alura.investimentos.investidores.Conservador;
import br.com.alura.investimentos.investidores.Investidor;
import br.com.alura.investimentos.investidores.Moderado;
import br.com.alura.investimentos.util.RealizadorDeInvestimentos;

public class TestaInvestimentos {
	public static void main(String[] args) {

		RealizadorDeInvestimentos investir = new RealizadorDeInvestimentos();

		Investidor conservador = new Conservador();
		Moderado moderado = new Moderado();
		Conta conta = new Conta(100);

		// realizadorDeInvestimentos.investirComo(conservador , conta);

		investir.como(conservador).na(conta);
		System.out.println("Saldo atual: R$ " + conta.getSaldo());
		
		investir.como(moderado).na(conta);
		System.out.println("Saldo atual: R$ " + conta.getSaldo());
	}
}
