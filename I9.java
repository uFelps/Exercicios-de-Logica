package exerciciosLogica;

import java.util.Scanner;

public class I9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valorUsuario, contMatrix=0, contSenhorAneis=0;
		
		for(int vc=1; vc<=20; vc++){
			System.out.println("\nPesquisa de melhor saga de filmes. \nDigite 1 para Matrix. \nDigite 2 para Senhor dos Aneis.");
			valorUsuario = leia.nextInt();
			
			if(valorUsuario == 1){//MATRIX
				contMatrix++;
			
			} else if(valorUsuario == 2){//SENHOR DOS ANEIS
				contSenhorAneis++;		
			}
		}
		if(contMatrix > contSenhorAneis){
			System.out.println("\nO vencedor foi Matrix. \nVotos Matrix: "+contMatrix+" \nVotos Senhor dos Aneis: "+contSenhorAneis);
		
		} else if(contSenhorAneis > contMatrix){
			System.out.println("\nO vencedor foi Senhor dos Aneis. \nVotos Matrix: "+contMatrix+" \nVotos Senhor dos Aneis: "+contSenhorAneis);
		
		} else{
			System.out.println("\nOcorreu um empate na votação!. \nVotos Matrix: "+contMatrix+" \nVotos Senhor dos Aneis: "+contSenhorAneis);
		}

	}

}
