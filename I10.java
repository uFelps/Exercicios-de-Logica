package exerciciosLogica;

import java.util.Scanner;

public class I10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int Nnumeros, numUsuario, maior=0, menor=2147483647;
		
		System.out.println("Digite o n�mero de valores que ser�o digitados:");
		Nnumeros = leia.nextInt();
		
		for(int vc=1; vc<=Nnumeros; vc++){
			System.out.println("\nDigite um n�mero:");
			numUsuario = leia.nextInt();
			
			if(numUsuario > maior){
				maior = numUsuario;
			
			} else if(numUsuario < menor){
				menor = numUsuario;
			}
		}
		System.out.println("\nMaior n�mero: "+ maior + "\nMenor N�mero: " + menor);
	}

}
