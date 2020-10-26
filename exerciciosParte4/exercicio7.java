package exerciciosParte4;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		int n;
		System.out.println("Entre com número de linhas: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=1;i<n+1;i++) {
			System.out.print(i+" ");
			System.out.print(i*i+" ");
			System.out.print(i*i*i+"\n");
		}
		
		sc.close();
	}

}
