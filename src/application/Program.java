package application;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		aluno1.setNome("Jo�o da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("18/10/1977");
		aluno1.setRegistroGeral("444.555.1-0");
		aluno1.setNomeMae("Maria");
		aluno1.setNomePai("Jo�o");
		aluno1.setDataMatricula("01/01/1990");
		aluno1.setSerieMatriculado("5�");
		aluno1.setNomeEscola("JDEV Treinamentos");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		System.out.println("Nome �: " + aluno1.getNome());
		System.out.println("Idade �: " + aluno1.getIdade());
		System.out.println("Nascimento: " + aluno1.getDataNascimento());
		
		System.out.printf("M�dia da nota �: %.2f%n", aluno1.getMediaNota());
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alex Santos");

		Aluno aluno3 = new Aluno();
		aluno3.setNome("Tiago Silva");
	}

}
