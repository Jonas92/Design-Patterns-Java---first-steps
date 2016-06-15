package br.com.alura.aplicandoPadroes.capVI_pattern_Bridge_E_Adapter.adapter;

public class TestaRelogio {

	public static void main(String[] args) {

		Relogio relogio = new RelogioDoSistema();

		System.out.println(relogio.dataHoraAtual().getTime());
	}
}
