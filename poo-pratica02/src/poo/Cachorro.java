package poo;

public class Cachorro extends Animal{

    public Cachorro() {
		
	}
	public Cachorro(String nome,String raca,Float comprimento,Integer numDePatas,String cor,String ecossistema) {
		this.setNome(nome);
		this.setRaca(raca);
		this.setComprimento(comprimento);
		this.setNumeroDePatas(numDePatas);
		this.setCor(cor);
		this.setEcossistema(ecossistema);
		
	}
	public String late() {
		return "";
	}
	@Override
	public String toString() {
		return "Cachorro nome: " + this.getNome() + " Raça: "+ this.getRaca() + " Comprimento: " + this.getComprimento() +" Numero de patas: " + this.getNumeroDePatas() + " Cor: " +this.getCor()+ " Ecossitema: "+ this.getEcossistema();
	}
}
