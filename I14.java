package exerciciosLogica;

import java.util.Scanner;

public class I14 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numUsu, fatorial=1;
		
		System.out.println("Digite um número para ver o fatorial dele: ");
		numUsu = leia.nextInt();
		
		for(int vc=numUsu; vc>=1; vc--){
			fatorial = (fatorial * vc );
			
		}
		System.out.println(fatorial);

	}

}
