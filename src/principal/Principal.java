package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* Isto é um comentário */
		// Isto também é.
		
		int val1, val2, total;
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		val1 = sc.nextInt();
		System.out.println("Digite outro valor: ");
		val2 = sc.nextInt();
		
		total = val1 + val2;
		
		System.out.println("A soma é: " + total);
		
		sc.close();
	}
}
