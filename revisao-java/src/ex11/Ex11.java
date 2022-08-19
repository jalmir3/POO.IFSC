package ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random aleat = new Random();
		List<Float> lista = new ArrayList<>();
        float soma=0;
		for (int i = 0; i < 100; i++) {
			lista.add(aleat.nextFloat(1000, 5000));
			soma=soma+lista.get(i);
		}
		for (Float num : lista) {
			System.out.println(num);
		}
		System.out.println("");
		System.out.print("Maior salario="+Collections.max(lista));
		System.out.println("");
		System.out.print("Menor salario="+Collections.min(lista));
		System.out.println("");
		System.out.print("Media salario="+soma/100);
	}
}

