package br.com.alura.escola.dominio.aluno;

import java.time.format.DateTimeFormatter;

import br.com.alura.escola.dominio.Evento;
import br.com.alura.escola.dominio.Ouvinte;

public class LogDeAlunoMatriculado extends Ouvinte {

	public void reageAo(Evento evento) {
		String momentoFormatado = evento
				.momento()
				.format(DateTimeFormatter
						.ofPattern("dd/MM/yyyy HH:MM"));
		System.out.println(String.format(
				"Aluno cm CPF %s matriculado em: %s", 
				((AlunoMatriculado) evento).getCpfDoAluno(), 
				momentoFormatado));
	}

	// Só irá devolver true se o evento for de AlunoMatriculado
	@Override
	protected boolean deveProcessar(Evento evento) {
		return evento instanceof AlunoMatriculado;
	}
	
}
