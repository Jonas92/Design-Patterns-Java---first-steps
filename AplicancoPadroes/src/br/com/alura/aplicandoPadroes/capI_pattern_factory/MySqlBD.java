package br.com.alura.aplicandoPadroes.capI_pattern_factory;

public class MySqlBD extends TemplateDeSgbd {

	public MySqlBD(Sgbd proximoSgbd) {
		super(proximoSgbd);
	}

	public MySqlBD() {}

	@Override
	protected String urlDeConexao() {
		System.out.println("Conectou no Mysql");
		return null;
	}

	@Override
	protected String nomeDoBanco() {
		return "Mysql";
	}

}
