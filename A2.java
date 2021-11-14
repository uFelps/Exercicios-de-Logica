package exerciciosLogica;

import java.util.Scanner;

public class A2 {
	/*Desenvolvaum programa para ler os lados de um retângulo e calcular a área 
	 * deste retângulo, utilizando a fórmula: ÁREA=LADO1*LADO2.*/

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int area, lado1, lado2;
		
		System.out.println("Digite a medida do primeiro lado em metros:");
		lado1 = leia.nextInt();
		
		System.out.println("Digite a medida do segundo lado em metros:");
		lado2 = leia.nextInt();
		
		area = (lado1*lado2);
		
		System.out.println("A ÁREA DO LOCAL É IGUAL A: "+area+"².");
		

	}

}
