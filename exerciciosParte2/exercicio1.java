package exerciciosParte2;

import java.util.Scanner;

public class exercicio1 {

	

	public static void main(String[] args) {
		
		int numero    ;
		System.out.println("Entre com um número: ");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		if( numero<0) {
			System.out.println("negativo");
		}else {
			System.out.println("não negativo");
		}
		
		
		
		
		
		sc.close();
	}

}
