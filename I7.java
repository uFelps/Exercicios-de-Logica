package exerciciosLogica;

import java.util.Scanner;

public class I7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double alunosPartic, somaIdade=0, media;
		
		System.out.println("Digite o n�mero de alunos participantes da pesquisa: ");
		alunosPartic = leia.nextInt();
		
		for(int vc=1; vc<=alunosPartic; vc++){
			double idadeUsuario;
			
			System.out.println("\n"+vc+"� Aluno. \nDigite a sua idade:");
			idadeUsuario = leia.nextDouble();
			
			somaIdade = (somaIdade + idadeUsuario);				
		}
		media = (somaIdade / alunosPartic);
		System.out.println("\nIdade m�dia dos alunos: "+ media);

		

	}

}
