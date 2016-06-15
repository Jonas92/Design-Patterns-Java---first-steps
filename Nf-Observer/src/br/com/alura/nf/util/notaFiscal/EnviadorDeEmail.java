package br.com.alura.nf.util.notaFiscal;

import br.com.alura.nf.modelo.NotaFiscal;

public class EnviadorDeEmail implements AcaoDaNota {

	public void enviar(NotaFiscal notaFiscal) {

		System.out.println("Enviando e-mail da nota para " + notaFiscal.getRazaoSocial());
	}

	@Override
	public void executarEm(NotaFiscal notaFiscal) {
		enviar(notaFiscal);
	}

}
