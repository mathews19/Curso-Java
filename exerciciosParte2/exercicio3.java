package exerciciosParte2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Entre com dois n�meros");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if(a%b==0 || b%a==0) {
			System.out.println("s�o m�ltiplos");
		}else {
			System.out.println(" n�o s�o m�ltiplos");
		}
		
		
		sc.close();

	}

}
