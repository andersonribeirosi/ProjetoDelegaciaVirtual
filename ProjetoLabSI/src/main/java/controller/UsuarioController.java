package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.Usuario;

public class UsuarioController {

	ConexaoController connex = new ConexaoController();

	Usuario usuario = new Usuario();

	public void salvarUsuario(Usuario usuario) {

		connex.conexao();

		try {
			PreparedStatement pst = connex.conn
					.prepareStatement("insert into usuarios (login, senha, data_nasc, cpf, rg) values (?,?,?,?,?)");

			pst.setString(1, usuario.getLogin());
			pst.setString(2, usuario.getSenha());
			pst.setString(3, usuario.getData_nasc());
			pst.setString(4, usuario.getCpf());
			pst.setString(5, usuario.getRg());
			

			pst.execute();

			JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao inserir");
		}

		connex.desconecta();

	}
}
	
	

