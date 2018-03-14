package iftm.poo.aula07;
import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int n1;
		int n2;
		System.out.println("Entre com o primeiro número");
		n1 = sc.nextInt();
		System.out.println("Entre com o segundo número");
		n2 = sc.nextInt();
		
		if(n1 % n2 == 0) {
			System.out.println("O primeiro numero é multiplo do segundo.");
		}else {
			System.out.println("O segundo numero nao é multiplo do primeiro.");
		}
	}

}
