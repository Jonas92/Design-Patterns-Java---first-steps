package br.com.alura.nf.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.alura.nf.modelo.Item;
import br.com.alura.nf.modelo.NotaFiscal;
import br.com.alura.nf.util.notaFiscal.AcaoDaNota;

public class NotaFiscalBuider {

	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private String observacoes;
	private List<Item> itens = new ArrayList<>();
	private Calendar data;
	private List<AcaoDaNota> acoesARealizar = new ArrayList<>();

	public NotaFiscalBuider(List<AcaoDaNota> acaoDaNotas) {
		this.data = naDataAtual();
		this.acoesARealizar = acaoDaNotas;
	}

	public NotaFiscalBuider paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuider eRealizar(AcaoDaNota acaoDaNota) {
		this.acoesARealizar.add(acaoDaNota);

		return this;
	}

	public NotaFiscal criarNf() {
		NotaFiscal notaFiscal = new NotaFiscal(this.razaoSocial, this.cnpj, this.valorBruto, impostos(), this.data,
				this.observacoes, this.itens);

		realizarAcoesNa(notaFiscal);

		return notaFiscal;
	}

	private void realizarAcoesNa(NotaFiscal notaFiscal) {

		for (AcaoDaNota acaoDaNota : this.acoesARealizar) {
			acaoDaNota.executarEm(notaFiscal);
		}
	}

	public NotaFiscalBuider deCNPJ(String cnpj) {
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
