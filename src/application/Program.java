package application;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		aluno1.setNome("João da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("18/10/1977");
		aluno1.setRegistroGeral("444.555.1-0");
		aluno1.setNomeMae("Maria");
		aluno1.setNomePai("João");
		aluno1.setDataMatricula("01/01/1990");
		aluno1.setSerieMatriculado("5º");
		
		System.out.println("Nome é: " + aluno1.getNome());
		System.out.println("Idade é: " + aluno1.getIdade());
		System.out.println("Nascimento: " + aluno1.getDataNascimento());
		
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alex Santos");

		Aluno aluno3 = new Aluno();
		aluno3.setNome("Tiago Silva");
	}

}
