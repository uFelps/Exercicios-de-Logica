package exerciciosLogica;

/*K10-)Desenvolva  um  programa  para  calcular  a  soma  de  todos  
 os  numero  impares  de  0  �  20  e  a multiplica��o de todos os n�meros pares de 0 � 20.*/

public class K10 {

	public static void main(String[] args) {
		int num=1, soma=0; 
		long mult=1;
		
		do {
			if(num % 2 == 0) {//PAR
				mult = (mult*num);// <- O RESULTADO SER� 0, POIS QUALQUER NUMERO MULTIPLICADO POR 0  � O, SE PRECISAR, INICIE A VARIAVEL NUM COM O VALOR 1.
				
			}else{//IMPAR
				soma = (soma+num);
			}
			
			num++;
		}while(num<=20);
		
		System.out.println("SOMA DE TODOS OS N�MEROS IMPARES DE 0 A 20: "+soma);
		System.out.println("\nMULTIPLICA��O DE TODOS OS PARES DE 0 A 20: "+mult);

	}

}
