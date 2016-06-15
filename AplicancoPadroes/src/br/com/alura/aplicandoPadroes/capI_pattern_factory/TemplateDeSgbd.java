package br.com.alura.aplicandoPadroes.capI_pattern_factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class TemplateDeSgbd implements Sgbd {
	private Sgbd proximoSgbd;

	public TemplateDeSgbd(Sgbd proximoSgbd) {
		this.proximoSgbd = proximoSgbd;
	}

	public TemplateDeSgbd() {}

	@Override
	public final Connection conectarNo(String banco) throws SQLException {
		if (banco.equals(nomeDoBanco())) {
			return DriverManager.getConnection(urlDeConexao());
		}
		else
			if (proximoSgbd != null) {
				return proximoSgbd.conectarNo(banco);
			}
			else {
				throw new RuntimeException("Banco de dados inválido!");
			}
	}

	protected abstract String urlDeConexao();

	protected abstract String nomeDoBanco();
}
