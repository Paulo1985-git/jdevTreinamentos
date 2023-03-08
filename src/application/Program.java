package application;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno(); // Joao
		aluno1.setNome("Joao da Silva");
		aluno1.setIdade(50);
		aluno1.setNomeEscola("MNC");
		aluno1.setNota1(50.5);
		aluno1.setNota2(50.5);
		aluno1.setNota3(78.9);
		aluno1.setNota4(55.9);

		Aluno aluno2 = new Aluno(); // Pedro
		aluno2.setNome("Pedro Santana");
		aluno2.setIdade(33);
		aluno2.setNomeEscola("ECB");

		Aluno aluno3 = new Aluno(); // Alex
		aluno3.setNome("Alex Oliveira");
		aluno3.setIdade(25);
		aluno3.setNomeEscola("KIJ");

		System.out.println("A média do aluno 1 é: " + aluno1.mediaNota());
		System.out.println(aluno1.getAlunoAprovado());
		System.out.println((aluno1.getAlunoAprovado()? "Aprovado" : "Reprovado"));
	}
}
