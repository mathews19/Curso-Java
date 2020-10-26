package exerciciosParte3;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int x,y;
		System.out.println("Entre com os valores de X e Y: ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x!= 0 && y !=0) {
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
			
			x = sc.nextInt();
			y = sc.nextInt();
			}
		
		sc.close();
	}
	}

