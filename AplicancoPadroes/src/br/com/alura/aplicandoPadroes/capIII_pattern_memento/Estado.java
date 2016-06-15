package br.com.alura.aplicandoPadroes.capIII_pattern_memento;

public class Estado {

	private Contrato contrato;

	public Estado(Contrato contrato) {
		this.contrato = contrato;
	}

	public Contrato getEstado() {
		return contrato;
	}

	public TipoContrato getTipo() {
		return contrato.getTipo();
	}

}
