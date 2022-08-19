package ex8;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ultimo="0";
		String vetor[] = new String[3];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite a " + (i + 1) + "º palavra");
			vetor[i] = sc.next();
		}
		for (int i = 0; i < vetor.length; i++) {
			if (vetor.length == 0) {
				System.out.println("O vetor está vazio");
			} else {
				System.out.println(vetor[i]);
				ultimo = vetor[vetor.length - 1];
			}
		}
		System.out.println("Tamanho do vetor= " + vetor.length);

		System.out.println("Vetor da ultima posicao= "+ ultimo);
	}
}

