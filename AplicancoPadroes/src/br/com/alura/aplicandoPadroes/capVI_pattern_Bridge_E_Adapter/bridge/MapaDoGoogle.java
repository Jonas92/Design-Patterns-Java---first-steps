package br.com.alura.aplicandoPadroes.capVI_pattern_Bridge_E_Adapter.bridge;

import java.net.URL;

public class MapaDoGoogle implements GerenciadorDeMapa {

	private final URL url;

	public MapaDoGoogle(URL url) {
		this.url = url;
	}

	@Override
	public void devolverMapa() {}

	public URL getUrl() {
		return url;
	}

}
