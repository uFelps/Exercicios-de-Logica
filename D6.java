package exerciciosLogica;

import java.util.Scanner;

public class D6 {

	public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
	   int num1 = 0;
		
		System.out.println("DIGITE UM NÚMERO DE 0 A 10:");
		num1 = leia.nextInt();
		
		if (num1 == 1){
			System.out.println("1 - UM");
		
		} if (num1 == 2){
			System.out.println("2 - DOIS");
		
		} if (num1 == 3){
			System.out.println("3 - TRÊS");
			
		} if (num1 == 4){
			System.out.println("4 - QUATRO");
		
		} if (num1 == 5){
			System.out.println("5 - CINCO");
		
		} if (num1== 6){
			System.out.println("6 - SEIS");
			
		} if (num1 == 7){
			System.out.println("7 - SETE");
		
		} if (num1 == 8){
			System.out.println("8 - OITO");
		
		} if (num1 == 9){
			System.out.println("9 - NOVE");
			
		} if (num1 == 10){
			System.out.println("10 - DEZ");
		}

	}

}
