package br.com.alura.aplicandoPadroes.capVI_pattern_Bridge_E_Adapter.bridge;

import java.net.MalformedURLException;
import java.net.URL;

public class TestaInterfaceDeMapas {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("Fornecedor do mapa");

		GerenciadorDeMapa gerenciadorDeMapa = new MapaQualquer(url);
		GerenciadorDeMapa gerenciadorDeMapa2 = new MapaDoGoogle(url);

		gerenciadorDeMapa.devolverMapa();
		gerenciadorDeMapa2.devolverMapa();
	}
}
