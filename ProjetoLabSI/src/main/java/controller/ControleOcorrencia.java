package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.Ocorrencia;

public class ControleOcorrencia {

	ConexaoBD connex = new ConexaoBD();

	Ocorrencia ocorrencia = new Ocorrencia();

	public void salvarOcorrencia(Ocorrencia ocorrencia) {

		connex.conexao();

		try {
			PreparedStatement pst = connex.conn
					.prepareStatement("insert into ocorrencias (nome,data_nasc,cpf,rg, estado, sexo, mae, "
							+ "pai, endereco, numero, complemento, bairro, cidade, estado1, "
							+ "cep, telefoneres, celular, email, descricao) "
							+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

			
			pst.setString(1, ocorrencia.getNome());
			pst.setString(2, ocorrencia.getData());
			pst.setString(3, ocorrencia.getCpf());
			pst.setString(4, ocorrencia.getRg());
			pst.setString(5, ocorrencia.getEstado1());
			pst.setString(6, ocorrencia.getSexo());
			pst.setString(7, ocorrencia.getMae());
			pst.setString(8, ocorrencia.getPai());
			pst.setString(9, ocorrencia.getEndereco());
			pst.setString(10, ocorrencia.getNumero());
			pst.setString(11, ocorrencia.getComplemento());
			pst.setString(12, ocorrencia.getBairro());
			pst.setString(13, ocorrencia.getCidade());
			pst.setString(14, ocorrencia.getEstado());
			pst.setString(15, ocorrencia.getCep());
			pst.setString(16, ocorrencia.getTelefoneres());
			pst.setString(17, ocorrencia.getCelular());
			pst.setString(18, ocorrencia.getEmail());
			pst.setString(19, ocorrencia.getDescricao());

			pst.execute();
			
			JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao inserir");
		}

		connex.desconecta();

	}
}
