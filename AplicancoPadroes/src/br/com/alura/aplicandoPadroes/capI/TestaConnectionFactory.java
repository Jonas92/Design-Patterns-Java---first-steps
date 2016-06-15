package br.com.alura.aplicandoPadroes.capI;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConnectionFactory {

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();

		String sql = "consulta de mentira";

		connection.prepareStatement(sql);

	}
}
