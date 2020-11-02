package exerciciosParte5;

import java.util.Scanner;

import exerciciosParte5Entities.Entities.Rectangle;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.print("Entre com a altura e largura do retângulo:");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("ÁREA = %.2f%n", rect.area());
		System.out.printf("PERIMETRO = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		sc.close();
		
	
	
	
	}

}
