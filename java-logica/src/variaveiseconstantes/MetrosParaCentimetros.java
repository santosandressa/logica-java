package variaveiseconstantes;

import java.util.Scanner;

public class MetrosParaCentimetros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final Integer metro = 100;
		
		System.out.println("Digite o metro: ");
		Double metroInformado= scanner.nextDouble();
		
		Double centimetrosConversao = metroInformado * metro;
		
		System.out.println(metroInformado +" em centímetros é : " + centimetrosConversao + "cm");
		
		scanner.close();
	}
}