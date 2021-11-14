package exerciciosLogica;

import java.util.Scanner;

public class I10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int Nnumeros, numUsuario, maior=0, menor=2147483647;
		
		System.out.println("Digite o número de valores que serão digitados:");
		Nnumeros = leia.nextInt();
		
		for(int vc=1; vc<=Nnumeros; vc++){
			System.out.println("\nDigite um número:");
			numUsuario = leia.nextInt();
			
			if(numUsuario > maior){
				maior = numUsuario;
			
			} else if(numUsuario < menor){
				menor = numUsuario;
			}
		}
		System.out.println("\nMaior número: "+ maior + "\nMenor Número: " + menor);
	}

}
