package br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.operacoesMatematicas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.alura.aplicandoPadroes.capIV_pattern_interpreter.alterado.Numero;

public class RaizQuadradaTest {

	private RaizQuadrada raizQuadrada;

	@Test
	public void raizDeUm() {

		raizQuadrada = new RaizQuadrada(new Numero(1));

		assertEquals(1, raizQuadrada.avalia());

	}

	@Test
	public void raizDeZero() {

		raizQuadrada = new RaizQuadrada(new Numero(0));

		assertEquals(0, raizQuadrada.avalia());

	}

	@Test
	public void achaRaizDeQuadradoPerfeiro() {

		raizQuadrada = new RaizQuadrada(new Numero(9));
		assertEquals(3, raizQuadrada.avalia());

		raizQuadrada = new RaizQuadrada(new Numero(169));
		assertEquals(13, raizQuadrada.avalia());

		raizQuadrada = new RaizQuadrada(new Numero(144));
		assertEquals(12, raizQuadrada.avalia());

	}

	@Test
	public void naoAceitaNumeroNegativo() {

		raizQuadrada = new RaizQuadrada(new Numero(-9));
		assertEquals(0, raizQuadrada.avalia());
	}

	@Test
	public void calculaDeNumeroPrimoPorProximidade() {

		raizQuadrada = new RaizQuadrada(new Numero(5));
		assertEquals(2, raizQuadrada.avalia());
	}

}
