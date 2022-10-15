package animais.pratica.anp;

public class Ave extends Animal{

	public void falar() {
		System.out.println("O "+this.getNome()+" não pode falar,apenas piar!");
	}
	public void voar(int num) {
		if(num==1) {
			System.out.println("O pássaro "+this.getNome()+ " voa");
		}
		else {
		System.out.println("O pássaro "+this.getNome()+" não voa");
		}
	}
}
