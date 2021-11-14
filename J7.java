package exerciciosLogica;

import java.util.Scanner;

/*J7-)  Desenvolvaum  programa  para  realizar  uma  pesquisa  de  saga  de  filmes.  
O  programa  deverá solicitar  a  opção  de  melhor  saga  de  filme  para  o  usuário.  
As  sagas  concorrentes  são:  Matrix  e Senhor dos Anéis. Ao final o programa deverá 
indicar qual foi à saga vencedora e o total de votos de  cada  saga.  Se  ocorrer  um  
empate,  o  mesmo  deverá  ser  indicado.  O  programa  deverá  realizar  a pesquisa 
enquanto houver a solicitação de uma nova entrada de dados através da variável RESP.   */

public class J7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int resp=1, voto, contMatrix=0, contSenhor=0;
		
		while(resp == 1) {
			System.out.println("\nPesquisa sobre a melhor saga. \nDigite 1 para MATRIX. \nDigite 2 para SENHOR DOS ANÉIS.");
			voto = leia.nextInt();
			
			if(voto == 1) {
				contMatrix++;
			
			} else if(voto == 2) {
				contSenhor++;
			}
			
			System.out.println("\nDeseja continuar com a pesquisa? \nDigite 1 para SIM. \nDigite qualquer número para NÃO.");
			resp = leia.nextInt();
		}
		if(contMatrix > contSenhor) {
			System.out.println("\nA saga vencedora foi Matrix! \nVotos para Matrix: "+contMatrix + "\nVotos para Senhor dos Anéis: "+contSenhor);
		
		} else if(contSenhor > contMatrix) {
			System.out.println("\nA saga vencedora foi Senhor dos Anéis! \nVotos para Matrix: "+contMatrix + "\nVotos para Senhor dos Anéis: "+contSenhor);
		
		} else if(contSenhor == contMatrix) {
			System.out.println("\nOcorreu um empate! \nVotos para Matrix: "+contMatrix + "\nVotos para Senhor dos Anéis: "+contSenhor);
		}

	}

}
