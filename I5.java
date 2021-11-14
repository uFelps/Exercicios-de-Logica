package exerciciosLogica;

import java.util.Scanner;

public class I5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		for(int vc=1; vc<=10; vc++){
			double b1, b2, b3, b4, media;
			
			System.out.print("\n\nCalculadora de média \nDigite a nota do 1º Bimestre:");
			b1 = leia.nextDouble();
			System.out.print("Digite a nota do 2º Bimestre:");
			b2 = leia.nextDouble();
			System.out.print("Digite a nota do 3º Bimestre:");
			b3 = leia.nextDouble();
			System.out.print("Digite a nota do 4º Bimestre:");
			b4 = leia.nextDouble();
			
			media = ((b1+b2+b3+b4)/4);
			
			System.out.println("\nMédia do Aluno: "+media);
		}

	}

}
