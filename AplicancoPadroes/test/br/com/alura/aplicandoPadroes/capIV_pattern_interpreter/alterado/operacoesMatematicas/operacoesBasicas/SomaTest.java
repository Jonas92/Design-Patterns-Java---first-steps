package br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.operacoesMatematicas.operacoesBasicas;

import static junit.framework.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.Expressao;
import br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.Numero;
import br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.operacoesMatematicas.operacoesBasicas.Soma;
import br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.operacoesMatematicas.operacoesBasicas.Subtracao;

@SuppressWarnings("deprecation")
public class SomaTest {

	private Soma soma;
	private Expressao subtracao;
	private Expressao soma2;

	@Before
	public void inicializaTeste() {
		subtracao = new Subtracao(new Numero(10), new Numero(5));
		soma2 = new Soma(new Numero(10), new Numero(9));

	}

	@Test
	public void somaComSubtracaoENumero() {
		soma = new Soma(subtracao, new Numero(20));

		assertEquals(25, soma.avalia());
	}

	@Test
	public void somaComOutraSomaENumero() {
		soma = new Soma(soma2, new Numero(-10));

		assertEquals(9, soma.avalia());
	}

	@Test
	public void somaComApenasNumeros() {
		soma = new Soma(new Numero(10), new Numero(5));
		assertEquals(15, soma.avalia());
	}

	@Test
	public void somaComDuasSubtracoes() {
		soma = new Soma(subtracao, subtracao);

		assertEquals(10, soma.avalia());
	}

	@Test
	public void somaComSomaESubtracao() {

		soma = new Soma(soma2, subtracao);

		assertEquals(24, soma.avalia());
	}

	@Test
	public void somaComSomaSubtracaoENumero() {
		soma = new Soma(new Numero(30), new Subtracao(new Numero(10), soma2));

		assertEquals(21, soma.avalia());
	}
}
