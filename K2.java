package exerciciosLogica;

import java.util.Scanner;

/*K2-)  Desenvolva  um  programa  para  uma  empresa  fazer  um  pesquisa  
de  mercado  para  saber  se  as pessoas  gostaram  ou  n�o  de  um  novo  
produto  lan�ado  no  mercado.  Para  isso,  o  programa  dever� solicitar 
o sexo do entrevistado e sua resposta (sim ou n�o). O programa dever� realizar 
a pesquisa at�  que  a  entrada  de  dados  seja  finalizada  atrav�s  da  vari�vel  RESP.  
Ao  final  o  programa  dever� apresentar os seguintes resultados:
  -O total de pessoas que responderam sim;
  -O total de pessoas que foram entrevistadas;
  -A porcentagem de pessoas do sexo feminino que responderam n�o;
  -A porcentagem de pessoas do sexo masculino que responderam sim.      */

public class K2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int sexoUsu, respostaUsu, resp=1, contSim=0, contNao=0, contPessoas=0, contSimHom=0, contNaoMul=0;
		float porMulNao, porHomSim;
		
		do {
			contPessoas++;
			System.out.println("\nInforme o sexo do usu�rio: \nDigite 1 para MASCULINO. \nDigite 2 para FEMININO.");
			sexoUsu = leia.nextInt();
			System.out.println("\nO usu�rio gostou do produto? \nDigite 1 para SIM. \nDigite 2 para N�O.");
			respostaUsu = leia.nextInt();
			
			switch(respostaUsu) {
			case 1://GOSTOU
				contSim++;
				if(sexoUsu == 1) {//GOSTOU E � HOMEM
					contSimHom++;
				}
				break;
			case 2://N�O GOSTOU
				contNao++;
				if(sexoUsu == 2) {//N�O GOSTOU E � MULHER
					contNaoMul++;
				}
				break;
			}
			
			System.out.println("\nDeseja continuar com a pesquisa? \nDigite 1 para SIM. \nDigite qualquer n�mero para N�O.");
			resp = leia.nextInt();
		}while(resp == 1);
		
		porMulNao = ((contNaoMul*100)/contSim);//CALCULO DE PERCENTUAL
		porHomSim = ((contSimHom*100)/contNao);
		
		System.out.println("\n\nO total de pessoas que responderam sim: "+contSim);
		System.out.println("O total de pessoas que foram entrevistadas: "+ contPessoas);
		System.out.println("A porcentagem de pessoas do sexo feminino que responderam n�o: "+porMulNao+"%");
		System.out.println("A porcentagem de pessoas do sexo masculino que responderam sim: "+porHomSim+"%");

	}

}
