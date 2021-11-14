package exerciciosLogica;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
/* Desenvolva  um programa para  ler o raio e a  altura  de  uma  lata  de  óleo e 
 * calcular o valor do seu volume, utilizando a fórmula: VOLUME=3.14159*R*R*ALTURA.*/
		Scanner leia = new Scanner(System.in);
		
		double volume, raio, altura;
		
		System.out.println("QUAL É O RAIO DA LATA?");
		raio = leia.nextFloat();
		
		System.out.println("QUAL É A ALTURA DA LATA?");
		altura = leia.nextFloat();
		
		volume =(3.14159*raio*raio*altura);
		
		System.out.println("O VOLUME DA SUA LATA É IGUAL A: "+volume);
		

	}

}
