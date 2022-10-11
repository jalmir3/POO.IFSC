package com.poo.pratica.revisão.p2;

import java.time.LocalDate;

public class Funcionario extends Pessoa{

	private Integer nrRegistro;
	private LocalDate dataContratacao;
	
	public Integer getNrRegistro() {
		return nrRegistro;
	}
	public void setNrRegistro(Integer nrRegistro) {
		this.nrRegistro = nrRegistro;
	}
	public LocalDate getDataContratacao() {
		return dataContratacao;
	}
	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	public void pedirDemissao() {
		System.out.println("Pediu demissão");
	}
	public void serContratado() {
		System.out.println("Foi contratado");
	}
	@Override
	public String toString() {
		return "Funcionario nome: " + this.getNome() + " , email : "+ this.getEmail() + " , data de nascimento: " + this.getDataNasc() + " , numero de registro: " + this.getNrRegistro() + " , data de contratacao: " +this.getDataContratacao();
	}
	
}
