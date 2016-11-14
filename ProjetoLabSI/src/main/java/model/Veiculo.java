package model;

import java.util.Date;

public class Veiculo 
{	
	private int id_veiculo;
	private String placa;
	private long chassis;
	private Date ano;
	private String modelo;
	private String marca;
	private String cor;
	
	public Veiculo(int id_veiculo, String placa, long chassis, 
			Date ano, String modelo, String marca, String cor) 
	{
		super();
		this.id_veiculo = id_veiculo;
		this.placa = placa;
		this.chassis = chassis;
		this.ano = ano;
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
	}

	public int getId_veiculo() 
	{
		return id_veiculo;
	}

	public void setId_veiculo(int id_veiculo) 
	{
		this.id_veiculo = id_veiculo;
	}

	public String getPlaca() 
	{
		return placa;
	}

	public void setPlaca(String placa) 
	{
		this.placa = placa;
	}

	public long getChassis() 
	{
		return chassis;
	}

	public void setChassis(long chassis) 
	{
		this.chassis = chassis;
	}

	public Date getAno() 
	{
		return ano;
	}

	public void setAno(Date ano) 
	{
		this.ano = ano;
	}

	public String getModelo() 
	{
		return modelo;
	}

	public void setModelo(String modelo) 
	{
		this.modelo = modelo;
	}

	public String getMarca() 
	{
		return marca;
	}

	public void setMarca(String marca) 
	{
		this.marca = marca;
	}

	public String getCor() 
	{
		return cor;
	}

	public void setCor(String cor) 
	{
		this.cor = cor;
	}
	
	
	

}
