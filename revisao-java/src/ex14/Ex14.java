package ex14;

import java.util.Scanner;

public class Ex14 {
	public static double soma1 (double p,double eci,double pgs1,double pgs2){
		double total=0;
		    for(int i=0;i<1;i++) {
				for(int j=0;j<4;j++) {
					total=(p*0.5)+(eci*0.25)+(pgs1*0.125)+(pgs2*0.125);
					
	  }
	}
		    return total;
}
	public static double soma2 (double p,double eci,double pgs1,double pgs2){
		double total=0;
		    for(int i=1;i<2;i++) {
				for(int j=0;j<4;j++) {
					total=(p*0.5)+(eci*0.30)+(pgs1*0.10)+(pgs2*0.10);
					
	  }
	}
		    return total;
}
	public static double soma3 (double p,double eci,double pgs1,double pgs2){
		double total=0;
		    for(int i=2;i<3;i++) {
				for(int j=0;j<4;j++) {
					total=(p*0.5)+(eci*0.30)+(pgs1*0.05)+(pgs2*0.05);
					
	  }
	}
		    return total;
}
	public static double verificaMedia(double total,String nome) {
		double media=total/3;
		System.out.println("Aluno:" + nome +"/media="+ media);
		if(media>=6) {
			System.out.println("Aprovado");
		}
		else if(media>=4 && media<6) {
			System.out.println("Recuperação");
		}
		else {
			System.out.println("Reprovado");
		}
		return media;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		double p[] = new double[3];
		double eci[] = new double[3];
		double pgs1[] = new double[3];
		double pgs2[] = new double[3];
		double total=0;
	
		System.out.println("Escreva o nome do aluno:");
		nome = sc.next();

		for (int i = 0; i < 3; i++) {
				System.out.println("Digite a " + (i + 1) + "º nota  da avaliacao P ");
				p[i] = sc.nextDouble();
				while (p[i] < 0 || p[i] > 10) {
					System.out.println("Digite a " + (i + 1) + "º nota  da avaliacao P ");
					p[i] = sc.nextDouble();
				}
				System.out.println("Digite a " + (i + 1) + "º nota  da avaliacao ECI ");
				eci[i] = sc.nextDouble();
				while (eci[i] < 0 || eci[i] > 10) {
					System.out.println("Digite a " + (i + 1) + "º nota  da avaliacao ECI ");
					eci[i] = sc.nextDouble();
				}
				System.out.println("Digite a " + (i + 1) + "º nota  da avaliacao PGS1 ");
				pgs1[i] = sc.nextDouble();
				while (pgs1[i] < 0 || pgs1[i] > 10) {
					System.out.println("Digite a " + (i + 1) + "º nota  da avaliacao PGS1 ");
					pgs1[i] = sc.nextDouble();
				}
				System.out.println("Digite a " + (i + 1) + "º nota  da avaliacao PGS2 ");
				pgs2[i] = sc.nextDouble();
				while (pgs2[i] < 0 || pgs2[i] > 10) {
					System.out.println("Digite a " + (i + 1) + "º nota  da avaliacao PGS2 ");
					pgs2[i] = sc.nextDouble();
				}
				total= soma1(p[i],eci[i],pgs1[i],pgs2[i])+soma2(p[i],eci[i],pgs1[i],pgs2[i])+soma3(p[i],eci[i],pgs1[i],pgs2[i]);
			}
		
		verificaMedia(total,nome);
     
	}
}
