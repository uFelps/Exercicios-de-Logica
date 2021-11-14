package exerciciosLogica;

import java.util.Scanner;

/*K4-)  Desenvolva  um  programa  para  uma  empresa  fazer  um  pesquisa  de  mercado  
 para  saber  se  as pessoas  gostaram  ou  n�o  de  um  novo  produto  lan�ado  no  mercado.  
 Para  isso,  oprograma  dever� solicitar o sexo do entrevistado e sua resposta (sim ou n�o). 
 O programa dever� realizar a pesquisa at�  que  a  entrada  de  dados  seja  finalizada  atrav�s  
 da  vari�vel  RESP.  Ao  final  o  programa  dever� apresentar os seguintes resultados:
    -O n�mero de pessoas do sexo feminino que responderam sim;
    -O n�mero de pessoas do sexo masculino que responderam n�o;
    -A porcentagem de pessoas do sexo feminino que responderam n�o;
    -A porcentagem de pessoas do sexo masculino que responderam sim;    */

public class K4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int sexoUsu, respostaUsu, resp=1, contSim=0, contNao=0, contSimMul=0, contSimHom=0, contNaoMul=0, contNaoHom=0;
		float porMulNao, porHomSim;
		
		do {
			System.out.println("\n\nInforme o sexo do usu�rio: \nDigite 1 para MASCULINO. \nDigite 2 para FEMININO.");
			sexoUsu = leia.nextInt();
			System.out.println("\nO usu�rio gostou do produto? \nDigite 1 para SIM. \nDigite 2 para N�O.");
			respostaUsu = leia.nextInt();
			
			switch(respostaUsu) {
			case 1://GOSTOU
				contSim++;
				if(sexoUsu ==1) {//GOSTOU / HOMEM
					contSimHom++;
					
				} else if(sexoUsu == 2) {//GOSTOU / MULHER
					contSimMul++;
				}
			
			break;
				
			case 2://N�O GOSTOU
				contNao++;
				if(sexoUsu == 1) {//N�O GOSTOU / HOMEM
					contNaoHom++;
					
				}else if(sexoUsu == 2) {//N�O GOSTOU / MULHER
					contNaoMul++;
				}
				break;
			}
			
			System.out.println("\nDeseja continuar a pesquisa? \nDigite 1 para SIM. \nDigite qualquer n�mero para N�O.");
			resp = leia.nextInt();
		}while(resp==1);
		
		porMulNao = ((contNaoMul*100)/contNao);
		porHomSim = ((contSimHom*100)/contSim);
		
		System.out.println("\n\nO n�mero de pessoas do sexo feminino que responderam sim: "+contSimMul);
		System.out.println("O n�mero de pessoas do sexo masculino que responderam n�o: "+contNaoHom);
		System.out.println("A porcentagem de pessoas do sexo feminino que responderam n�o: "+porMulNao+"%");
		System.out.println("A porcentagem de pessoas do sexo masculino que responderam sim: "+porHomSim+"%");
		
		

	}

}
