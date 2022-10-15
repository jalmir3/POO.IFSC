package animais.pratica.anp;

public class Cachorro extends Mamifero{

	private boolean tipoLatido;

	public boolean isTipoLatido() {
		return tipoLatido;
	}

	public void setTipoLatido(boolean tipoLatido) {
		this.tipoLatido = tipoLatido;
	}
	public void setLateBaixo() {
		if(this.tipoLatido==true) {
			System.out.println("O "+this.getNome()+ " late baixo");
		}
		
	}
	public void setLateAlto() {
		if(this.tipoLatido==false) {
			System.out.println("O "+this.getNome()+ " late alto");
		}
		
	}
	public void falar() {
		System.out.println("O "+this.getNome()+" não pode falar,apenas latir!");
	}
}
