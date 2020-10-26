package exerciciosParte2;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		double x,y;
		System.out.println("Entre com os valores das coordenadas");
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		y = sc.nextDouble();
		if(x==0 && y==0) {
			System.out.println("Origem");
		}else {
			if(x>0 && y>0) {
				System.out.println("1° quadrante");
			}else {
				if(x<0 && y>0) {
					System.out.println("2° quadrante");
				}else {
					if(x<0 && y<0) {
						System.out.println("3°quadrante");
					}else {
						if(x>0 && y<0) {
							System.out.println("4° quadrante");
						}
					}
				}
			}
		}sc.close();
	}

}
