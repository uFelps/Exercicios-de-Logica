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
			System.out.println("O N�MERO "+num1+ " � MAIOR QUE O N�MERO "+num2);
		
		} if (num2 > num1){
			System.out.println("O N�MERO "+num1+ " � MENOR QUE O N�MERO "+num2);
		
		} if (num1 == num2){
			System.out.println("OS N�MEROS "+num1+" E "+num2+" S�O IGUAIS.");
		}
		
	}

}
