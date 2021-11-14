package exerciciosLogica;

import java.util.Scanner;

public class D5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("DIGITE O PRIMEIRO VALOR:");
		a = leia.nextInt();
		
		System.out.println("DIGITE O SEGUNDO VALOR: ");
		b = leia.nextInt();
		
		System.out.println("DIGITE O TERCEIRO VALOR:");
		c = leia.nextInt();
		
		if(a > b && b >c){
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		
		} if(a > c && c > b){
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		
		} if (b > a && a > c){
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		
		} if(b > c && c > a){
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		
		} if(c > a && a > b){
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		
		} if(c > b && b > a){
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		
		}				

	}

}
