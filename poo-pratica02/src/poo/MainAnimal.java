package poo;

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cachorro cachorro= new Cachorro();
        Gato gato = new Gato();
        
        cachorro.setNome("Luna");
        cachorro.setRaca("Pug");
        cachorro.setComprimento(45.0f);
        cachorro.setNumeroDePatas(4);
        cachorro.setCor("Abrico");
        cachorro.setEcossistema("Domestico");
        
        gato.setNome("Mimi");
        gato.setRaca("Siames");
        gato.setComprimento(30.4f);
        gato.setNumeroDePatas(4);
        gato.setCor("Malhado");
        gato.setEcossistema("Domestico");
        
        System.out.println(gato.toString());
        System.out.println(cachorro.toString());
	}

}
