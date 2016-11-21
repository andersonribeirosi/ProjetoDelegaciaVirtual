package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.Furto;

public class ControleFurto {


		ConexaoBD connex = new ConexaoBD();

		Furto furto = new Furto();

		public void salvarFurto(Furto furto) {

			connex.conexao();

			try {
				PreparedStatement pst = connex.conn
						.prepareStatement("insert into furtos (nome,data_nasc,cpf,rg, estado, sexo, mae, "
								+ "pai, endereco, numero, complemento, bairro, cidade, estado1, "
								+ "cep, telefoneres, celular, email, descricao) "
								+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

				pst.setString(1, furto.getNome());
				pst.setString(2, furto.getData());
				pst.setString(3, furto.getCpf());
				pst.setString(4, furto.getRg());
				pst.setString(5, furto.getEstado1());
				pst.setString(6, furto.getSexo());
				pst.setString(7, furto.getMae());
				pst.setString(8, furto.getPai());
				pst.setString(9, furto.getEndereco());
				pst.setString(10, furto.getNumero());
				pst.setString(11, furto.getComplemento());
				pst.setString(12, furto.getBairro());
				pst.setString(13, furto.getCidade());
				pst.setString(14, furto.getEstado());
				pst.setString(15, furto.getCep());
				pst.setString(16, furto.getTelefoneres());
				pst.setString(17, furto.getCelular());
				pst.setString(18, furto.getEmail());
				pst.setString(19, furto.getDescricao());

				pst.execute();

				JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Erro ao inserir");
			}

			connex.desconecta();

		}
	}


