package iftm.poo.aula07;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n1;
		int n2;
		int n3;
		int maior, menor, media, produto;
		
		System.out.println("Entre com o primeiro n�mero");
		n1 = sc.nextInt();
		System.out.println("Entre com o segundo n�mero");
		n2 = sc.nextInt();
		System.out.println("Entre com o terceiro n�mero");
		n3 = sc.nextInt();
		
		if(n1 > n2 & n1 > n3) {
			System.out.println("O primeiro numero � maior.");
		}
		if(n2 > n1 & n2 > n3) {
			System.out.println("O segundo numero � maior.");
		}
		if(n3 > n1 & n3 > n2) {
			System.out.println("O terceiro numero � maior.");
		}
		
		if(n1 < n2 & n1 < n3) {
			System.out.println("O primeiro numero � menor.");
		}
		if(n2 < n1 & n2 < n3) {
			System.out.println("O segundo numero � menor.");
		}
		if(n3 < n1 & n3 < n2) {
			System.out.println("O terceiro numero � menor.");
		}
		
		produto = (n1 * n2) * n3;
		System.out.println("O produto �: " + produto);
		
		media = (produto / 3);
		System.out.println("A media �: " + media);
	}

}
