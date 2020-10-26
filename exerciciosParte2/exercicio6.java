package exerciciosParte2;

import java.util.Scanner;

public class exercicio6 {
	
	public static void main(String[] args) {
		int num;
		System.out.println("Entre com um valor ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num>=0 && num<=25) {
			System.out.println("Dentro do intervalo [0,25] ");
		}else {
			if(num>25 && num<=50) {
				System.out.println("Dentro do intervalo ]25,50] ");
		}else {
			if(num>50 && num<=75) {
				System.out.println("Dentro do intervalo ]50,75] ");
		}else {
			if(num>75 && num<=100) {
				System.out.println("Dentro do intervalo ]75,100] ");
		}else {
			System.out.println("Fora do intervalo !!!");
		}}}}sc.close();
		}}	
