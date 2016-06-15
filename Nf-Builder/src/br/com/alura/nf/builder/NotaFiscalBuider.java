package br.com.alura.nf.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.alura.nf.modelo.Item;
import br.com.alura.nf.modelo.NotaFiscal;

public class NotaFiscalBuider {

	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private String observacoes;
	private List<Item> itens = new ArrayList<>();
	private Calendar data;
	
	public NotaFiscalBuider() {
		this.data = naDataAtual();
	}

	public NotaFiscalBuider comRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscal criarNf() {
		return new NotaFiscal(this.razaoSocial, this.cnpj, this.valorBruto, impostos(), this.data, this.observacoes,
				this.itens);
	}

	public NotaFiscalBuider comCNPJ(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	private Calendar naDataAtual() {
		return Calendar.getInstance();
	}
	
	public NotaFiscalBuider naData(Calendar data) {
		this.data = data;
		
		return this;
	}

	public NotaFiscalBuider com(Item item) {
		itens.add(item);
		calcularValorBruto(item);
		return this;
	}

	private void calcularValorBruto(Item item) {
		this.valorBruto += item.getPreco();
	}

	private double impostos() {
		return this.valorBruto * 0.05;
	}

}
