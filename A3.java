package exerciciosLogica;
/*Desenvolva  um  programa  para  ler  uma  temperatura  em  graus  Cent�grados  
 * e  apresent�-la convertida em graus Fahrenheit. A f�rmula deconvers�o 
 * �: F=(9*C+160)/5, onde F � a temperatura em Fahrenheit e C � a temperatura em Cent�grados.*/

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float celsius, fahrenheit;
		
		System.out.println("Digite o valor da temperatura em graus cent�grados:");
		celsius = leia.nextFloat();
		
		fahrenheit = (9 * celsius + 160)/5;
		
		System.out.println(celsius+"�C EM FAHRENHEIT � IGUAL A: "+fahrenheit+"�F");
		
		

	}

}
