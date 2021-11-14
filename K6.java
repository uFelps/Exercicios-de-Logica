package exerciciosLogica;

import java.util.Scanner;

/*K6-)  Desenvolva  um  programa  para  realizar  uma  pesquisa  de  saga  de  filmes.  
O  programa  dever� solicitar  a  op��o  de  melhor  saga  de  filme  para  o  usu�rio.  
As  sagas  concorrentes  s�o:  Matrix  e Senhor dos An�is. Ao final o programa dever� 
ndicar qual foi � saga vencedora e o total de votos de  cada  saga.  Se  ocorrer  um  
empate,  o  mesmo  dever�  ser  indicado.  O  programa  dever�  realizar  a pesquisa 
at� que a entrada de dados seja finalizada atrav�s da vari�vel RESP.*/

public class K6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int voto, contSenhor=0, contMatrix=0, resp=0;
		
		System.out.println("PESQUISA SOBRE A MELHOR SAGA!");
		do {
			System.out.println("\n\nDigite 1 para Senhor dos An�is. \nDigite 2 para Matrix. \nDigite 3 para Exibir os resultados.");
			voto = leia.nextInt();
			
			switch(voto) {
			case 1://SENHOR DOS AN�IS
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
		
		System.out.println("\n\nPESQUISA ENCERRADA! \nTotal de votos para Senhor dos An�is: "+contSenhor+"\nTotal de votos para Matrix: "+contMatrix);
		
		if(contSenhor > contMatrix) {
			System.out.println("SENHOR DOS AN�IS FOI O VENCEDOR!");
		
		}else if(contMatrix > contSenhor) {
			System.out.println("MATRIX FOI O VENCEDOR!");
			
		}else if(contMatrix == contSenhor) {
			System.out.println("OCORREU UM EMPATE!");
		}

	}

}
