package exerciciosParte1;
import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		double raio,area;
		System.out.println("Digite o raio da circufer�ncia ");
		Scanner ler = new Scanner(System.in);
		raio = ler.nextDouble();
		area = Math.PI*Math.pow(raio, 2);
		System.out.printf("A �rea da circunfer�ncia � de: %.4f",area);
		ler.close();
	}

}
