package exerciciosParte6;

import java.util.Scanner;

import exerciciosParte6Entities.util;

public class CalculoDeDolares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qtd;
		
		System.out.println("Entre com o valor do D�lar:");
		Scanner sc = new Scanner(System.in);
		util.dolar = sc.nextDouble();
		System.out.printf("Entre com a quantidade de D�lares que quer comprar:");
		qtd = sc.nextInt();
		System.out.printf("Voc� precisa de: %.2f%n", util.conversor(qtd));
		
		
		sc.close();
		
	}

}
