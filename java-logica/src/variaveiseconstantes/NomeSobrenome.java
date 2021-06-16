package variaveiseconstantes;

import java.util.Scanner;

public class NomeSobrenome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu primeiro nome: ");
		String primeiroNome = scanner.nextLine();
		
		System.out.print("agora digite seu sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		System.out.println("Olá " + primeiroNome + " " + sobrenome);
		scanner.close();
	}
}