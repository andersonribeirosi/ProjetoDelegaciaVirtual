package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.Ocorrencia;

public class OcorrenciaController {

	ConexaoController connex = new ConexaoController();

	Ocorrencia ocorrencia = new Ocorrencia();

	public void salvarOcorrencia(Ocorrencia ocorrencia) {

		connex.conexao();

		try {
			PreparedStatement pst = connex.conn
					.prepareStatement("insert into ocorrencias (nome,data_nasc,cpf,rg, estado, sexo, mae, "
							+ "pai, endereco, numero, complemento, bairro, cidade, estado1, "
							+ "cep, telefoneres, celular, email, descricao) "
							+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

			if (ocorrencia.getNome() == null || ocorrencia.getNome().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Campo vazio");
			} else {
				pst.setString(1, ocorrencia.getNome());
			}

			if (ocorrencia.getData() == null || ocorrencia.getData().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Campo vazio");

			} else {
				pst.setString(2, ocorrencia.getData());
			}

			if (ocorrencia.getCpf() == null || ocorrencia.getCpf().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Campo vazio");

			} else {
				pst.setString(3, ocorrencia.getCpf());
			}

			if (ocorrencia.getRg() == null || ocorrencia.getRg().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Campo vazio");

			} else {
				pst.setString(4, ocorrencia.getRg());
			}

			pst.setString(5, ocorrencia.getEstado1());
			pst.setString(6, ocorrencia.getSexo());
			pst.setString(7, ocorrencia.getMae());
			pst.setString(8, ocorrencia.getPai());

			if (ocorrencia.getEndereco() == null || ocorrencia.getEndereco().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Campo vazio");

			} else {
				pst.setString(9, ocorrencia.getEndereco());
			}

			if (ocorrencia.getNumero() == null || ocorrencia.getNumero().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Campo vazio");

			} else {
				pst.setString(10, ocorrencia.getNumero());
			}

			pst.setString(11, ocorrencia.getComplemento());
			pst.setString(12, ocorrencia.getBairro());
			pst.setString(13, ocorrencia.getCidade());
			pst.setString(14, ocorrencia.getEstado());
			pst.setString(15, ocorrencia.getCep());

			
			if (ocorrencia.getTelefoneres() == null || ocorrencia.getTelefoneres().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Campo vazio");

			} else {
				pst.setString(16, ocorrencia.getTelefoneres());			
			}
			

			if (ocorrencia.getCelular() == null || ocorrencia.getCelular().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Campo vazio");

			} else {
				pst.setString(17, ocorrencia.getCelular());				
			}
			
			
			
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
