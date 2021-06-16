package variaveiseconstantes;

import java.util.Scanner;

public class NumeroAoQuadrado {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		Long numero = scanner.nextLong();

		Long resultado = numero * numero;

		System.out.println("O quadrado de " + numero + " é : " + resultado);

		scanner.close();
	}
}