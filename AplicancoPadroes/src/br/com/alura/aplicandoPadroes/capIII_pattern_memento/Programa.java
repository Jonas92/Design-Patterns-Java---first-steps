package br.com.alura.aplicandoPadroes.capIII_pattern_memento;

import java.util.Calendar;

public class Programa {

	public static void main(String[] args) {

		new Historico();

		Contrato contrato = new Contrato(Calendar.getInstance(), "Mauricio", TipoContrato.NOVO);

		contrato.avanca();

		contrato.avanca();

		contrato.avanca();
	}
}
