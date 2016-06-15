package br.com.alura.nf.modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private double imposto;
	private Calendar data;
	private String observacoes;
	private List<Item> items = new ArrayList<>();

	public NotaFiscal(String razaoSocial, String cnpj, double valorBruto, double imposto, Calendar data,
			String observacoes, List<Item> itens) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.valorBruto = valorBruto;
		this.imposto = imposto;
		this.data = data;
		this.observacoes = observacoes;
		this.items = itens;
	}

	@Override
	public String toString() {
		return mostrarNota();
	}

	private String mostrarNota() {
		SimpleDateFormat formatoDaDAta = new SimpleDateFormat("dd/MM/yyyy");
		String dataAsString = formatoDaDAta.format(this.data.getTime());

		return String.format("Razão social: %s - Valor Bruto: R$ %,.2f - Impostos: R$ %,.2f - Data: %s",
				this.razaoSocial, this.valorBruto, this.imposto, dataAsString);
	}

}
