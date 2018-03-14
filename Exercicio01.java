package iftm.poo.aula07;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n1;
		int n2;
		int n3;
		int maior, menor, media, produto;
		
		System.out.println("Entre com o primeiro número");
		n1 = sc.nextInt();
		System.out.println("Entre com o segundo número");
		n2 = sc.nextInt();
		System.out.println("Entre com o terceiro número");
		n3 = sc.nextInt();
		
		if(n1 > n2 & n1 > n3) {
			System.out.println("O primeiro numero é maior.");
		}
		if(n2 > n1 & n2 > n3) {
			System.out.println("O segundo numero é maior.");
		}
		if(n3 > n1 & n3 > n2) {
			System.out.println("O terceiro numero é maior.");
		}
		
		if(n1 < n2 & n1 < n3) {
			System.out.println("O primeiro numero é menor.");
		}
		if(n2 < n1 & n2 < n3) {
			System.out.println("O segundo numero é menor.");
		}
		if(n3 < n1 & n3 < n2) {
			System.out.println("O terceiro numero é menor.");
		}
		
		produto = (n1 * n2) * n3;
		System.out.println("O produto é: " + produto);
		
		media = (produto / 3);
		System.out.println("A media é: " + media);
	}

}
