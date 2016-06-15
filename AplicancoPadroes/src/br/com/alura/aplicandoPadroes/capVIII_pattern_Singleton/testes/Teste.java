package br.com.alura.aplicandoPadroes.capVIII_pattern_Singleton.testes;

import br.com.alura.aplicandoPadroes.capVIII_pattern_Singleton.Servico;
import br.com.alura.aplicandoPadroes.capVIII_pattern_Singleton.ServicoSingleton;

public class Teste {

	public static void main(String[] args) {
		Servico servico = ServicoSingleton.getInstance();

		servico.testar();
	}
}
