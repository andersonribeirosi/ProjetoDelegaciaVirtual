package model;

public class Ocorrencia 
{	
	private long protocolo;
	private String descricao;
	private Endereco endereco;
	
	
	public Ocorrencia(long protocolo, 
			String descricao, Endereco endereco) 
	{
		super();
		this.protocolo = protocolo;
		this.descricao = descricao;
		this.endereco = endereco;
	}


	public long getProtocolo() 
	{
		return protocolo;
	}


	public void setProtocolo(long protocolo) 
	{
		this.protocolo = protocolo;
	}


	public String getDescricao()
	{
		return descricao;
	}


	public void setDescricao(String descricao) 
	{
		this.descricao = descricao;
	}


	public Endereco getEndereco() 
	{
		return endereco;
	}


	public void setEndereco(Endereco endereco) 
	{
		this.endereco = endereco;
	}
	
	
	

}
