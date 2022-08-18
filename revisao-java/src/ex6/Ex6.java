package ex6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Double> salario = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o salario " + (i + 1) + "=");
			salario.add(sc.nextDouble());
		}
		Collections.sort(salario);
		System.out.println("Salarios em ordem crescente");
		for (Double sal : salario) {
			System.out.println(sal);
		}
		Collections.reverse(salario);
		System.out.println("Salarios em ordem decrescente");
		for (Double sal : salario) {
			System.out.println(sal);
		}

	}

}
