package animais.pratica.anp;

public class Papagaio extends Ave{

	private String vocabulario;

	public String getVocabulario() {
		return vocabulario;
	}

	public void setVocabulario(String vocabulario) {
		this.vocabulario = vocabulario;
	}
	public void falar() {
		System.out.println(this.getNome()+" = Devido à sua característica de imitar a voz humana, essa espécie de"
				+ " papagaio é um dos temas recorrentes em piadas e charadas no Brasil.");
	}
	
}
