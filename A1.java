package exerciciosLogica;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3, num4, media;
		
		System.out.println("Digite o primerio valor:");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo valor:");
		num2 = leia.nextInt();
		
		System.out.println("Digite o terceiro valor:");
		num3 = leia.nextInt();
		
		System.out.println("Digite o quarto valor:");
		num4 = leia.nextInt();
		
		media = (num1 + num2 + num3 + num4)/4;
				
		System.out.println("A média dos valores é igual a: "+media);		

	}

}
