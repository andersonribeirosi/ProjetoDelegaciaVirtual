package model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Embeddable
@Table(name = "telefones")
public class Telefone {
	private int numeroFixo;
	private int numeroCelular;
	private int email;

	public Telefone(int numeroFixo, int numeroCelular, int email) {
		this.numeroFixo = numeroFixo;
		this.numeroCelular = numeroCelular;
		this.email = email;
	}

	@Column(name="telefone_fixo")
	public int getNumeroFixo() {
		return numeroFixo;
	}

	public void setNumeroFixo(int numeroFixo) {
		this.numeroFixo = numeroFixo;
	}

	@Column(name="celular")
	public int getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(int numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	@Column(name="email")
	public int getEmail() {
		return email;
	}

	public void setEmail(int email) {
		this.email = email;
	}


}
