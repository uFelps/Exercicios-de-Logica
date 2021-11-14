package exerciciosLogica;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double t, v, l, d, g;
		
		System.out.println("ESCREVA O TEMPO GASTO NA VIAGEM EM HORAS:");
        t = leia.nextFloat();
        
        System.out.println("ESCREVA A VELOCIDADE MÉDIA DA VIAGEM EM KM/H:");
        v = leia.nextFloat();
        
        System.out.println("QUANTOS KM O SEU CARRO RODA POR LITRO?");
        l = leia.nextFloat();
        
        d = (t*v);
        g = (d/l);
        
        System.out.println("NA SUA VIAGEM VOCÊ GASTOU: "+g+" LITROS DE COMBUSTIVEL");
        
        
	}

}
