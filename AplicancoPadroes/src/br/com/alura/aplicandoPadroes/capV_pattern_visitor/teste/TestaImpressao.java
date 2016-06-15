package br.com.alura.aplicandoPadroes.capV_pattern_visitor.teste;

import br.com.alura.aplicandoPadroes.capV_pattern_visitor.operacoesMatematicas.operacoesBasicas.Divisao;
import br.com.alura.aplicandoPadroes.capV_pattern_visitor.operacoesMatematicas.operacoesBasicas.Multiplicacao;
import br.com.alura.aplicandoPadroes.capV_pattern_visitor.operacoesMatematicas.operacoesBasicas.Soma;
import br.com.alura.aplicandoPadroes.capV_pattern_visitor.operacoesMatematicas.operacoesBasicas.Subtracao;
import br.com.alura.aplicandoPadroes.capV_pattern_visitor.util.Numero;
import br.com.alura.aplicandoPadroes.capV_pattern_visitor.util.impressores.Convencional;
import br.com.alura.aplicandoPadroes.capV_pattern_visitor.util.impressores.Impressor;
import br.com.alura.aplicandoPadroes.capV_pattern_visitor.util.impressores.PreFixado;

public class TestaImpressao {

	public static void main(String[] args) {
		Numero numero = new Numero(9);
		Impressor visitor = new Convencional();
		Impressor visitor2 = new PreFixado();
		Subtracao subtracao = new Subtracao(numero, numero);
		Multiplicacao multiplicacao = new Multiplicacao(numero, numero);
		Divisao divisao = new Divisao(subtracao, multiplicacao);
		Soma soma = new Soma(subtracao, divisao);

		visitor.visita(soma);
		System.out.println();
		visitor2.visita(soma);

	}
}
