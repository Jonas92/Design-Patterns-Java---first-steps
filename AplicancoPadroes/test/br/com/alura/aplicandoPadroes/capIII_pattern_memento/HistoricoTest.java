package br.com.alura.aplicandoPadroes.capIII_pattern_memento;

import static junit.framework.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class HistoricoTest {
	private Historico historico;
	private Contrato contrato;

	@Before
	public void inicializaTeste() {
		historico = new Historico();
		contrato = new Contrato(Calendar.getInstance(), "Mauricio", TipoContrato.NOVO);
	}

	@Test
	public void pegaEstadosQueTemNoHistorico() {

		historico.adiciona(contrato.aSerSalvo());// novo - 0

		contrato.avanca();
		historico.adiciona(contrato.aSerSalvo());// em andamento - 1

		contrato.avanca();
		historico.adiciona(contrato.aSerSalvo());// acertado - 2

		contrato.avanca();
		historico.adiciona(contrato.aSerSalvo());// concluido - 3

		contrato.restaura(historico.pega(TipoContrato.ACERTADO));
		assertEquals(TipoContrato.ACERTADO, contrato.getTipo());

		contrato.restaura(historico.pega(TipoContrato.NOVO));
		assertEquals(TipoContrato.NOVO, contrato.getTipo());

		contrato.restaura(historico.pega(TipoContrato.CONCLUIDO));
		assertEquals(TipoContrato.CONCLUIDO, contrato.getTipo());
	}

	@Test(expected = IllegalArgumentException.class)
	public void naoAceitaPegarEstadoQueNaoEstaNoHistorico() {

		historico.adiciona(contrato.aSerSalvo());// novo - 0

		contrato.avanca();
		historico.adiciona(contrato.aSerSalvo());// em andamento - 1

		contrato.restaura(historico.pega(TipoContrato.ACERTADO));

	}

}
