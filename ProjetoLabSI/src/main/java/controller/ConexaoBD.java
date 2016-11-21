package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConexaoBD {

	public Statement stm;
	public ResultSet result;
	private String driver = "org.postgresql.Driver";
	private String caminho = "jdbc:postgresql://localhost:5432/AcessoSistema";
	private String usuario = "postgres";
	private String senha = "5414jb";
	public Connection conn;

	public void conexao() {

		try {
			System.setProperty("jdbc.Drivers", driver);
			conn = DriverManager.getConnection(caminho, usuario, senha);
			JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso!!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro de conexão com o banco:\n" + e.getMessage());
		}

	}

	public void desconecta() {
		try {
			conn.close();

			JOptionPane.showMessageDialog(null, "Desconectado com Sucesso!!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao desconectar o banco:\n" + e.getMessage());
		}
	}

}
