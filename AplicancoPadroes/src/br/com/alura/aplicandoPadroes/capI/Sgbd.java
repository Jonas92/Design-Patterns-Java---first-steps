package br.com.alura.aplicandoPadroes.capI;

import java.sql.Connection;
import java.sql.SQLException;

public interface Sgbd {

	Connection conectarNo(String banco) throws SQLException;

}
