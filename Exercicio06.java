package iftm.poo.aula07;
import java.util.Scanner;

public class Exercicio06 {
	public static void sec(char[][] matriz, int linha, int coluna) {

		int i;
		int j;
		
		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++) {
				if (i + j != linha - 1) {
					System.out.print("[" + matriz[i][j] + "]");
				} else {
					System.out.print("[ ]");
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int i;
		int j;
		char[][] matriz = new char[10][10];
		int linha = matriz.length;
		int coluna = matriz[0].length;

		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++) {
				System.out.println("Insira o elemento: [" + i + "][" + j + "]");
				matriz[i][j] = scanner.next().charAt(0);
			}
		}
		sec(matriz, linha, coluna);

	}
}