package exerciciosLogica;

import java.util.Scanner;

/*K6-)  Desenvolva  um  programa  para  realizar  uma  pesquisa  de  saga  de  filmes.  
O  programa  deverá solicitar  a  opção  de  melhor  saga  de  filme  para  o  usuário.  
As  sagas  concorrentes  são:  Matrix  e Senhor dos Anéis. Ao final o programa deverá 
ndicar qual foi à saga vencedora e o total de votos de  cada  saga.  Se  ocorrer  um  
empate,  o  mesmo  deverá  ser  indicado.  O  programa  deverá  realizar  a pesquisa 
até que a entrada de dados seja finalizada através da variável RESP.*/

public class K6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int voto, contSenhor=0, contMatrix=0, resp=0;
		
		System.out.println("PESQUISA SOBRE A MELHOR SAGA!");
		do {
			System.out.println("\n\nDigite 1 para Senhor dos Anéis. \nDigite 2 para Matrix. \nDigite 3 para Exibir os resultados.");
			voto = leia.nextInt();
			
			switch(voto) {
			case 1://SENHOR DOS ANÉIS
				contSenhor++;
				break;
			case 2://MATRIX
				contMatrix++;
				break;
			case 3://SAIR
				resp = 3;
				break;
			}
		}while(resp!=3);
		
		System.out.println("\n\nPESQUISA ENCERRADA! \nTotal de votos para Senhor dos Anéis: "+contSenhor+"\nTotal de votos para Matrix: "+contMatrix);
		
		if(contSenhor > contMatrix) {
			System.out.println("SENHOR DOS ANÉIS FOI O VENCEDOR!");
		
		}else if(contMatrix > contSenhor) {
			System.out.println("MATRIX FOI O VENCEDOR!");
			
		}else if(contMatrix == contSenhor) {
			System.out.println("OCORREU UM EMPATE!");
		}

	}

}
