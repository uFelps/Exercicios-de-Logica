package exerciciosLogica;

import java.util.Scanner;

/*J11-) Desenvolva um programa para ler um número e calcular o 
fatorial deste número.Fatorial: F(4) = 4! = 4*3*2*1 = 24
                                F(0) = 0! = 1                  */

public class J11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numUsu, fatorial=1;
		
		System.out.println("Digite um número para ver o fatorial dele:");
		numUsu = leia.nextInt();
		
		while(numUsu>=1) {
			fatorial = (fatorial * numUsu);
			numUsu--;
		}
		System.out.println("Resultado: "+fatorial);

	}

}
