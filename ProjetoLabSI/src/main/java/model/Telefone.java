package model;

public class Telefone 
{	
	private int numero;
	private int ddd;
	
	public Telefone(int numero, int ddd) {
		super();
		this.numero = numero;
		this.ddd = ddd;
	}

	public int getNumero() 
	{
		return numero;
	}

	public void setNumero(int numero)
	{
		this.numero = numero;
	}

	public int getDdd() 
	{
		return ddd;
	}

	public void setDdd(int ddd) 
	{
		this.ddd = ddd;
	}
	
	

}
