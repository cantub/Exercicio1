package iftm.poo.aula07;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int [12];
		float menor = 0;
		float maior = 0;
		
		for(int i = 0; i < 12; i++) {
			System.out.println("Digite um numero: ");
			a[i] = sc.nextInt();
			if(a[i] < 8) {
				menor ++;
			}
				if(a[i] > 10) 
				{
					maior ++;
				}
		}
		System.out.println("Porcentagem de numeros menores que 8: " + (menor / 12)*100);
		System.out.println("Porcentagem de numeros maiores que 10: " + (maior / 12)*100);
		
	}

}