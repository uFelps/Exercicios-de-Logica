package exerciciosLogica;

import java.util.Scanner;

/*J9-)  Desenvolva  um  programa  para  realizar  uma  pesquisa  de  cursos  
universit�rios  para  uma Universidade. Os  cursos  que  estar�o  na  pesquisa 
s�o: Ci�ncia  da  Computa��o, Direito e  Letras. O programa  dever�  receber  o  
voto  de  cada  entrevistado  e  ao final  dever�  apresentar  a  coloca��o,  o 
total  de  votos  e  o  percentual  de  votos  de  cada  curso.  Os  poss�veis  e
mpates  tamb�m  dever�o  ser verificados.  O  programa  dever�  realizar  a  
pesquisa  enquanto  houver  a  solicita��o  de  uma  nova entrada de dados atrav�s da vari�vel RESP.  */

public class J9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int resp=1, voto, contPessoas=0, contCC=0, contDireito=0, contLetras=0;
		double pCC, pDireito, pLetras;
		
		while(resp == 1) {//INICIO DO LA�O
			contPessoas++;
			System.out.println("\nInforme o curso em que deseja votar: \n1- Ci�ncia da Computa��o \n2-Direito \n3-Letras ");
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
			
			System.out.println("\nDeseja continuar com a pesquisa? \nDigite 1 para SIM. \nDigite qualquer n�mero para n�o.");
			resp = leia.nextInt();	
		}//FIM DO LA�O
		
		pCC = ((contCC*100)/contPessoas); //CALCULO DE PERCENTUAL
		pDireito = ((contDireito*100)/contPessoas);
        pLetras = ((contLetras*100)/contPessoas);
        
        
        if((contCC > contDireito)&&(contDireito > contLetras)) { //VERIFICAR AS COLOCA��ES
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1� Ci�ncia  da  Computa��o.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        	System.out.println("2� Direito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        	System.out.println("3� Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        }
        else if((contCC > contLetras)&&(contLetras > contDireito)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1� Ci�ncia  da  Computa��o.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        	System.out.println("2� Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        	System.out.println("3� Direito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        }
        else if((contDireito > contCC)&&(contCC > contLetras)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1� Direito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        	System.out.println("2� Ci�ncia da Computa��o.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        	System.out.println("3� Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        }
        else if((contDireito > contLetras)&&(contLetras > contCC)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1� Direito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        	System.out.println("2� Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        	System.out.println("3� Ci�ncia da Computa��o.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        }
        else if((contLetras > contDireito)&&(contDireito > contCC)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1� Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        	System.out.println("2� Direito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        	System.out.println("3� Ci�ncia da Computa��o.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        }
        else if((contLetras > contCC)&&(contCC > contDireito)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1� Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        	System.out.println("2� Ci�ncia da Computa��o.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        	System.out.println("3� Direito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        }
        //POSSIBILIDADES DE EMPATES------------------------------------------------------------------------------------------------------
        else if((contCC == contDireito)&&(contDireito == contLetras)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("HOUVE UM EMPATE NO 1� LUGAR. \nCi�ncia  da  Computa��o.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        	System.out.println("Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        	System.out.println("Direito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        }
        else if((contCC > contDireito)&&(contDireito == contLetras)){
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1� Ci�ncia  da  Computa��o.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        	System.out.println("HOUVE UM EMPATE NO 2� LUGAR. \nDireito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        	System.out.println("Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        }
        else if((contDireito > contCC)&&(contCC == contLetras)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1� Direito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        	System.out.println("HOUVE UM EMPATE NO 2� LUGAR. \nCi�ncia da Computa��o.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        	System.out.println("Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        }
        else if((contLetras > contDireito)&&(contDireito == contCC)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1� Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        	System.out.println("HOUVE UM EMPATE NO 2� LUGAR. \nDireito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        	System.out.println("Ci�ncia da Computa��o.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        }
        else if((contCC < contDireito)&&(contDireito == contLetras)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("HOUVE UM EMPATE NO 1� LUGAR. \nLetras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        	System.out.println("Direito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        	System.out.println("2� Ci�ncia da Computa��o.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        }
        else if((contDireito < contCC)&&(contCC == contLetras)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("HOUVE UM EMPATE NO 1� LUGAR. \nCi�ncia  da  Computa��o.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        	System.out.println("Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        	System.out.println("2� Direito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        }
        else if((contLetras < contDireito)&&(contDireito == contCC)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("HOUVE UM EMPATE NO 1� LUGAR. \nDireito.  Votos: "+contDireito + ".  Percentual: "+pDireito+"%");
        	System.out.println("Ci�ncia da Computa��o.  Votos: "+contCC + ".  Percentual: "+pCC+"%");
        	System.out.println("2� Letras.  Votos: "+contLetras + ".  Percentual: "+pLetras+"%");
        }
	}
}
