package exerciciosLogica;

import java.util.Scanner;

/*J10-)  Desenvolva  um  programa  para  realizar  uma  pesquisa  de  mercado  
sobre  os  automóveis: CORSA, PALIO e GOL. O programa deverá receber o voto de 
cada entrevistado e ao final deverá apresentar  a  colocação,  o  total  de  
votos  e  o  percentual  de  votos  de  cada  automóvel.  Os  possíveis empates 
também deverão ser verificados. O programa deverá realizar a pesquisa enquanto 
houver a solicitação de uma nova entrada de dados através da variável RESP.*/

public class J10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int resp=1, voto, contPessoas=0, contCorsa=0, contPalio=0, contGol=0;
		double pCorsa, pPalio, pGol;
		while(resp == 1) {//INICIO DO LAÇO
			contPessoas++;
			System.out.println("\nInforme o carro em que deseja votar: \n1- Corsa \n2-Palio \n3-Gol ");
			voto = leia.nextInt();
			
			switch (voto) {//SWITCH PARA DIRECIONAR O VOTO
			case 1:
				contCorsa++;
			break;
			
			case 2:
				contPalio++;
			break;
			
			case 3:
				contGol++;
			break;
			}
			System.out.println("\nDeseja continuar com a pesquisa? \nDigite 1 para SIM. \nDigite qualquer número para não.");
			resp = leia.nextInt();	
		}//FIM DO LAÇO
		
		pCorsa = ((contCorsa*100)/contPessoas); //CALCULO DE PERCENTUAL
		pPalio = ((contPalio*100)/contPessoas);
        pGol = ((contGol*100)/contPessoas);
        
        
        if((contCorsa > contPalio)&&(contPalio > contGol)) { //VERIFICAR AS COLOCAÇÕES
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1º Corsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        	System.out.println("2º Palio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        	System.out.println("3º Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        }
        else if((contCorsa > contGol)&&(contGol > contPalio)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1º Corsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        	System.out.println("2º Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        	System.out.println("3º Palio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        }
        else if((contPalio > contCorsa)&&(contCorsa > contGol)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1º Palio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        	System.out.println("2º Corsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        	System.out.println("3º Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        }
        else if((contPalio > contGol)&&(contGol > contCorsa)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1º Palio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        	System.out.println("2º Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        	System.out.println("3º Corsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        }
        else if((contGol > contPalio)&&(contPalio > contCorsa)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1º Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        	System.out.println("2º Palio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        	System.out.println("3º Corsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        }
        else if((contGol > contCorsa)&&(contCorsa > contPalio)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1º Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        	System.out.println("2º Corsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        	System.out.println("3º Palio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        }
        
      //POSSIBILIDADES DE EMPATES------------------------------------------------------------------------------------------------------
        else if((contCorsa == contPalio)&&(contPalio == contGol)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("HOUVE UM EMPATE NO 1º LUGAR. \nCorsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        	System.out.println("Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        	System.out.println("Palio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        }
        else if((contCorsa > contPalio)&&(contPalio == contGol)){
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1º Corsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        	System.out.println("HOUVE UM EMPATE NO 2º LUGAR. \nPalio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        	System.out.println("Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        }
        else if((contPalio > contCorsa)&&(contCorsa == contGol)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1º Palio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        	System.out.println("HOUVE UM EMPATE NO 2º LUGAR. \nCorsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        	System.out.println("Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        }
        else if((contGol > contPalio)&&(contPalio == contCorsa)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1º Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        	System.out.println("HOUVE UM EMPATE NO 2º LUGAR. \nPalio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        	System.out.println("Corsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        }
        else if((contCorsa < contPalio)&&(contPalio == contGol)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("HOUVE UM EMPATE NO 1º LUGAR. \nGol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        	System.out.println("Palio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        	System.out.println("2º Corsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        }
        else if((contPalio < contCorsa)&&(contCorsa == contGol)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("HOUVE UM EMPATE NO 1º LUGAR. \nCorsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        	System.out.println("Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        	System.out.println("2º Palio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        }
        else if((contGol < contPalio)&&(contPalio == contCorsa)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("HOUVE UM EMPATE NO 1º LUGAR. \nPalio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        	System.out.println("Corsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        	System.out.println("2º Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        }
	}
}