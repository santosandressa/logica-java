package variaveiseconstantes;

import java.util.Scanner;

public class ValorEQuantidade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.println("Digite a quantidade do produto");
		Integer quantidade = scanner.nextInt();
		Double desconto = 0.0;
		Double novoValor = 0.0;
		
		if(quantidade >= 10) {
			desconto = 10.0;
			novoValor = ((valorProduto * quantidade) * desconto) / 100;
		}
		
		Double valorTotal = (valorProduto * quantidade) - novoValor;
		
		System.out.println("O produto é de R$: " + valorTotal);
			
		scanner.close();
	}
}