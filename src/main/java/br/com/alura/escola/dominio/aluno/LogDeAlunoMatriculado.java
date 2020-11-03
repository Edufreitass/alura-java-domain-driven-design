package br.com.alura.escola.dominio.aluno;

import java.time.format.DateTimeFormatter;

public class LogDeAlunoMatriculado {

	public void reageAo(AlunoMatriculado evento) {
		String momentoFormatado = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM"));
		System.out.println(String.format("Aluno cm CPF %s matriculado em: %s", evento.getCpfDoAluno(), momentoFormatado));
	}
	
}
