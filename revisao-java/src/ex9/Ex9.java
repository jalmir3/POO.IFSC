package ex9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> lista = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite a " + (i + 1) + "º palavra");
			lista.add(sc.next());
		}
		boolean vazia = lista.isEmpty();
		if (vazia == true) {
			System.out.println("A lista está vazia");
		}
		System.out.println(lista);

		System.out.println("Tamanho da lista= " + lista.size());

		System.out.println("Palavra da ultima posicao= " + lista.get(2));
	}
}

