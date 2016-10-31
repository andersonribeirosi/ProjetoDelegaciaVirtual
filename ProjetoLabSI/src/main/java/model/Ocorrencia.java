package model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Embeddable
@Table(name="ocorrencia")
public class Ocorrencia {
	private long protocolo;
	private String descricao;
	
	@Embedded
	private Endereco endereco;

	public Ocorrencia(long protocolo, String descricao, Endereco endereco) {
		this.protocolo = protocolo;
		this.descricao = descricao;
		this.endereco = endereco;
	}

	@Column(name = "protocolo")
	public long getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(long protocolo) {
		this.protocolo = protocolo;
	}

	@Column(name = "descricao")
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
