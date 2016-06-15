package br.com.alura.filtragem.filtros;

public enum ValoreDeSaldoSuspeito {

	SaldoMuitoBaixo(100), SaldoMuitoAlto(500000);

	private double valor;

	private ValoreDeSaldoSuspeito(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

}
