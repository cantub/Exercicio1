package iftm.poo.aula07;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a;

		System.out.println("Digite um caractere: ");
		a = sc.next().charAt(0);
		sc.close();

		System.out.println("O codigo do caracter " + a + " é: " + (int) a);

	}

}