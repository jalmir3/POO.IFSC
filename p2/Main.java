package com.poo.pratica.revisão.p2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Jose");
        cliente1.setDataNasc(LocalDate.of(2000, 3, 20));
        cliente1.setEmail("jose@teste.com");
        cliente1.setNrConta(1234560);
        cliente1.setSaldo(20000d);
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria");
        cliente2.setDataNasc(LocalDate.of(1995, 3, 22));
        cliente2.setEmail("maria@teste.com");
        cliente2.setNrConta(91020291);
        cliente2.setSaldo(30000d);
        Funcionario func1= new Funcionario();
        func1.setNome("Carlos");
        func1.setNrRegistro(213234321);
        func1.setDataNasc(LocalDate.of(1999, 2, 17));
        func1.setEmail("carlos@teste.com");
        func1.setDataContratacao(LocalDate.now());
        Funcionario func2= new Funcionario();
        func2.setNome("Rafael");
        func2.setNrRegistro(000000101);
        func2.setDataNasc(LocalDate.of(1991, 9, 17));
        func2.setEmail("rafael@teste.com");
        func2.setDataContratacao(LocalDate.of(2018, 9, 26));
        
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Funcionario> listaFuncionarios= new ArrayList<>();
        
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaFuncionarios.add(func1);
        listaFuncionarios.add(func2);
        
        double deposito= 3000;
        double saque= 2000;
        
        cliente1.depositar(deposito);
        cliente1.sacar(saque);
        System.out.println("Saldo atual cliente 1: "+cliente1.mostrarSaldo());
        cliente2.depositar(deposito);
        cliente2.sacar(saque);
        System.out.println("Saldo atual cliente 2: "+cliente2.mostrarSaldo());
        
        for(Cliente lis : listaClientes) {
        	System.out.println(lis.toString());
        }
        for(Funcionario fun : listaFuncionarios) {
        	System.out.println(fun.toString());
        }
	}

}
