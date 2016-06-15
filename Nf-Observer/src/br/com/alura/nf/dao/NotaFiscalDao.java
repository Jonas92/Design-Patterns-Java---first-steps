package br.com.alura.nf.dao;

import br.com.alura.nf.modelo.NotaFiscal;
import br.com.alura.nf.util.notaFiscal.AcaoDaNota;

public class NotaFiscalDao implements AcaoDaNota {

	public void persistir(NotaFiscal notaFiscal) {
		System.out.println("Nota persistida com sucesso!");
	}

	@Override
	public void executarEm(NotaFiscal notaFiscal) {
		persistir(notaFiscal);
	}

}
