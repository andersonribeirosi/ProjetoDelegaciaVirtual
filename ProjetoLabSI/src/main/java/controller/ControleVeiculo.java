package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.Veiculo;

public class ControleVeiculo {

	ConexaoBD connex = new ConexaoBD();

	Veiculo veiculo = new Veiculo();
	

	public void salvar(Veiculo veiculo) {

		connex.conexao();

		try {
			PreparedStatement pst = connex.conn.prepareStatement(
					"insert into veiculos (placa,chassi,renavan, ano_fab,ano_mod, modelo,cor, marca) values (?,?,?,?,?,?,?,?)");
		
		pst.setString(1, veiculo.getPlaca());
		pst.setString(2, veiculo.getChassi());
		pst.setString(3, veiculo.getRenavan());
		pst.setString(4, veiculo.getAno_fab());
		pst.setString(5, veiculo.getAno_mod());
		pst.setString(6, veiculo.getModelo());
		pst.setString(7, veiculo.getCor());
		pst.setString(8, veiculo.getMarca());
		
		pst.execute();
		
		JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao inserir");
		}
		
		connex.desconecta();

	}

}
