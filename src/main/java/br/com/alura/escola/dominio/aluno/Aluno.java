package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

// AGGREGATE ROOT
public class Aluno {

	private CPF cpf;
	private String nome;

	private Email email;

	private List<Telefone> telefones = new ArrayList<>();

	private String senha;

	public Aluno(CPF cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public void adicionarTelefone(String ddd, String numero) {
		// INVARIANTE
		/*
		 * Se um aluno tiver mais do que 2 telefones em nosso sistema, essa regra foi
		 * violada, logo, o Aluno estará em um estado inválido. Invariantes nada mais
		 * são do que regras de negócio que precisam ser verificadas para garantir sua
		 * consistência.
		 */
		if (telefones.size() == 2) {
			throw new IllegalArgumentException("Numero maximo de telefones ja atingido!");
		}
		this.telefones.add(new Telefone(ddd, numero));
	}

	public String getCpf() {
		return cpf.getNumero();
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email.getEndereco();
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public String getSenha() {
		return senha;
	}

}
