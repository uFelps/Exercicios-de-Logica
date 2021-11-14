package exerciciosLogica;

import java.util.Scanner;

/*J3-)  Desenvolva  um  programa  para  uma  empresa  fazer  um  pesquisa  
de  mercado  para  saber  se  as pessoas  gostaram  ou  não  de  um  novo  
produto  lançado  no  mercado.  Para  isso, o  programa  deverá solicitar 
o sexo do entrevistado e sua resposta (sim ou não). O programa deverá 
realizar a pesquisa enquanto houver a solicitação de uma nova entrada de 
dados através da variável RESP. Ao final o programa deverá apresentar os 
seguintes resultados:
   -O número de pessoas que responderam sim;
   -O número de pessoas que responderam não;
   -A porcentagem de pessoas do sexo feminino que responderam sim;
   -A porcentagem de pessoas do sexo masculino que responderam não.   */

public class J3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int resp=1, sexoUsu, respostaUsu, contSim=0, contNao=0, contFemSim=0, contMasNao=0;
		double pFemSim, pMasNao;
		
		while(resp == 1) {
			
			System.out.println("\nInfome o seu sexo. \nDigite 1 para MASCULINO. \nDigite 2 para FEMININO.");
			sexoUsu = leia.nextInt();
			System.out.println("\nO usuário gostou do produto? \nDigite 1 para SIM. \nDigite 2 para NÃO.");
			respostaUsu = leia.nextInt();
			
			if(respostaUsu == 1) {//GOSTOU
				contSim++;
				if(sexoUsu == 2) {//GOSTOU/MULHER
					contFemSim++;
				}
				
			} else if(respostaUsu == 2) {//NÃO GOSTOU
				contNao++;
				if(sexoUsu == 1) {//NÃO GOSTOU / MASCULINO
					contMasNao++;
				}
			}
			
			System.out.println("\nDeseja continuar com a pesquisa? \nDigite 1 para SIM. \nDigite qualquer número para NÃO.");
			resp = leia.nextInt();
		}
		
		pFemSim = ((contFemSim*100)/contSim);
		pMasNao = ((contMasNao*100)/contNao);
		
		System.out.println("O número de pessoas que responderam sim: " + contSim);
		System.out.println("O número de pessoas que responderam não: " + contNao);
		System.out.println("A porcentagem de pessoas do sexo feminino que responderam sim: " + pFemSim + "%");
		System.out.println("A porcentagem de pessoas do sexo masculino que responderam não: "+ pMasNao + "%");
	}

}
