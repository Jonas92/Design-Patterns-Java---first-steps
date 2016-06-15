package br.com.alura.aplicandoPadroes.capIII_pattern_memento;

import static junit.framework.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class ContratoTest {

	private Calendar data;
	private String nomeCliente;
	private Contrato contrato;

	@Before
	public void inicializaTeste() {
		data = Calendar.getInstance();
		nomeCliente = "Cliente de Nome";
	}

	@Test
	public void validaEstadosIniciaisDoContrato() {
		contrato = new Contrato(data, nomeCliente, TipoContrato.EM_ANDAMENTO);
		assertEquals(TipoContrato.EM_ANDAMENTO, contrato.getTipo());

		contrato = new Contrato(data, nomeCliente, TipoContrato.ACERTADO);
		assertEquals(TipoContrato.ACERTADO, contrato.getTipo());

		contrato = new Contrato(data, nomeCliente, TipoContrato.CONCLUIDO);
		assertEquals(TipoContrato.CONCLUIDO, contrato.getTipo());

		contrato = new Contrato(data, nomeCliente, TipoContrato.NOVO);
		assertEquals(TipoContrato.NOVO, contrato.getTipo());
	}

	@Test
	public void avancaDeNovoPraEmAndamento() {
		contrato = new Contrato(data, nomeCliente, TipoContrato.NOVO);
		contrato.avanca();

		assertEquals(TipoContrato.EM_ANDAMENTO, contrato.getTipo());
	}

	@Test
	public void avancaDeEmAndamentoPraAcertado() {
		contrato = new Contrato(data, nomeCliente, TipoContrato.EM_ANDAMENTO);
		contrato.avanca();

		assertEquals(TipoContrato.ACERTADO, contrato.getTipo());
	}

	@Test
	public void avancaDeAcertadoPraConcluido() {
		contrato = new Contrato(data, nomeCliente, TipoContrato.ACERTADO);
		contrato.avanca();

		assertEquals(TipoContrato.CONCLUIDO, contrato.getTipo());
	}

	@Test
	public void naoAvancaAposEstarConcluido() {
		contrato = new Contrato(data, nomeCliente, TipoContrato.CONCLUIDO);
		contrato.avanca();

		assertEquals(TipoContrato.CONCLUIDO, contrato.getTipo());
	}
}
