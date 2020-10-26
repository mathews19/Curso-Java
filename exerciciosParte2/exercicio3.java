package exerciciosParte2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Entre com dois números");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if(a%b==0 || b%a==0) {
			System.out.println("são múltiplos");
		}else {
			System.out.println(" não são múltiplos");
		}
		
		
		sc.close();

	}

}
