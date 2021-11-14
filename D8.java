package exerciciosLogica;

import java.util.Scanner;

public class D8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double num1, num2, divisao;
		
		System.out.println("DIGITE O PRIMEIRO VALOR:");
		num1 = leia.nextDouble();
		
		System.out.println("DIGITE O SEGUNDO VALOR:");
		num2 = leia.nextDouble();
		
		if (num1 > num2){
			divisao = (num1/num2);
			System.out.println(num1+" DIVIDIDO POR "+num2+" É IGUAL A "+divisao);
		
		} if (num2 > num1){
			divisao = (num2/num1);
			System.out.println(num2+" DIVIDIDO POR "+num1+" É IGUAL A "+divisao);
		}

	}

}
