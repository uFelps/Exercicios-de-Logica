package exerciciosLogica;

import java.util.Scanner;

public class F9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int resto1, resto2, num1;
		
		System.out.println("DIGITE UM VALOR");
		num1 = leia.nextInt();
		
		resto1 = (num1 % 4);
		resto2 = (num1 % 5);
		
		if((resto1 == 0)&&(resto2 == 0)){
			System.out.println("O N�mero "+num1+" � divisivel por 4 e 5!");
		
		} else {
			System.out.println("N�o � divis�vel por 4 e 5");
		}
	}

}
