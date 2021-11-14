package exerciciosLogica;

import java.util.Scanner;

/*J2-)  Desenvolva  um  programa  para  ler  um  número  e  
escrever  todos  os  números  de  0  até  este número, indicando se cada um é par ou ímpar.*/

public class J2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numUsu, v=0;
		
		System.out.print("Digite um número:");
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
