package exerciciosLogica;

import java.util.Scanner;

/*J2-)  Desenvolva  um  programa  para  ler  um  n�mero  e  
escrever  todos  os  n�meros  de  0  at�  este n�mero, indicando se cada um � par ou �mpar.*/

public class J2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numUsu, v=0;
		
		System.out.print("Digite um n�mero:");
		numUsu = leia.nextInt();
		
		while(v<=numUsu) {
			
			if(v % 2 == 0) {//PAR
				System.out.println(v + " - PAR");
			}else {//IMPAR
				System.out.println(v + " - IMPAR");
			}
			v++;
			
		}
		

	}

}
