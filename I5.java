package exerciciosLogica;

import java.util.Scanner;

public class I5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		for(int vc=1; vc<=10; vc++){
			double b1, b2, b3, b4, media;
			
			System.out.print("\n\nCalculadora de m�dia \nDigite a nota do 1� Bimestre:");
			b1 = leia.nextDouble();
			System.out.print("Digite a nota do 2� Bimestre:");
			b2 = leia.nextDouble();
			System.out.print("Digite a nota do 3� Bimestre:");
			b3 = leia.nextDouble();
			System.out.print("Digite a nota do 4� Bimestre:");
			b4 = leia.nextDouble();
			
			media = ((b1+b2+b3+b4)/4);
			
			System.out.println("\nM�dia do Aluno: "+media);
		}

	}

}
