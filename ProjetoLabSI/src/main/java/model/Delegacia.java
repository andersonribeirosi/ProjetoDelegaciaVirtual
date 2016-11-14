package model;

import java.util.ArrayList;


import view.FormularioVeiculoFrame;

public class Delegacia 
{	
	private String delegado;
	private Veiculo veiculo;
	private Cadastro cadastro;
	private Ocorrencia ocorrencia;
	private Relatorio relatorio;
	private ArrayList<String> situacaoDoVeiculo;
	private ArrayList<Cadastro> cadastros;
	private String login;
	private String senha;
	private FormularioVeiculoFrame formularioVeiculo;
	
	/**
	 * Esse metodo emiti um relatorio
	 * @return retorna um relatorio
	 */
	public Relatorio emitirRelatorio()
	{	//Por uma condição
		return relatorio;
	}
	
	public FormularioVeiculoFrame getFormularioVeiculo(FormularioVeiculoFrame formularioVeiculo)
	{
		return formularioVeiculo;
	}
	
	/**
	 * Esse é para conslutar um veiculo
	 * @param veiculo recebe um veiculo
	 * @return retorna um veiculo
	 */
	public ArrayList<String> ConsultarVeiculo(Veiculo veiculo)
	{	
		return situacaoDoVeiculo;
	}
	
	/**
	 * Esse metodo é para cadastrar um usuario
	 * @param cadastro recebi uma cadastro a ser a adicionado
	 */
	public void cadastrarUsuario(Cadastro cadastro) //por uma exception
	{	//Por um condição
		cadastros.add(cadastro);
	}
	
	/**
	 * Esse metodo é para excluir um cadastro
	 * @param cadastro recebi uma cadastro a ser excluido
	 */
	
	public void excluirCadastro(Cadastro cadastro) //por uma exception
	{	//Por uma condição
		cadastros.remove(cadastro);
	}
	/**
	 * Esse efetua um login e acessa as funcionalidades do software
	 * @param login recebe uma String como login
	 * @param senha recebe uma String como senha
	 * @return retorna uma conexão com os dados
	 */
	public String getFazerLogin(String login, String senha)
	{	
		//Retorna uma conexção
		return senha;	
		
	}
	/**
	 * Esse metodo efetua o logout
	 */
	public void fazerLogut()
	{	
		
	}
	
	

}
