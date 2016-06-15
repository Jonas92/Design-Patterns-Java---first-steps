package br.com.alura.nf.testes;

import br.com.alura.nf.builder.ItemBuilder;
import br.com.alura.nf.builder.NotaFiscalBuider;
import br.com.alura.nf.modelo.Item;
import br.com.alura.nf.modelo.NotaFiscal;

public class TestaNF {

	public static void main(String[] args) {

		ItemBuilder itemBuilder = new ItemBuilder();

		Item item1 = itemBuilder.comNome("Caneta").comPreco(300).criarItem();
		System.out.println(item1);

		Item item2 = itemBuilder.comNome("Bicicleta").comPreco(400.0).criarItem();
		System.out.println(item2);

		// VALOR PARA TESTAR O MÉTODO naData(data);
		// Calendar data = new GregorianCalendar(2013, 0, 31);

		NotaFiscal notaFiscal = new NotaFiscalBuider().comRazaoSocial("Nome da empresa").comCNPJ("090909090-000")
				.com(item1).com(item2).criarNf();

		System.out.println(notaFiscal);
	}
}
