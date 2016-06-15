package br.com.alura.descontos.testes;

import br.com.alura.descontos.model.Orcamento;

public class TestaDescontosEspeciais {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(100);
		System.out.println("Desconto aplicado: R$ " + orcamento.aplicarDescontoEspecial());
		System.out.println("Desconto aplicado: R$ " + orcamento.aplicarDescontoEspecial());
		orcamento.aprovar();
		System.out.println("Desconto aplicado: R$ " + orcamento.aplicarDescontoEspecial());
		System.out.println("Desconto aplicado: R$ " + orcamento.aplicarDescontoEspecial());
		orcamento.finalizar();
		orcamento.aprovar();
		orcamento.finalizar();
		orcamento.finalizar();
		orcamento.reprovar();
		orcamento.aprovar();
		System.out.println("Desconto aplicado: R$ " + orcamento.aplicarDescontoEspecial());

	}
}
