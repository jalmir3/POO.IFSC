package poo;

public class Aluno extends Pessoa{

	private Long matricula;

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	 @Override
	    public String toString() {
	        return this.getNome();
	    }
	
}
