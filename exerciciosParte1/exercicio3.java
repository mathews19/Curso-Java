package exerciciosParte1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		int A ,B , C , D , r;
		 
		System.out.println("Digite quatro valores: ");
		Scanner ler = new Scanner(System.in);
		A = ler.nextInt();
		B = ler.nextInt();
		C = ler.nextInt();
		D = ler.nextInt();
		
		r = (A*B)-(C*D);
		System.out.printf("O resultado é de: %d", r);
		ler.close();

	}

}
