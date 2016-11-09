package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cadastro_usuarios")
public class Cadastro {
	
	@Embedded
	private Usuario usuario;
	
	private long CPF;
	private Date dataDeNascimento;
	private int rg;
	private String Senha;

	public Cadastro(Usuario usuario, long cPF, Date dataDeNascimento, int rg, String senha) {
		this.usuario = usuario;
		CPF = cPF;
		this.dataDeNascimento = dataDeNascimento;
		this.rg = rg;
		Senha = senha;
	}

	@Column(name="usuario")
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Column(name="cpf")
	public long getCPF() {
		return CPF;
	}

	public void setCPF(long cPF) {
		CPF = cPF;
	}

	@Column(name="data_nascimento")
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	@Column(name="rg")
	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	@Column(name="senha")
	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

}
