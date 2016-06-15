package br.com.alura.nf.testes;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.nf.builder.ItemBuilder;
import br.com.alura.nf.builder.NotaFiscalBuider;
import br.com.alura.nf.dao.NotaFiscalDao;
import br.com.alura.nf.modelo.Item;
import br.com.alura.nf.modelo.NotaFiscal;
import br.com.alura.nf.util.notaFiscal.AcaoDaNota;
import br.com.alura.nf.util.notaFiscal.EnviadorDeEmail;
import br.com.alura.nf.util.notaFiscal.Multiplicador;

public class TestaNF {

	public static void main(String[] args) {

		ItemBuilder itemBuilder = new ItemBuilder();

		Item item1 = itemBuilder.comNome("Caneta").comPreco(300).criarItem();
		System.out.println(item1);

		Item item2 = itemBuilder.comNome("Bicicleta").comPreco(400.0).criarItem();
		System.out.println(item2);

		// VALOR PARA TESTAR O MÉTODO naData(data);
		// Calendar data = new GregorianCalendar(2013, 0, 31);

		EnviadorDeEmail envioDeEmail = new EnviadorDeEmail();
		NotaFiscalDao persistencia = new NotaFiscalDao();
		Multiplicador multiplicacaoDoValorBruto = new Multiplicador(2.5);
		List<AcaoDaNota> acaoDaNotas = new ArrayList<>();
		acaoDaNotas.add(persistencia);
		acaoDaNotas.add(envioDeEmail);
		acaoDaNotas.add(multiplicacaoDoValorBruto);

		NotaFiscalBuider buider = new NotaFiscalBuider(acaoDaNotas);

		// NotaFiscal notaFiscal = buider.paraEmpresa("Nome da
		// empresa").deCNPJ("090909090-000").com(item1)
		// .com(item2).eRealizar(envioDeEmail).eRealizar(persistencia).eRealizar(multiplicacaoDoValorBruto).criarNf();

		NotaFiscal notaFiscal = buider.paraEmpresa("Nome da empresa").deCNPJ("090909090-000").com(item1).com(item2)
				.criarNf();

		System.out.println(notaFiscal);
	}
}
