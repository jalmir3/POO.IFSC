package lista2;

import java.util.ArrayList;
import java.util.Scanner;

public class testePessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Pessoa> pessoa = new ArrayList<>();
		Pessoa p1 = new Pessoa();
		int opcao;
		int opcao2;

		do {
			System.out.println("Digite\n0-Para sair\n1-Para cadastrar\n2-Atualizar\n3-Listar:");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome da pessoa");
				p1.setNome(sc.next());
				System.out.println("Digite o idade da pessoa");
				p1.setIdade(sc.nextInt());
				System.out.println("Digite o cpf da pessoa");
				p1.setCpf(sc.next());
				pessoa.add(p1);
				break;
			case 2:
				System.out.println("Digite\n1-Para alterar o Nome\n2-Para alterar Idade\n3-Para alterar CPF:");
				opcao2 = sc.nextInt();
				switch (opcao2) {
				case 1:
					System.out.println("Digite o nome da pessoa");
					p1.setNome(sc.next());
					break;
				case 2:
					System.out.println("Digite o idade da pessoa");
					p1.setIdade(sc.nextInt());
					break;
				case 3:
					System.out.println("Digite o cpg da pessoa");
					p1.setCpf(sc.next());
					break;
				}
				pessoa.add(p1);
				break;
			case 3:
				for (Pessoa pes : pessoa) {
					System.out.println("Nome:" + pes.getNome());
					System.out.println("Idade:" + pes.getIdade());
					System.out.println("Cpf:" + pes.getCpf());
					
					break;
				}
			}

		} while (opcao != 0);

	}

}