package exerciciosLogica;
/*Desenvolva  um  programa  para  ler  uma  temperatura  em  graus  Centígrados  
 * e  apresentá-la convertida em graus Fahrenheit. A fórmula deconversão 
 * é: F=(9*C+160)/5, onde F é a temperatura em Fahrenheit e C é a temperatura em Centígrados.*/

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float celsius, fahrenheit;
		
		System.out.println("Digite o valor da temperatura em graus centígrados:");
		celsius = leia.nextFloat();
		
		fahrenheit = (9 * celsius + 160)/5;
		
		System.out.println(celsius+"ºC EM FAHRENHEIT É IGUAL A: "+fahrenheit+"ºF");
		
		

	}

}
