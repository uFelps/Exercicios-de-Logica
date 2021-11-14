package exerciciosLogica;

import java.util.Scanner;

/*J3-)  Desenvolva  um  programa  para  uma  empresa  fazer  um  pesquisa  
de  mercado  para  saber  se  as pessoas  gostaram  ou  n�o  de  um  novo  
produto  lan�ado  no  mercado.  Para  isso, o  programa  dever� solicitar 
o sexo do entrevistado e sua resposta (sim ou n�o). O programa dever� 
realizar a pesquisa enquanto houver a solicita��o de uma nova entrada de 
dados atrav�s da vari�vel RESP. Ao final o programa dever� apresentar os 
seguintes resultados:
   -O n�mero de pessoas que responderam sim;
   -O n�mero de pessoas que responderam n�o;
   -A porcentagem de pessoas do sexo feminino que responderam sim;
   -A porcentagem de pessoas do sexo masculino que responderam n�o.   */

public class J3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int resp=1, sexoUsu, respostaUsu, contSim=0, contNao=0, contFemSim=0, contMasNao=0;
		double pFemSim, pMasNao;
		
		while(resp == 1) {
			
			System.out.println("\nInfome o seu sexo. \nDigite 1 para MASCULINO. \nDigite 2 para FEMININO.");
			sexoUsu = leia.nextInt();
			System.out.println("\nO usu�rio gostou do produto? \nDigite 1 para SIM. \nDigite 2 para N�O.");
			respostaUsu = leia.nextInt();
			
			if(respostaUsu == 1) {//GOSTOU
				contSim++;
				if(sexoUsu == 2) {//GOSTOU/MULHER
					contFemSim++;
				}
				
			} else if(respostaUsu == 2) {//N�O GOSTOU
				contNao++;
				if(sexoUsu == 1) {//N�O GOSTOU / MASCULINO
					contMasNao++;
				}
			}
			
			System.out.println("\nDeseja continuar com a pesquisa? \nDigite 1 para SIM. \nDigite qualquer n�mero para N�O.");
			resp = leia.nextInt();
		}
		
		pFemSim = ((contFemSim*100)/contSim);
		pMasNao = ((contMasNao*100)/contNao);
		
		System.out.println("O n�mero de pessoas que responderam sim: " + contSim);
		System.out.println("O n�mero de pessoas que responderam n�o: " + contNao);
		System.out.println("A porcentagem de pessoas do sexo feminino que responderam sim: " + pFemSim + "%");
		System.out.println("A porcentagem de pessoas do sexo masculino que responderam n�o: "+ pMasNao + "%");
	}

}
