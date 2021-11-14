package exerciciosLogica;

import java.util.Scanner;

public class I6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double media, contAprovados=0;
		
		for(int vc=1; vc<=20; vc++){
			
			System.out.println("\n\nDigite a média do aluno:");
			media = leia.nextDouble();
			
			if(media >= 6){
				contAprovados++;
				System.out.println("Aluno Aprovado!");
				
			} else{
				System.out.println("Aluno Reprovado!");
			}
			
		}
		System.out.println("\nQuantidade de Alunos Aprovados: "+contAprovados);

	}

}
