package br.com.alura.aplicandoPadroes.capI_pattern_factory;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {

	String banco = "Mysql";

	public Connection getConnection() throws SQLException {
		Sgbd sgbd = new PostgresBD(new MySqlBD());

		return sgbd.conectarNo(banco);
	}

}
