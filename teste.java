package Ifsc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class teste {
   
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   String nome;
	   List<String> lista= new ArrayList<>();
	   List<Integer> listaN = new ArrayList<>();
       System.out.println("Digite seu nome:");
       nome=sc.nextLine();
       System.out.println("Nome=" + nome);
       lista.add("Jose");
       lista.add("carlos");
       lista.add("jalmir");
       
       System.out.println(lista.size());
       
       System.out.println(lista.isEmpty());
       
       System.out.println(lista.toString());
       
       System.out.println(lista);
       
       for(String lis: lista) {
    	   System.out.println(lis);
       }
       
       int cont=0;
       while(cont<lista.size()) {
    	   System.out.println(lista.get(cont));
    	   cont++;
       }
       sc.close();
	}

}
