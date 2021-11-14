package exerciciosLogica;

import java.util.Scanner;

public class F4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float bim1, bim2, bim3, bim4, media, notaExame, novaMedia;
		
		System.out.println("DIGITE A NOTA DO ALUNO(A) NO 1º BIMESTRE:");
		bim1 = leia.nextFloat();
		
		System.out.println("DIGITE A NOTA DO ALUNO(A) NO 2º BIMESTRE:");
		bim2 = leia.nextFloat();
		
		System.out.println("DIGITE A NOTA DO ALUNO(A) NO 3º BIMESTRE:");
		bim3 = leia.nextFloat();
		
		System.out.println("DIGITE A NOTA DO ALUNO(A) NO 4º BIMESTRE:");
		bim4 = leia.nextFloat();
		
		media = ((bim1+bim2+bim3+bim4)/4);
		
		if(media>=7){
			System.out.println("Aluno APROVADO com a nota: "+media );
		
		} else{
			System.out.println("\nMédia insuficiente: "+media);
			System.out.println("DIGITE A NOTA DO EXAME:");
			notaExame = leia.nextFloat();
			
			novaMedia = ((media+notaExame)/2);
			
			if (novaMedia>=5){
				System.out.println("\nAluno APROVADO com a nota: "+novaMedia);
			
			} else{
				System.out.println("\nAluno REPROVADO com a nota: "+novaMedia);
			}
		}

	}

}
