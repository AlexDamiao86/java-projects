package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		// Alternativa mais antiga para iterar sobre uma Collections
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while (iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}

		// Codigo em Java 8 utilizando Lambda para itera sobre a lista de alunos
//		javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));
		System.out.println(javaColecoes);

		System.out.println(javaColecoes.estaMatriculado(a2));

		System.out.println("Quem é o aluno 5617?");

		try {
			Aluno aluno = javaColecoes.buscaMatriculado(5618);
			System.out.println(aluno);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 


	}
}