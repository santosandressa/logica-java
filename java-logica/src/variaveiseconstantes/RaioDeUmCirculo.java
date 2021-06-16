package variaveiseconstantes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RaioDeUmCirculo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimal= new DecimalFormat("0.00");
		
		System.out.println("Digite o raio de um c�rculo: ");
		Double raio = scanner.nextDouble();
		
		Double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A �rea da circufer�ncia �: " + decimal.format(area));
		
		scanner.close();
	}
}
