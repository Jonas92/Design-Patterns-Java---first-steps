package br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.operacoesMatematicas.operacoesBasicas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.Numero;
import br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.operacoesMatematicas.operacoesBasicas.Soma;
import br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.operacoesMatematicas.operacoesBasicas.Subtracao;

public class SubtracaoTest {

	private Subtracao subtracao;

	@Test
	public void subtracaoComApenasNumeros() {

		subtracao = new Subtracao(new Numero(3), new Numero(10));

		assertEquals(-7, subtracao.avalia());
	}

	@Test
	public void subtracaoComOutraSubtracaoENumero() {

		subtracao = new Subtracao(new Subtracao(new Numero(8), new Numero(3)), new Numero(10));

		assertEquals(-5, subtracao.avalia());
	}

	@Test
	public void subtracaoComSomaENumero() {

		subtracao = new Subtracao(new Soma(new Numero(7), new Numero(3)), new Numero(10));

		assertEquals(0, subtracao.avalia());
	}

	@Test
	public void subtracaoComDuasSomas() {

		subtracao = new Subtracao(new Soma(new Numero(17), new Numero(3)), new Soma(new Numero(10), new Numero(5)));

		assertEquals(5, subtracao.avalia());
	}

	@Test
	public void subtracaoComSomaESubtracao() {

		subtracao = new Subtracao(new Subtracao(new Numero(15), new Numero(5)), new Soma(new Numero(3), new Numero(5)));

		assertEquals(2, subtracao.avalia());
	}

	@Test
	public void subtracaoComSomaSubtracaoENumero() {
		subtracao = new Subtracao(new Numero(50),
			new Soma(new Soma(new Numero(10), new Numero(20)), new Subtracao(new Numero(10), new Numero(2))));

		assertEquals(12, subtracao.avalia());

	}

	@Test
	public void subtracaoComSubtracao() {
		subtracao = new Subtracao(new Subtracao(new Numero(50), new Numero(10)),
			new Subtracao(new Numero(10), new Numero(5)));

		assertEquals(35, subtracao.avalia());
	}
}
