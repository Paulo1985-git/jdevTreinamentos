package application;

import javax.swing.JOptionPane;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o nome do Aluno? ");
		String idade = JOptionPane.showInputDialog("Idade: ");
		String nascimento = JOptionPane.showInputDialog("Data de nascimento:");
		String rg = JOptionPane.showInputDialog("Registro Geral: ");
		String mae = JOptionPane.showInputDialog("Nome da mãe: ");
		String pai = JOptionPane.showInputDialog("Nome do pai: ");
		String matricula = JOptionPane.showInputDialog("Matrícula: ");
		String serie = JOptionPane.showInputDialog("Série");
		String escola = JOptionPane.showInputDialog("Escola: ");
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1: ");
		String nota1 = JOptionPane.showInputDialog("Nota 1: ");
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2: ");
		String nota2 = JOptionPane.showInputDialog("Nota 2: ");
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3: ");
		String nota3 = JOptionPane.showInputDialog("Nota 3: ");
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4: ");
		String nota4 = JOptionPane.showInputDialog("Nota 4: ");

		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.parseInt(idade));
		aluno1.setDataNascimento(nascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		aluno1.setDisciplina1(disciplina1);
		aluno1.setDisciplina2(disciplina2);
		aluno1.setDisciplina3(disciplina3);
		aluno1.setDisciplina4(disciplina4);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));

		System.out.println("Nome é: " + aluno1.getNome());
		System.out.println("Idade é: " + aluno1.getIdade());
		System.out.println("Nascimento: " + aluno1.getDataNascimento());
		System.out.printf("Média da nota é: %.2f%n", aluno1.getMediaNota());

	}
}
