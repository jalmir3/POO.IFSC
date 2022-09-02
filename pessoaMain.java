package lista2;

	import java.util.ArrayList;

	public class pessoaMain {

		public static void main(String[] args) {
			ArrayList<Pessoa> pessoa = new ArrayList<>();
			Pessoa p2 = new Pessoa();
			p2.setNome("Jalmir");
			Pessoa p3 = new Pessoa();
			p3.setNome("Jose");
			Pessoa p4 = new Pessoa();
			p4.setNome("Carlos");
			Pessoa p5 = new Pessoa();
			p5.setNome("Maria");
			Pessoa p6 = new Pessoa();
			p6.setNome("Carla");
		
			pessoa.add(p6);
			pessoa.add(p5);
			pessoa.add(p4);
			pessoa.add(p3);
			pessoa.add(p2);
			
			for (Pessoa pes : pessoa) {
				System.out.println(pes.getNome());
			}
			
			

		}

	}


