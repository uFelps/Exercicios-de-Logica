package exerciciosLogica;

import java.util.Scanner;

public class F3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double bim1, bim2, bim3, bim4, media;
		
		System.out.println("DIGITE A NOTA DO ALUNO(A) NO 1� BIMESTRE:");
		bim1 = leia.nextDouble();
		
		System.out.println("DIGITE A NOTA DO ALUNO(A) NO 2� BIMESTRE:");
		bim2 = leia.nextDouble();
		
		System.out.println("DIGITE A NOTA DO ALUNO(A) NO 3� BIMESTRE:");
		bim3 = leia.nextDouble();
		
		System.out.println("DIGITE A NOTA DO ALUNO(A) NO 4� BIMESTRE:");
		bim4 = leia.nextDouble();
		
		media = (bim1+bim2+bim3+bim4)/4;
		
		if(media>=5){
			System.out.println("\nALUNO APROVADO");
			System.out.println("M�DIA M�NIMA PARA SER APROVADO: 5.0");
			System.out.println("M�DIA DO ALUNO: "+media);
		
		} else {
			System.out.println("\nALUNO REPROVADO");
			System.out.println("M�DIA M�NIMA PARA SER APROVADO: 5.0");
			System.out.println("M�DIA DO ALUNO: "+media);
		}

	}

}
