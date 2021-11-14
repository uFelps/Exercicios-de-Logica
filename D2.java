package exerciciosLogica;

import java.util.Scanner;

public class D2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1;
		
		System.out.println("DIGITE UM NÚMERO:");
		num1 = leia.nextInt();
		
		if (num1 > 100){
			System.out.println("O NÚMERO "+num1+" É MAIOR QUE 100");
		
		} if (num1 < 100){
			System.out.println("O NÚMERO "+num1+" É MENOR QUE 100");
		
		} if (num1 == 100){
			System.out.println("O NÚMERO "+num1+" É IGUAL A 100");
		}
		

	}

}
