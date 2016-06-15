package br.com.alura.aplicandoPadroes.capVI_pattern_Bridge_E_Adapter.adapter;

import java.util.Calendar;

public class RelogioDoSistema implements Relogio {

	@Override
	public Calendar dataHoraAtual() {
		return Calendar.getInstance();
	}
}
