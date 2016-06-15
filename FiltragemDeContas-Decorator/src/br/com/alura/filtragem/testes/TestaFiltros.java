package br.com.alura.filtragem.testes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.alura.filtragem.filtros.FiltradorDeContas;
import br.com.alura.filtragem.modelo.Conta;

public class TestaFiltros {

	public static void main(String[] args) {

		FiltradorDeContas filtradorDeContas = new FiltradorDeContas();
		Date dataDeHoje = new Date();

		List<Conta> contas = new ArrayList<>();
		contas.add(new Conta(60, dataDeHoje));

		filtradorDeContas.aplicarFiltros(contas);

		System.out.println(filtradorDeContas.retornarFiltradas());
	}
}
