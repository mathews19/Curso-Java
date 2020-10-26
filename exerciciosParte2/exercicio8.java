
package exerciciosParte2;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		double salario,imposto;
		System.out.println("Olá cidadão de Rosbum digite o valo de seu sálario");
		Scanner sc = new Scanner(System.in);
		salario = sc.nextDouble();
		
		if(salario<0) {
			System.out.println("digite um sálario válido");
		}else if(salario>=0 && salario<=2000.00) {
				System.out.println("Você é isento de imposto de renda");
			}else if(salario>2000.00 && salario<=3000.00) {
					imposto = (salario-2000)*(8/100);
					System.out.printf("Seu imposto é no valor de %.2f", imposto);
				}else if(salario>3.000 && salario<=4500.00) {
						imposto = 80 + (salario-3000)*0.18;
						System.out.printf("Seu imposto é no valor de %.2f", imposto);
					}else if(salario>4500.00) {
							imposto = 350 + (salario-4500)*0.28;
							System.out.printf("Seu imposto é no valor de %.2f", imposto);
						}
		sc.close();
	}

}
