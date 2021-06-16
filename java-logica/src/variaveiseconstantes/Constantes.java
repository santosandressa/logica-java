package variaveiseconstantes;

import java.util.Scanner;

public class Constantes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Criando constante 
		final Integer idadeMinima = 18;
		
		System.out.print("Idade: ");
		Integer idade= scanner.nextInt();
		
		Boolean podeTirarCarteira = idade >= idadeMinima;
		
		if(podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar a carteira.");
		} else {
			System.out.println("Não! Ele(a) não pode tirar a carteira");
		}
		
		scanner.close();
	}
}