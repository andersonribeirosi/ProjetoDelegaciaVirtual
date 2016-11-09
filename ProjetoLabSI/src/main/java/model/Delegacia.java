package model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "delegacias")
public class Delegacia {

	private int idDelegado;

	private String delegado;

	@Embedded
	private Veiculo veiculo;

	@Embedded
	private Cadastro cadastro;

	@Embedded
	private Ocorrencia ocorrencia;

	@Embedded
	private Relatorio relatorio;

	private ArrayList<String> situacaoDoVeiculo;
	private ArrayList<Cadastro> cadastros;
	private String login;
	private String senha;

	/**
	 * Esse metodo emiti um relatorio
	 * 
	 * @return retorna um relatorio
	 */
	public Relatorio emitirRelatorio() { // Por uma condição
		return relatorio;
	}

	/**
	 * Esse é para conslutar um veiculo
	 * 
	 * @param veiculo
	 *            recebe um veiculo
	 * @return retorna um veiculo
	 */
	public ArrayList<String> ConsultarVeiculo(Veiculo veiculo) {
		return situacaoDoVeiculo;
	}

	/**
	 * Esse metodo é para cadastrar um usuario
	 * 
	 * @param cadastro
	 *            recebi uma cadastro a ser a adicionado
	 */
	public void cadastrarUsuario(Cadastro cadastro) // por uma exception
	{ // Por um condição
		cadastros.add(cadastro);
	}

	/**
	 * Esse metodo é para excluir um cadastro
	 * 
	 * @param cadastro
	 *            recebi uma cadastro a ser excluido
	 */

	public void excluirCadastro(Cadastro cadastro) // por uma exception
	{ // Por uma condição
		cadastros.remove(cadastro);
	}

	/**
	 * Esse efetua um login e acessa as funcionalidades do software
	 * 
	 * @param login
	 *            recebe uma String como login
	 * @param senha
	 *            recebe uma String como senha
	 * @return retorna uma conexão com os dados
	 */
	public String getFazerLogin(String login, String senha) {
		// Retorna uma conexção
		return senha;

	}

	/**
	 * Esse metodo efetua o logout
	 */
	public void fazerLogut() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "idDelegado")
	public int getIdDelegado() {
		return idDelegado;
	}

	public void setIdDelegado(int idDelegado) {
		this.idDelegado = idDelegado;
	}

	@Column(name = "delegado")
	public String getDelegado() {
		return delegado;
	}

	public void setDelegado(String delegado) {
		this.delegado = delegado;
	}

	@Column(name = "veiculo")
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	public Ocorrencia getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public Relatorio getRelatorio() {
		return relatorio;
	}

	public void setRelatorio(Relatorio relatorio) {
		this.relatorio = relatorio;
	}

	@Column(name = "situacaoVeiculo")
	public ArrayList<String> getSituacaoDoVeiculo() {
		return situacaoDoVeiculo;
	}

	public void setSituacaoDoVeiculo(ArrayList<String> situacaoDoVeiculo) {
		this.situacaoDoVeiculo = situacaoDoVeiculo;
	}

	public ArrayList<Cadastro> getCadastros() {
		return cadastros;
	}

	public void setCadastros(ArrayList<Cadastro> cadastros) {
		this.cadastros = cadastros;
	}

	@Column(name = "login")
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "senha")
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
