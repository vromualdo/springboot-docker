package br.com.purple.model;

import java.io.Serializable;

public class Usuario implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4264964883476969314L;

	private String nome;
	
	private Integer idade;
	
	private String sexo;

	public Usuario() {
	}
	
	
	public Usuario(String nome, Integer idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	
	
	
}
