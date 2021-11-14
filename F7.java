package exerciciosLogica;

import java.util.Scanner;

public class F7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float a, b, c;
		
		System.out.println("Defina um valor para 'A'");
		a = leia.nextFloat();
		System.out.println("Defina um valor para 'B'");
		b = leia.nextFloat();
		System.out.println("Defina um valor para 'C'");
		c = leia.nextFloat();
		
		if((a+b > c)&&(a+c > b)&&(b+c > a)){
			System.out.println("Os 3 valores formam um triângulo!");
			
			if((a == b)&&(b == c)){
				System.out.println("Triângulo equilátero: 3 lados iguais");
			
			} else{
				if((a == b)||(a == c)||(b == c)){
					System.out.println("Triângulo isósceles: 2 lados iguais");
				
				} else{
					System.out.println("Triângulo escaleno: 3 lados diferentes");
				}
			}
		
		} else{
			System.out.println("Os 3 valores NÃO formam um triângulo!");
		}
	}

}
