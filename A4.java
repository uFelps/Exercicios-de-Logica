package exerciciosLogica;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
/* Desenvolva  um programa para  ler o raio e a  altura  de  uma  lata  de  �leo e 
 * calcular o valor do seu volume, utilizando a f�rmula: VOLUME=3.14159*R*R*ALTURA.*/
		Scanner leia = new Scanner(System.in);
		
		double volume, raio, altura;
		
		System.out.println("QUAL � O RAIO DA LATA?");
		raio = leia.nextFloat();
		
		System.out.println("QUAL � A ALTURA DA LATA?");
		altura = leia.nextFloat();
		
		volume =(3.14159*raio*raio*altura);
		
		System.out.println("O VOLUME DA SUA LATA � IGUAL A: "+volume);
		

	}

}
