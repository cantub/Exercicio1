package iftm.poo.aula07;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int raio;
		float diametro;
		float area;
		float circunferencia;
		
		System.out.println("Digite o valor do raio: ");
		raio = sc.nextInt();
		
		System.out.println("O seu diametro �: " +(2 * raio));
		System.out.println("A area �: " + (Math.PI *raio*raio));
		System.out.println("A circunferencia �: " + (2  * raio * Math.PI));
		
	}

}
