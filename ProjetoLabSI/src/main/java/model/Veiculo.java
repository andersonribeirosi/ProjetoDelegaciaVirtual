package model;

public class Veiculo {

	private int idVeiculo;
	private String placa;
	private String chassi;
	private String renavan;
	private String ano_fab;
	private String ano_mod;
	private String modelo;
	private String cor; 
	private String marca;
	

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getRenavan() {
		return renavan;
	}

	public void setRenavan(String renavan) {
		this.renavan = renavan;
	}

	public String getAno_fab() {
		return ano_fab;
	}

	public void setAno_fab(String ano_fab) {
		this.ano_fab = ano_fab;
	}

	public String getAno_mod() {
		return ano_mod;
	}

	public void setAno_mod(String ano_mod) {
		this.ano_mod = ano_mod;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
