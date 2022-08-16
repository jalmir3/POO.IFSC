package ex4;

public class Ex4 {

	public static void main(String[] args) {
		String a="Jose";
		String b="Jose";
		
		if(a.equals(b)) {
			System.out.println("Metodo equals pode ser usado");
		}
        if(a.equalsIgnoreCase(b)) {
        	System.out.println("Metodo equalsIgnoreCase pode ser usado");
        }
        if(a==b) {
        	System.out.println("Metodo == pode ser usado");
        }
	}

}
