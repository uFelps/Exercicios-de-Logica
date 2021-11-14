package exerciciosLogica;

import java.util.Scanner;

/*J9-)  Desenvolva  um  programa  para  realizar  uma  pesquisa  de  cursos  
universitários  para  uma Universidade. Os  cursos  que  estarão  na  pesquisa 
são: Ciência  da  Computação, Direito e  Letras. O programa  deverá  receber  o  
voto  de  cada  entrevistado  e  ao final  deverá  apresentar  a  colocação,  o 
total  de  votos  e  o  percentual  de  votos  de  cada  curso.  Os  possíveis  e
mpates  também  deverão  ser verificados.  O  programa  deverá  realizar  a  
pesquisa  enquanto  houver  a  solicitação  de  uma  nova entrada de dados através da variável RESP.  */

public class J9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int resp=1, voto, contPessoas=0, contCC=0, contDireito=0, contLetras=0;
		double pCC, pDireito, pLetras;
		
		while(resp == 1) {//INICIO DO LAÇO
			contPessoas++;
			System.out.println("\nInforme o curso em que deseja votar: \n1- Ciência da Computação \n2-Direito \n3-Letras ");
			voto = leia.nextInt();
			
			switch (voto) {//SWITCH PARA DIRECIONAR O VOTO
			case 1:
				contCC++;
			break;
			
			case 2:
				contDireito++;
			break;
			
			case 3:
				contLetras++;
			break;
			}
			
			System.out.println("\nDeseja continuar com a pesquisa? \nDigite 1 para SIM. \nDigite qualquer número para não.");
			resp = leia.nextInt();	
		}//FIM DO LAÇO
		
		pCC = ((contCC*100)/contPessoas); //CALCULO DE PERCENTUAL
		pDireito = ((contDireito*100)/contPessoas);
        pLetras = ((contLetras*100)/contPessoas);
        
        
        if((contCC > contDireito)&&(contDireito > contLetras)) { //VERIFICAR AS COLOCAÇÕES
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1º Ciência  da  Computação.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        	System.out.println("2º Direito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        	System.out.println("3º Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        }
        else if((contCC > contLetras)&&(contLetras > contDireito)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1º Ciência  da  Computação.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        	System.out.println("2º Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        	System.out.println("3º Direito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        }
        else if((contDireito > contCC)&&(contCC > contLetras)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1º Direito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        	System.out.println("2º Ciência da Computação.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        	System.out.println("3º Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        }
        else if((contDireito > contLetras)&&(contLetras > contCC)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1º Direito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        	System.out.println("2º Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        	System.out.println("3º Ciência da Computação.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        }
        else if((contLetras > contDireito)&&(contDireito > contCC)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1º Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        	System.out.println("2º Direito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        	System.out.println("3º Ciência da Computação.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        }
        else if((contLetras > contCC)&&(contCC > contDireito)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1º Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        	System.out.println("2º Ciência da Computação.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        	System.out.println("3º Direito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        }
        //POSSIBILIDADES DE EMPATES------------------------------------------------------------------------------------------------------
        else if((contCC == contDireito)&&(contDireito == contLetras)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("HOUVE UM EMPATE NO 1º LUGAR. \nCiência  da  Computação.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        	System.out.println("Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        	System.out.println("Direito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        }
        else if((contCC > contDireito)&&(contDireito == contLetras)){
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1º Ciência  da  Computação.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        	System.out.println("HOUVE UM EMPATE NO 2º LUGAR. \nDireito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        	System.out.println("Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        }
        else if((contDireito > contCC)&&(contCC == contLetras)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1º Direito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        	System.out.println("HOUVE UM EMPATE NO 2º LUGAR. \nCiência da Computação.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        	System.out.println("Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        }
        else if((contLetras > contDireito)&&(contDireito == contCC)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1º Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        	System.out.println("HOUVE UM EMPATE NO 2º LUGAR. \nDireito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        	System.out.println("Ciência da Computação.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        }
        else if((contCC < contDireito)&&(contDireito == contLetras)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("HOUVE UM EMPATE NO 1º LUGAR. \nLetras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        	System.out.println("Direito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        	System.out.println("2º Ciência da Computação.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        }
        else if((contDireito < contCC)&&(contCC == contLetras)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("HOUVE UM EMPATE NO 1º LUGAR. \nCiência  da  Computação.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        	System.out.println("Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        	System.out.println("2º Direito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        }
        else if((contLetras < contDireito)&&(contDireito == contCC)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("HOUVE UM EMPATE NO 1º LUGAR. \nDireito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        	System.out.println("Ciência da Computação.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        	System.out.println("2º Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        }
	}
}
