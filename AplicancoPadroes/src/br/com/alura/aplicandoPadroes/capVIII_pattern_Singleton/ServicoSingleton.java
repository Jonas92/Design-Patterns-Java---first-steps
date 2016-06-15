package br.com.alura.aplicandoPadroes.capVIII_pattern_Singleton;

public class ServicoSingleton {

	private static Servico servico;

	public static Servico getInstance() {
		if (servico == null) {
			servico = new Servico();
		}

		return servico;
	}

}
