package animais.pratica.anp;

public class Vaca extends Mamifero{

	private boolean permiteOrdenha;

	public boolean isPermiteOrdenha() {
		return permiteOrdenha;
	}

	public void setPermiteOrdenha(boolean permiteOrdenha) {
		this.permiteOrdenha = permiteOrdenha;
	}
	public void ordenhar() {
		if(this.permiteOrdenha==true) {
			System.out.println("Permite ser ordenhada");
		}
		else{
			System.out.println("Não permite ser ordenhada");
		}
	}
	public void falar() {
		System.out.println("O "+this.getNome()+" não pode falar,apenas mugir!");
	}
	
}
