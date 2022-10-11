package com.poo.pratica.revisão.p2;

public class Cliente extends Pessoa{

	private Integer nrConta;
	private Double saldo;
	
	public Integer getNrConta() {
		return nrConta;
	}
	public void setNrConta(Integer nrConta) {
		this.nrConta = nrConta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Double sacar(Double valor) {
		if(this.saldo<valor) {
			System.out.println("Saldo insuficiente para saque");
		}
		else {
		System.out.println("Saque realizado com sucesso");
		this.saldo=this.saldo-valor;}
		return valor;
	}
    public Double depositar(Double valor) {
		return this.saldo=this.saldo + valor;
	}
    public Double mostrarSaldo() {
    	return this.saldo;
		
	}
    @Override
	public String toString() {
		return "Cliente nome: " + this.getNome() + " , email : " + this.getEmail() + " , data de nascimento: " + this.getDataNasc() + " , numero da conta: " + this.getNrConta() + " , saldo: " +this.getSaldo();
	}
	
}
