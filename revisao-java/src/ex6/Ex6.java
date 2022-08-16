package ex6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        double salario[]= new double[10];
        
        for(int i=0;i<salario.length;i++) {
        	System.out.println("Digite o salario "+(i+1)+"=");
        	salario[i]=sc.nextDouble();
        }
       // for(int i=0;i<salario.length;i++) {
        	System.out.println(Collections.sort(salario));
        	
       // }
	}

}
