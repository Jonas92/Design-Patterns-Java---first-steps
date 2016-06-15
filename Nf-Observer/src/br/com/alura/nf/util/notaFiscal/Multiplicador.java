package br.com.alura.nf.util.notaFiscal;

import br.com.alura.nf.modelo.NotaFiscal;

public class Multiplicador implements AcaoDaNota {

	private double multiplicador;

	public Multiplicador(double multiplicador) {
		this.multiplicador = multiplicador;
	}

	@Override
	public void executarEm(NotaFiscal notaFiscal) {
		multiplicar(notaFiscal);
	}

	private void multiplicar(NotaFiscal notaFiscal) {
		double valorMultiplicado = notaFiscal.getValorBruto() * this.multiplicador;

		System.out.println("Valor Bruto multiplicado: R$ " + valorMultiplicado);
	}

}
