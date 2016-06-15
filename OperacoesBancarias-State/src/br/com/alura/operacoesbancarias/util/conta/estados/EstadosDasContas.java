package br.com.alura.operacoesbancarias.util.conta.estados;

public enum EstadosDasContas {

	Positivo("Adimplente"), Negativo("Inadimplente");

	private String situacao;

	private EstadosDasContas(String situacao) {
		this.situacao = situacao;
	}

	public String getSituacao() {
		return situacao;
	}
}
