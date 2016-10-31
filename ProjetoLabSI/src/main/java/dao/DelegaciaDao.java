package dao;

import java.util.ArrayList;

import model.Cadastro;
import model.Relatorio;
import model.Veiculo;

public interface DelegaciaDao {
	public Relatorio emitirRelatorio(Relatorio relatorio);

	public ArrayList<String> ConsultarVeiculo(Veiculo veiculo);

	public void cadastrarUsuario(Cadastro cadastro);

	public void excluirCadastro(Cadastro cadastro);

	public String getFazerLogin(String login, String senha);

	public void fazerLogut();

}
