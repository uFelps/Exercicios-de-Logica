package exerciciosLogica;

import java.util.Scanner;

public class F3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double bim1, bim2, bim3, bim4, media;
		
		System.out.println("DIGITE A NOTA DO ALUNO(A) NO 1º BIMESTRE:");
		bim1 = leia.nextDouble();
		
		System.out.println("DIGITE A NOTA DO ALUNO(A) NO 2º BIMESTRE:");
		bim2 = leia.nextDouble();
		
		System.out.println("DIGITE A NOTA DO ALUNO(A) NO 3º BIMESTRE:");
		bim3 = leia.nextDouble();
		
		System.out.println("DIGITE A NOTA DO ALUNO(A) NO 4º BIMESTRE:");
		bim4 = leia.nextDouble();
		
		media = (bim1+bim2+bim3+bim4)/4;
		
		if(media>=5){
			System.out.println("\nALUNO APROVADO");
			System.out.println("MÉDIA MÍNIMA PARA SER APROVADO: 5.0");
			System.out.println("MÉDIA DO ALUNO: "+media);
		
		} else {
			System.out.println("\nALUNO REPROVADO");
			System.out.println("MÉDIA MÍNIMA PARA SER APROVADO: 5.0");
			System.out.println("MÉDIA DO ALUNO: "+media);
		}

	}

}
