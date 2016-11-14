package model;

import java.util.ArrayList;

public class Usuario 
{	
	private int id_usuario;
	private String nome;
	private Endereco endereco;
	private ArrayList<Telefone> telefones;
	
	
	public Usuario(int id_usuario, String nome, Endereco endereco, ArrayList<Telefone> telefones)
	{
		super();
		this.id_usuario = id_usuario;
		this.nome = nome;
		this.endereco = endereco;
		this.telefones = telefones;
	}


	public int getId_usuario() 
	{
		return id_usuario;
	}


	public void setId_usuario(int id_usuario) 
	{
		this.id_usuario = id_usuario;
	}


	public String getNome() 
	{
		return nome;
	}


	public void setNome(String nome) 
	{
		this.nome = nome;
	}


	public Endereco getEndereco()
	{
		return endereco;
	}


	public void setEndereco(Endereco endereco) 
	{
		this.endereco = endereco;
	}


	public ArrayList<Telefone> getTelefones() 
	{
		return telefones;
	}


	public void setTelefones(ArrayList<Telefone> telefones) 
	{
		this.telefones = telefones;
	}
	
	
	

}
