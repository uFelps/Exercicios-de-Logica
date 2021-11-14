package exerciciosLogica;

import java.util.Scanner;

public class I4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valorUsuario;
		
		System.out.println("Digite o número que deseja ver a taboada:");
		valorUsuario = leia.nextInt();
		
		for(int vc=1; vc<=10; vc++){
			System.out.println(valorUsuario + " X " + vc + " = " + valorUsuario*vc);
		}

	}

}
