package animais.pratica.anp;

public class Mamifero extends Animal{

	private int velocidade;

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public void correr() {
        System.out.println("A velocidade média do "+this.getNome()+ " é: "+this.velocidade+ " km/h");
	}
}
