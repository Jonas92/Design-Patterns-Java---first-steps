package br.com.alura.aplicandoPadroes.capI;

public class PostgresBD extends TemplateDeSgbd {

	public PostgresBD(Sgbd proximoSgbd) {
		super(proximoSgbd);
	}

	public PostgresBD() {}

	@Override
	protected String urlDeConexao() {
		System.out.println("Conectou no Postgres!");
		return null;
	}

	@Override
	protected String nomeDoBanco() {
		return "Postgres";
	}

}
