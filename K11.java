package exerciciosLogica;

import java.util.Scanner;

/*K11-) Desenvolva um programa para ler um n�mero e calcular o 
fatorial deste n�mero.Fatorial: F(4) = 4! = 4*3*2*1 = 24F(0) = 0! = 1*/

public class K11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numUsu, fatorial;
		
		System.out.print("Digite um n�mero para ver o fatorial dele: ");
		numUsu = leia.nextInt();
		fatorial = numUsu;
		
		do {
			numUsu--;
			fatorial = (fatorial * numUsu);
		}while(numUsu>1);
		
		System.out.println("O FATORIAL DO N�MERO ESCOLHIDO �: "+fatorial);
		

	}

}
