package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="veiculo")
public class Veiculo {
	private int id_veiculo;
	private String placa;
	private long chassis;
	private Date ano;
	private String modelo;
	private String marca;
	private String cor;

	public Veiculo(int id_veiculo, String placa, long chassis, Date ano, String modelo, String marca, String cor) {
		this.id_veiculo = id_veiculo;
		this.placa = placa;
		this.chassis = chassis;
		this.ano = ano;
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
	}

	@Column(name = "id_veiculo")
	public int getId_veiculo() {
		return id_veiculo;
	}

	public void setId_veiculo(int id_veiculo) {
		this.id_veiculo = id_veiculo;
	}

	@Column(name = "placa")
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Column(name = "chassi")
	public long getChassis() {
		return chassis;
	}

	public void setChassis(long chassis) {
		this.chassis = chassis;
	}

	@Column(name = "ano")
	public Date getAno() {
		return ano;
	}

	public void setAno(Date ano) {
		this.ano = ano;
	}

	@Column(name = "modelo")
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Column(name = "marca")
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Column(name = "cor")
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
