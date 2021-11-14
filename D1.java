package exerciciosLogica;

import java.util.Scanner;

public class D1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("DIGITE O PRIMEIRO VALOR:");
		num1 = leia.nextInt();
		
		System.out.println("DIGITE O SEGUNDO VALOR:");
		num2 = leia.nextInt();
		
		if (num1 > num2){
			System.out.println("O NÚMERO "+num1+ " É MAIOR QUE O NÚMERO "+num2);
		
		} if (num2 > num1){
			System.out.println("O NÚMERO "+num1+ " É MENOR QUE O NÚMERO "+num2);
		
		} if (num1 == num2){
			System.out.println("OS NÚMEROS "+num1+" E "+num2+" SÃO IGUAIS.");
		}
		
	}

}
