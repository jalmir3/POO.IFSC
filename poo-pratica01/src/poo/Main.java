package poo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Aluno[] aluno = new Aluno[3];

		Professor[] professor = new Professor[3];

		for (int i = 0; i < aluno.length; i++) {
			Aluno alu = new Aluno();
			System.out.println("\nInforme o nome do Aluno:");
			alu.setNome(sc.next());
			System.out.println("\nInforme o cpf do Aluno:");
			alu.setCpf(sc.nextLong());
			System.out.println("\nInforme a matricula do Aluno:");
			alu.setMatricula(sc.nextLong());

			aluno[i] = alu;

		}
		for (int i = 0; i < professor.length; i++) {
			Professor prof = new Professor();
			System.out.println("\nInforme o nome do Professor:");
			prof.setNome(sc.next());
			System.out.println("\nInforme o cpf do Professor:");
			prof.setCpf(sc.nextLong());
			System.out.println("\nInforme a siape do Professor:");
			prof.setSiape(sc.nextLong());

			professor[i] = prof;

		}
		for (int i = 0; i < aluno.length; i++) {

			System.out.println("nome do Aluno:" + aluno[i].getNome());

			System.out.println("cpf do Aluno:" + aluno[i].getCpf());

			System.out.println("matricula do Aluno:" + aluno[i].getMatricula());

		}
		for (int i = 0; i < professor.length; i++) {

			System.out.println("nome do Professor:" + professor[i].getNome());

			System.out.println("cpf do Professor:" + professor[i].getCpf());

			System.out.println("siape do Professor:" + professor[i].getSiape());

		}
		sc.close();

	}
}