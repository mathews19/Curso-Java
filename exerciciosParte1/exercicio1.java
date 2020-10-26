package exerciciosParte1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,soma;
		System.out.println("Digite dois números");
		Scanner ler = new Scanner(System.in);
		x = ler.nextInt();
		y = ler.nextInt();
		soma = x +y;
		System.out.printf("A soma desses números é de: %d",soma);
		ler.close();
	}

}
