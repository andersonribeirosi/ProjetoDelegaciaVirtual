package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Acesso {



		public boolean acesso;

		public void acesso(String login, String senha) {

			Connection con = null;
			Statement consulta = null;
			ResultSet tabela = null;

			try {
				Class.forName("org.postgresql.Driver");
				con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AcessoSistema", "postgres", "5414jb");
				consulta = (Statement) con.createStatement();
				tabela = consulta.executeQuery("select login, senha from usuarios where login='"+login+"'and senha='"+senha+"'");

				if (tabela.next()) {
					JOptionPane.showMessageDialog(null, "Usuário e senha corretos - Logado com Sucesso");
					acesso = true;
				} else {

					JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos");
					acesso = false;
				}

			} catch (ClassNotFoundException | SQLException e) {
				// TODO: handle exception
			}

		}

	}

