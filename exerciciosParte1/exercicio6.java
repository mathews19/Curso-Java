package exerciciosParte1;

import java.util.Scanner;

public class exercicio6 {
	
 
	public static void main(String[] args) {
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite três números :");
		
		A = ler.nextDouble();
		B = ler.nextDouble();
		C = ler.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		ler.close();
	}

}
