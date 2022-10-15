package animais.pratica.anp;

public class MainAnimal {

	public static void main(String[] args) {
		BemTeVi bemTV = new BemTeVi();
		bemTV.setClasse("Aves");
		bemTV.setNome("Pitangus sulphuratus");
		bemTV.imprime();
		bemTV.voar(1);
		bemTV.falar();
		System.out.println();

		Papagaio loro = new Papagaio();
		loro.setClasse("Aves");
		loro.setNome("Amazona aestiva");
		loro.setVocabulario("diversos");
		loro.imprime();
		loro.voar(1);
		loro.falar();
		System.out.println("Vocabulário: " + loro.getVocabulario());
		System.out.println();

		Vaca jersey = new Vaca();
		jersey.setClasse("Mamiferos");
		jersey.setNome("Bos taurus");
		jersey.setPermiteOrdenha(true);
		jersey.setVelocidade(10);
		jersey.imprime();
		jersey.falar();
		jersey.correr();
		jersey.isPermiteOrdenha();
		System.out.println();

		Cachorro pug = new Cachorro();
		pug.setClasse("Mamiferos");
		pug.setNome("Canis familiaris");
		pug.setTipoLatido(true);
		pug.setVelocidade(15);
		pug.imprime();
		pug.falar();
		pug.correr();
		pug.setLateAlto();
		pug.setLateBaixo();

	}

}
