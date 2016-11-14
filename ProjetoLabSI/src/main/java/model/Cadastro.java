package model;

import java.util.Date;

public class Cadastro 
{	private Usuario usuario;
	private long CPF;
	private Date dataDeNascimento;
	private int rg;
	private String Senha;
	
	public Cadastro(Usuario usuario, long cPF, 
			Date dataDeNascimento, int rg, String senha) 
	{
		super();
		this.usuario = usuario;
		CPF = cPF;
		this.dataDeNascimento = dataDeNascimento;
		this.rg = rg;
		Senha = senha;
	}

	public Usuario getUsuario() 
	{
		return usuario;
	}

	public void setUsuario(Usuario usuario) 
	{
		this.usuario = usuario;
	}

	public long getCPF() 
	{
		return CPF;
	}

	public void setCPF(long cPF) 
	{
		CPF = cPF;
	}

	public Date getDataDeNascimento() 
	{
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) 
	{
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getRg()
	{
		return rg;
	}

	public void setRg(int rg) 
	{
		this.rg = rg;
	}

	public String getSenha() 
	{
		return Senha;
	}

	public void setSenha(String senha) 
	{
		Senha = senha;
	}
	
	

}
