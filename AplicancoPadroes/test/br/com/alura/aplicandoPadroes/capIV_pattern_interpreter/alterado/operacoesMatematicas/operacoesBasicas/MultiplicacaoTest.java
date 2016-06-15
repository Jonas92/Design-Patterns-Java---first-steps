package br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.operacoesMatematicas.operacoesBasicas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.Expressao;
import br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.Numero;
import br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.operacoesMatematicas.operacoesBasicas.Multiplicacao;
import br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.operacoesMatematicas.operacoesBasicas.Soma;
import br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.operacoesMatematicas.operacoesBasicas.Subtracao;

public class MultiplicacaoTest {

	private Multiplicacao multiplicacao;

	@Test
	public void multiplicaNumeroComNumero() {
		multiplicacao = new Multiplicacao(new Numero(10), new Numero(2));

		assertEquals(20, multiplicacao.avalia());
	}

	@Test
	public void multiplicaSomaComSubtracao() {
		Soma soma = new Soma(new Numero(10), new Numero(30));
		Expressao subtracao = new Subtracao(new Numero(10), new Numero(2));

		multiplicacao = new Multiplicacao(soma, subtracao);

		assertEquals(320, multiplicacao.avalia());
	}

	@Test
	public void multiplicaComDuasSomas() {

		Soma soma = new Soma(new Numero(10), new Numero(30));
		Expressao outraSoma = new Soma(new Numero(10), new Numero(2));

		multiplicacao = new Multiplicacao(soma, outraSoma);

		assertEquals(480, multiplicacao.avalia());
	}

	@Test
	public void multiplicaComDuasSubtracoes() {

		Subtracao subtracao = new Subtracao(new Numero(10), new Numero(30));
		Expressao outraSubtracao = new Subtracao(new Numero(10), new Numero(2));

		multiplicacao = new Multiplicacao(subtracao, outraSubtracao);

		assertEquals(-160, multiplicacao.avalia());
	}

	@Test
	public void multiplicaComDuasMultiplicacoes() {

		Expressao multiplicacao1 = new Multiplicacao(new Numero(10), new Numero(30));
		Expressao outraMultiplicacao = new Multiplicacao(new Numero(10), new Numero(2));

		multiplicacao = new Multiplicacao(multiplicacao1, outraMultiplicacao);

		assertEquals(6000, multiplicacao.avalia());
	}

}
