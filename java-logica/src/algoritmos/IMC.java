package algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		DecimalFormat decimal= new DecimalFormat("0.00");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a sua altura: ");
		Double altura= scanner.nextDouble();
		
		System.out.print("Digite o seu peso: ");
		Double peso = scanner.nextDouble();
		
		Double resultado = peso / (altura * altura);
		
		System.out.println("Seu IMC é: " + decimal.format(resultado));
		
		scanner.close();
	}
}