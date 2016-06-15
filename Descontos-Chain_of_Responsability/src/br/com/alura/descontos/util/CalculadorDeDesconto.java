package br.com.alura.descontos.util;

import br.com.alura.descontos.descontos.AcimaDe5Itens;
import br.com.alura.descontos.descontos.Desconto;
import br.com.alura.descontos.descontos.DescontoPorVendaCasada;
import br.com.alura.descontos.descontos.SemDesconto;
import br.com.alura.descontos.descontos.ValorMaiorQ500;
import br.com.alura.descontos.model.Orcamento;

public class CalculadorDeDesconto {

	public double aplicarNo(Orcamento orcamento) {

		Desconto valorMaiorQ500 = new ValorMaiorQ500();
		Desconto descontoPorVendaCasada = new DescontoPorVendaCasada();
		Desconto acimaDe5Itens = new AcimaDe5Itens();
		Desconto semDesconto = new SemDesconto();

		valorMaiorQ500.setProximo(descontoPorVendaCasada);
		descontoPorVendaCasada.setProximo(acimaDe5Itens);

		acimaDe5Itens.setProximo(semDesconto);

		return valorMaiorQ500.aplicarNo(orcamento);
	}
}
