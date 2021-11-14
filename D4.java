package exerciciosLogica;

import java.util.Scanner;

public class D4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1, num2, resultado;
		
		System.out.println("DIGITE O PRIMEIRO VALOR:");
		num1 = leia.nextInt();
		
		System.out.println("DIGITE O SEGUNDO VALOR: ");
		num2 = leia.nextInt();
		
		if (num1 > num2){
			resultado = (num1 - num2);
		    System.out.println("A DIFERENÇA ENTRE OS NÚMEROS É: "+resultado);
		
		} if (num2 > num1){
			resultado = (num2 - num1);
			System.out.println("A DIFERENÇA ENTRE OS NÚMEROS É: "+resultado);
		}
	}
	
}
