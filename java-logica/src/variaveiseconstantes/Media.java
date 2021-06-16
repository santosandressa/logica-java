package variaveiseconstantes;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota do 1º Bimestre: ");
		Double nota1 = scanner.nextDouble();
		
		System.out.print("Digite a nota do 2º Bimestre: ");
		Double nota2 = scanner.nextDouble();
		
		System.out.print("Digite a nota do 3º Bimestre: ");
		Double nota3 = scanner.nextDouble();
		
		System.out.print("Digite a nota do 4º Bimestre: ");
		Double nota4 = scanner.nextDouble();
		
		Double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Sua média é: " + media);
		
		scanner.close();
	}
}