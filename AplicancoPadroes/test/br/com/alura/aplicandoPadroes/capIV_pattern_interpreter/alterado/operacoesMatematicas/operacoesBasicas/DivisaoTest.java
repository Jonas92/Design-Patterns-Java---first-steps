package br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.operacoesMatematicas.operacoesBasicas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.Expressao;
import br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.Numero;
import br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.operacoesMatematicas.operacoesBasicas.Divisao;
import br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.operacoesMatematicas.operacoesBasicas.Soma;
import br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.operacoesMatematicas.operacoesBasicas.Subtracao;

public class DivisaoTest {

	private Divisao divisao;

	@Test
	public void divideNumeroPorNumero() {
		divisao = new Divisao(new Numero(10), new Numero(5));

		assertEquals(2, divisao.avalia());
	}

	@Test
	public void divideNumeroPorNumeroNegativo() {
		divisao = new Divisao(new Numero(10), new Numero(-5));

		assertEquals(-2, divisao.avalia());
	}

	@Test
	public void divideSomaPorNumero() {
		Expressao soma = new Soma(new Numero(10), new Numero(5));

		divisao = new Divisao(soma, new Numero(4));

		assertEquals(3, divisao.avalia());
	}

	@Test
	public void divideSomaPorSubtracao() {
		Expressao soma = new Soma(new Numero(19), new Numero(5));
		Expressao subtracao = new Subtracao(new Numero(20), new Numero(8));

		divisao = new Divisao(soma, subtracao);

		assertEquals(2, divisao.avalia());
	}

	@Test
	public void divideMenorPorMaior() {
		Expressao menor = new Numero(5);
		Expressao maior = new Numero(20);

		divisao = new Divisao(menor, maior);

		assertEquals(0, divisao.avalia());
	}

}
