package exerciciosLogica;

import java.util.Scanner;

public class D7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1;
		
		System.out.println("DIGITE UM VALOR:");
		num1 = leia.nextInt();
		
		if(num1 < 5){
			System.out.println("O NÚMERO "+num1+" É MENOR QUE 5");
		
		} if (num1 > 10){
			System.out.println("O NÚMERO "+num1+" É MAIOR QUE 10");
		
		} if ((num1 > 5) && (num1 < 10)){
			System.out.println("O NÚMERO "+num1+" ESTÁ ENTRE 5 E 10");
		}

	}

}
