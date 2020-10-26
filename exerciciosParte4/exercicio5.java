package exerciciosParte4;

import java.util.Scanner;

public class exercicio5 {
public static void main(String[] args) {
	
	int n, f=1 ;
	System.out.println("Entre com um valor n");
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	for(int i=1;i<n+1;i++) {
		f = f*i;
}
	System.out.printf("Ofatorial de %d é %d",n,f);
	sc.close();
}
}
