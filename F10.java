package exerciciosLogica;

import java.util.Scanner;

public class F10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c, d, e, maior =0, menor=0;
		
		System.out.println("Digite o primeiro n�mero:");
		a = leia.nextInt();
		System.out.println("Digite o segundo n�mero:");
		b = leia.nextInt();
		System.out.println("Digite o terceiro n�mero:");
		c = leia.nextInt();
		System.out.println("Digite o quarto n�mero:");
		d = leia.nextInt();
		System.out.println("Digite o quinto n�mero:");
		e = leia.nextInt();
		
		//a
		if((a >= b)&&(a >= c)&&(a >= d)&&(a >= e)){
			maior = a;
			
		} else if((a <= b)&&(a <= c)&&(a <= d)&&(a <= e)){
			menor = a;
		} 
		
		//b
		if((b >= a)&&(b >= c)&&(b >= d)&&(b >=  e)){
			maior = b;
		
		} else if((b <= a)&&(b <= c)&&(b <= d)&&(b <=  e)){
			menor = b;
		}
		
		//c
		if((c >= a)&&(c >= b)&&(c >= d)&&(c >= e)){
			maior = c;
		
		} else if((c <= a)&&(c <= b)&&(c <= d)&&(c <= e)){
			menor = c;
		}
		
		//d
		if((d >= a)&&(d >= b)&&(d >= c)&&(d >= e)){
			maior = d;
		
		} else if((d <= a)&&(d <= b)&&(d <= c)&&(d <= e)){
			menor = d;
		}
		
		//e
		if((e >= a)&&(e >= b)&&(e >= c)&&(e >= d)){
			maior = e;
		
		} else if((e <= a)&&(e <= b)&&(e <= c)&&(e <= d)){
			menor = e;
		}
		
		System.out.println("\nO MAIOR n�mero entre os digitados �: "+maior);
		System.out.println("O MENOR n�mero entre os digitados �: "+menor);
		
		

	}

}
