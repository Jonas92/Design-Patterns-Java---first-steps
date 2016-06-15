package br.com.alura.relatorios.testes;

import br.com.alura.relatorios.model.Banco;
import br.com.alura.relatorios.model.Conta;
import br.com.alura.relatorios.relatorios.Relatorio;
import br.com.alura.relatorios.relatorios.RelatorioComplexo;
import br.com.alura.relatorios.relatorios.RelatorioSimples;

public class TestaRelatorios {

	public static void main(String[] args) {
		Banco banco = new Banco("Banco do Jonas", "Rua das laranjeiras, 2198", "3255 55-55", "bancodojonas@banco.com");
		banco.adicionar(new Conta(1000, "Jonas", 222, "9090-x"));
		banco.adicionar(new Conta(50, "Lumia", 9916, "888-l"));

		Relatorio relatorioSimples = new RelatorioSimples();
		Relatorio relatorioComplexo = new RelatorioComplexo();
		

		relatorioSimples.imprimir(banco);
		
		System.out.println("\n\n");
		relatorioComplexo.imprimir(banco);
		
	}
}
